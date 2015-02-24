package com.rantop.web.entity;

import java.util.Date;

/**
 * 
 * class of thread, user's vote or user's comment
 * 
 * @author yeziran
 *
 */
public class Thread {
	
	private String id;
	
	private String parentId;
	
	private String label;

	private String content;
	
	private String key;

	private String createMan;
	
	private Date createDate;
	
	private String updateMan;
	
	private Date updateDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * return an ID of parent Thread if this Thread as a follower
	 * @return String
	 */
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	/**
	 * lable of the choice radio
	 * @return String
	 */
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * content from user
	 * @return String 
	 */
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * phone_id + phone_id, connect two phones' id as a key of Thread
	 * @return String
	 */
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	/**
	 * create man
	 * @return String
	 */
	public String getCreateMan() {
		return createMan;
	}

	public void setCreateMan(String createMan) {
		this.createMan = createMan;
	}
	
	/**
	 * date of create
	 * @return Date
	 */
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateMan() {
		return updateMan;
	}

	public void setUpdateMan(String updateMan) {
		this.updateMan = updateMan;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
