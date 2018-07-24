package com.gaoshuhang.domain;

import java.io.Serializable;

public class Item implements Serializable
{
	// TODO: 18-7-24 尚需根据需求进行修改
	private String itemId;
	private String itemName;
	private Category category;

	public String getItemId()
	{
		return itemId;
	}

	public void setItemId(String itemId)
	{
		this.itemId = itemId;
	}

	public String getItemName()
	{
		return itemName;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}
}
