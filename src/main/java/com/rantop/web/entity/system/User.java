package com.rantop.web.entity.system;

import java.util.Date;

/**
 * 
 * class of system users
 * 
 * @author yeziran
 *
 */
public class User {
	
	private String id;
	
	private String userName;
	
	private String password;
	
	private Date createDate;
	
	private String createMan;
	
	private Date updateDate;
	
	private String updateMan;
	
	private Role role;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return String
	 */
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateMan() {
		return createMan;
	}

	public void setCreateMan(String createMan) {
		this.createMan = createMan;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateMan() {
		return updateMan;
	}

	public void setUpdateMan(String updateMan) {
		this.updateMan = updateMan;
	}

	/**
	 * a role as a user
	 * @return <code>Role</code>
	 * 
	 * @see com.rantop.web.entity.system.Role
	 */
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
