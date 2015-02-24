package com.rantop.web.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.GenericGenerator;

import com.rantop.web.Constants;


/**
 * 统一定义id的entity基类.
 * 
 * 基类统一定义id的属性名称、数据类型、列名映射及生成策略.
 * 子类可重载getId()函数重定义id的列名映射和生成策略.
 * 
 * @author calvin
 */
//JPA 基类的标识
@MappedSuperclass 
public abstract class IdEntity {

	protected String id;
	
	protected Date createDate;	//创建时间
	
	protected String delFlag;	//删除标记

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 48, name="OID", unique = true)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (StringUtils.isEmpty(id)) {
			this.id = null;
			this.createDate = new Date(System.currentTimeMillis());
			this.delFlag = Constants.DELFLAG_STR_IN;
		} else {
			this.id = id;
		}
	}

	@Column(nullable = false,updatable = false,name="CREATE_DATE")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(nullable = false,columnDefinition = "varchar2(1) default '0'",name="DELFLAG")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}
