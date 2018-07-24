package com.gaoshuhang.domain;

import java.io.Serializable;
import java.util.Set;

public class Category implements Serializable
{
	private Long CategoryId;
	private String CategoryName;
	private Set<Item> itemSet;

	public Long getCategoryId()
	{
		return CategoryId;
	}

	public void setCategoryId(Long categoryId)
	{
		CategoryId = categoryId;
	}

	public String getCategoryName()
	{
		return CategoryName;
	}

	public void setCategoryName(String categoryName)
	{
		CategoryName = categoryName;
	}

	public Set<Item> getItemSet()
	{
		return itemSet;
	}

	public void setItemSet(Set<Item> itemSet)
	{
		this.itemSet = itemSet;
	}
}
