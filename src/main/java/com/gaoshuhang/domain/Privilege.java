package com.gaoshuhang.domain;

import java.io.Serializable;

public class Privilege implements Serializable
{
	private Long privilegeId;
	private String privilegeName;

	public Long getPrivilegeId()
	{
		return privilegeId;
	}

	public void setPrivilegeId(Long privilegeId)
	{
		this.privilegeId = privilegeId;
	}

	public String getPrivilegeName()
	{
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName)
	{
		this.privilegeName = privilegeName;
	}
}
