package com.Group18.onlineshop.service;

import java.util.List;

import com.Group18.onlineshop.model.Customer;

public interface CustomerService {

	public void addCustomer(Customer customer);
	public Customer findCustomerByUsername(String username);
	
	List<Customer> getAllCustomers();
	
	public Customer getCustomerBycustomerId(long customerId);
	
	Customer findCustomerByusernameAndpassword(String username,String password);
}
