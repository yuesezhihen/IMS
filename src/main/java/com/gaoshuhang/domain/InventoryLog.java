package com.gaoshuhang.domain;

import javax.xml.crypto.Data;
import java.io.Serializable;

public class InventoryLog implements Serializable
{
	private Long logId;
	private String itemName;
	private Item item;
	private Integer requireNum;
	private String userName;
	private User user;
	private Data logTime;
	private String opType;
	private String status;

	public Long getLogId()
	{
		return logId;
	}

	public void setLogId(Long logId)
	{
		this.logId = logId;
	}

	public String getItemName()
	{
		return itemName;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public Item getItem()
	{
		return item;
	}

	public void setItem(Item item)
	{
		this.item = item;
	}

	public Integer getRequireNum()
	{
		return requireNum;
	}

	public void setRequireNum(Integer requireNum)
	{
		this.requireNum = requireNum;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public Data getLogTime()
	{
		return logTime;
	}

	public void setLogTime(Data logTime)
	{
		this.logTime = logTime;
	}

	public String getOpType()
	{
		return opType;
	}

	public void setOpType(String opType)
	{
		this.opType = opType;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}
}
