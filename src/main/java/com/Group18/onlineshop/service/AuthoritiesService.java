package com.Group18.onlineshop.service;

import com.Group18.onlineshop.model.Authorities;

public interface AuthoritiesService {

	public void addAuthorities(Authorities authorities);
	
	Authorities findAuthoritiesByusername(String username);
}
