package com.gaoshuhang.domain;

import java.io.Serializable;

public class Inventory implements Serializable
{
	private Long inventoryId;
	private Item item;
	private Integer itemNum;

	public Long getInventoryId()
	{
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId)
	{
		this.inventoryId = inventoryId;
	}

	public Item getItem()
	{
		return item;
	}

	public void setItem(Item item)
	{
		this.item = item;
	}

	public Integer getItemNum()
	{
		return itemNum;
	}

	public void setItemNum(Integer itemNum)
	{
		this.itemNum = itemNum;
	}
}
