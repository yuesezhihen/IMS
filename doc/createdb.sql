DROP DATABASE IF EXISTS ims;
CREATE DATABASE ims;
USE ims;
CREATE TABLE t_role (
	role_id   BIGINT AUTO_INCREMENT,
	role_name VARCHAR(255) NOT NULL UNIQUE,
	PRIMARY KEY (role_id)
);
CREATE TABLE t_user (
	user_id  BIGINT AUTO_INCREMENT,
	username VARCHAR(255) NOT NULL UNIQUE,
	password VARCHAR(255) NOT NULL,
	role_id BIGINT NOT NULL,
	PRIMARY KEY (user_id),
	FOREIGN KEY (role_id) REFERENCES t_role (role_id)
);
CREATE TABLE t_privilege (
	privilege_id   BIGINT AUTO_INCREMENT,
	privilege_name VARCHAR(255) NOT NULL UNIQUE,
	PRIMARY KEY (privilege_id)
);
CREATE TABLE t_role_privilege (
	role_privilege_id BIGINT AUTO_INCREMENT,
	role_id           BIGINT NOT NULL,
	privilege_id      BIGINT NOT NULL,
	PRIMARY KEY (role_privilege_id),
	FOREIGN KEY (role_id) REFERENCES t_role (role_id) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (privilege_id) REFERENCES t_privilege (privilege_id) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE t_category (
	category_id   BIGINT AUTO_INCREMENT,
	category_name VARCHAR(255) NOT NULL UNIQUE,
	PRIMARY KEY (category_id)
);
CREATE TABLE t_item (
	item_id     VARCHAR(255) NOT NULL UNIQUE,
	item_name   VARCHAR(255) NOT NULL UNIQUE,
	category_id BIGINT NOT NULL,
	PRIMARY KEY (item_id),
	FOREIGN KEY (category_id) REFERENCES t_category (category_id) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE t_inventory (
	inventory_id BIGINT AUTO_INCREMENT,
	item_id      VARCHAR(255) NOT NULL UNIQUE,
	item_num     int NOT NULL ,
	PRIMARY KEY (inventory_id),
	FOREIGN KEY (item_id) REFERENCES t_item (item_id) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE t_apply (
	apply_id     BIGINT AUTO_INCREMENT,
	inventory_id BIGINT NOT NULL,
	user_id      BIGINT NOT NULL,
	create_time  DATETIME NOT NULL,
	require_num  INT NOT NULL,
	PRIMARY KEY (apply_id),
	FOREIGN KEY (inventory_id) REFERENCES t_inventory (inventory_id) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (user_id) REFERENCES t_user (user_id) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE t_inventory_log (
	log_id   BIGINT AUTO_INCREMENT,
	item_id  VARCHAR(255) NOT NULL,
	item_name VARCHAR(255) NOT NULL,
	item_num INT NOT NULL,
	user_id  BIGINT NOT NULL,
	username VARCHAR(255) NOT NULL,
	log_time DATETIME NOT NULL,
	op_type  VARCHAR(255) NOT NULL,
	status   VARCHAR(255) NOT NULL,
	PRIMARY KEY (log_id),
	FOREIGN KEY (item_id) REFERENCES t_item (item_id) ON UPDATE CASCADE,
	FOREIGN KEY (user_id) REFERENCES t_user (user_id) ON UPDATE CASCADE
);
