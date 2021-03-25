package com.Group18.onlineshop.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Group18.onlineshop.dao.UsersDao;
import com.Group18.onlineshop.model.Users;
import com.Group18.onlineshop.service.UsersService;

@Service

public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDao usersDao;
	
	@Transactional()
	@Override
	public void addUsers(Users users) {
		
		usersDao.save(users);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Users findUserByusername(String username) {
		
		return usersDao.findUserByusername(username);
	}

}
