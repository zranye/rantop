package com.rantop.web.entity;

import java.util.Date;

public class Phone {
	
	private String id;
	
	private String brand;
	
	private String series;
	
	private String model;
	
	private String level;
	
	private Date marketTime;
	
	private String status;
	
	private String flag;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * brand of phone
	 * @return <code>String</code>
	 */
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * series of phone
	 * 
	 * note: not all brand of phones have series
	 * 
	 * @return String
	 */
	public String getSeries() {
		return series;
	}
	
	public void setSeries(String series) {
		this.series = series;
	}
	
	/**
	 * 
	 * @return String
	 */
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * 
	 * level, daily task by procedure on database, will partition all phones by <code>PhoneLevel</code>
	 * and <code>PhoneLevelDetail</code>
	 * 
	 * 
	 * @return String
	 */
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
	/**
	 * time to market
	 * @return
	 */
	public Date getMarketTime() {
		return marketTime;
	}
	
	public void setMarketTime(Date marketTime) {
		this.marketTime = marketTime;
	}
	
	/**
	 * status of phone, 0, not listed yet, 1, on listed, 2, off listed
	 * @return
	 */
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * 1, effected, 0, uneffected 
	 * @return
	 */
	public String getFlag() {
		return flag;
	}
	
	public void setFlag(String flag) {
		this.flag = flag;
	}
}
