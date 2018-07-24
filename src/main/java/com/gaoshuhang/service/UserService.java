package com.gaoshuhang.service;

import com.gaoshuhang.domain.User;

public interface UserService
{
	/**
	 * 用户登录
	 * @param username 用户名
	 * @param password 用户密码（尚未hash）
	 * @return 用户对象
	 */
	public User UserLogin(String username, String password);

	/**
	 * 用户登出
	 * @param UserId 用户ID
	 */
	public void UserLogout(Long UserId);

	/**
	 * 更新用户信息
	 * @param userId 用户ID
	 * @param user 包含新用户信息的对象，userId字段忽略
	 */
	public void updateUserInfo(Long userId, User user);
}
