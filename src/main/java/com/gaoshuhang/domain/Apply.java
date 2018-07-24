package com.gaoshuhang.domain;

import java.io.Serializable;
import java.util.Date;

public class Apply implements Serializable
{
	private Long applyId;
	private Inventory inventory;
	private User user;
	private Date createTime;
	private Integer requireNum;

	public Long getApplyId()
	{
		return applyId;
	}

	public void setApplyId(Long applyId)
	{
		this.applyId = applyId;
	}

	public Inventory getInventory()
	{
		return inventory;
	}

	public void setInventory(Inventory inventory)
	{
		this.inventory = inventory;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public Date getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}

	public Integer getRequireNum()
	{
		return requireNum;
	}

	public void setRequireNum(Integer requireNum)
	{
		this.requireNum = requireNum;
	}
}
