package com.yogesh.service;

import com.yogesh.domain.User;

public class UserServiceImpl implements UserService {

	@Override
	public void add(User user) {
		//Persist the user object here. 
		System.out.println("User added successfully");

	}

}