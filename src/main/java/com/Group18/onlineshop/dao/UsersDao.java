package com.Group18.onlineshop.dao;

import com.Group18.onlineshop.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsersDao extends CrudRepository<Users, Long>{

	Users findUserByusername(String username);
}
