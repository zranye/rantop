package com.rantop.web.entity;

import java.util.Date;

public class Vote {
	
	private String id;
	
	private String userId;
	
	private String threadId;
	
	private String remark;
	
	private Date voteDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * vote user's id
	 * @return String
	 */
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * effected Thread id
	 * @return String
	 */
	public String getThreadId() {
		return threadId;
	}
	
	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}
	
	/**
	 * why user vote
	 * @return String
	 */
	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * date of vote
	 * @return Date
	 */
	public Date getVoteDate() {
		return voteDate;
	}
	
	public void setVoteDate(Date voteDate) {
		this.voteDate = voteDate;
	}
	
}
