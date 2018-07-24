package com.gaoshuhang.service;

import com.gaoshuhang.domain.Apply;
import com.gaoshuhang.domain.Category;
import com.gaoshuhang.domain.Item;

import java.util.Set;

public interface StorageService
{
	/**
	 * 根据物品类别查询所有物品
	 * @return 所有物品集合
	 */
	public Set<Category> queryAllItemsByCategory();

	/**
	 * 插入物品类别定义
	 * @param category 物品类别对象
	 */
	public void insertCategoryDefinition(Category category);

	/**
	 * 删除物品类别定义
	 * @param categoryId 物品类别ID
	 */
	public void deleteCategoryDefinition(Long categoryId);

	/**
	 * 插入物品定义
	 * @param item 物品对象
	 */
	public void insertItemDefinition(Item item);

	/**
	 * 删除物品定义
	 * @param itemId 物品ID
	 */
	public void deleteItemDefinition(Long itemId);

	/**
	 * 入库
	 * @param userId 操作员ID
	 * @param itemId 物品ID
	 * @param num 数量
	 */
	public void inputStorage(Long userId, String itemId, int num);

	/**
	 * 出库申请
	 * @param userId 操作员ID
	 * @param itemId 物品ID
	 * @param num 数量
	 */
	public void makeOutputStorageApply(Long userId, String itemId, int num);

	/**
	 * 查询所有出库申请
	 * @return 所有出库申请集合
	 */
	public Set<Apply> queryAllApply();

	/**
	 * 确认出库申请
	 * @param applyId 申请ID
	 */
	public void confirmOutputStorage(Long applyId);

	// TODO: 18-7-24 纸质表格Word模板导出
}
