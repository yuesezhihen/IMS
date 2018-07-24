package com.gaoshuhang.domain;

import java.io.Serializable;
import java.util.Set;

public class Role implements Serializable
{
	private Long roleId;
	private String roleName;
	private Set<Privilege> privilegeSet;

	public Long getRoleId()
	{
		return roleId;
	}

	public void setRoleId(Long roleId)
	{
		this.roleId = roleId;
	}

	public String getRoleName()
	{
		return roleName;
	}

	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
	}

	public Set<Privilege> getPrivilegeSet()
	{
		return privilegeSet;
	}

	public void setPrivilegeSet(Set<Privilege> privilegeSet)
	{
		this.privilegeSet = privilegeSet;
	}
}
