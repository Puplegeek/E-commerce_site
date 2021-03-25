package com.Group18.onlineshop.dao;

import java.util.List;

import com.Group18.onlineshop.model.PersistentLogin;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface RememberMeTokenRepository extends CrudRepository<PersistentLogin, Long> {

	PersistentLogin findBySeries(String series);
	List<PersistentLogin> findByUsername(String username);

}
