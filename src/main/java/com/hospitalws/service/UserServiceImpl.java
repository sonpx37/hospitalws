package com.hospitalws.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hospitalws.dao.UserDao;
import com.hospitalws.model.User;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	public void saveUser(User u) {
		userDao.saveUser(u);		
	}

}
