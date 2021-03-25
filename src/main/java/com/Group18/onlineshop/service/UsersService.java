package com.Group18.onlineshop.service;

import com.Group18.onlineshop.model.Users;

public interface UsersService {

	public void addUsers(Users users);
	
	Users findUserByusername(String username);
}
