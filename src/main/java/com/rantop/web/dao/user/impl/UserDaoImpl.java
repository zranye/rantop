package com.rantop.web.dao.user.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.rantop.web.dao.user.UserDao;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	private DataSource dataSource;
	
}
