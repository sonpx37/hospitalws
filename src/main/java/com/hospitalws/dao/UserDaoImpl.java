package com.hospitalws.dao;

import org.springframework.stereotype.Repository;

import com.hospitalws.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {

	public void saveUser(User u) {
		persist(u);
		
	}

}
