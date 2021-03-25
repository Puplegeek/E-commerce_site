package com.Group18.onlineshop.dao;

import com.Group18.onlineshop.model.Cart;
import com.Group18.onlineshop.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerOrderDao extends CrudRepository<CustomerOrder, Long>{

	CustomerOrder getCustomerOrderBycart(Cart cart);
}
