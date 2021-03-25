package com.Group18.onlineshop.dao;

import com.Group18.onlineshop.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerDao extends CrudRepository<Customer, Long>{

	Customer findUserByusername(String username);
	
	Customer findCustomerByUsernameAndPassword(String username,String password);
	
}
