package com.Group18.onlineshop.dao;

import com.Group18.onlineshop.model.Authorities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AuthoritiesDao extends CrudRepository<Authorities, Long>{

	Authorities findAuthoritiesByusername(String username);
}
