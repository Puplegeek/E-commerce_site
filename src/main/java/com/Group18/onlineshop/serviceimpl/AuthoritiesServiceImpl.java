package com.Group18.onlineshop.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Group18.onlineshop.dao.AuthoritiesDao;
import com.Group18.onlineshop.model.Authorities;
import com.Group18.onlineshop.service.AuthoritiesService;

@Service

public class AuthoritiesServiceImpl implements AuthoritiesService{

	@Autowired
	private AuthoritiesDao authoritiesDao;
	
	@Transactional()
	@Override
	public void addAuthorities(Authorities authorities) {
		
		authoritiesDao.save(authorities);
	}
	@Transactional(readOnly = true)
	@Override
	public Authorities findAuthoritiesByusername(String username) {
		
		return authoritiesDao.findAuthoritiesByusername(username);
	}

}
