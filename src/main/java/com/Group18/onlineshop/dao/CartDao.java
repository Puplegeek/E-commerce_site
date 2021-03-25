package com.Group18.onlineshop.dao;

import com.Group18.onlineshop.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CartDao extends CrudRepository<Cart, Long> {

	Cart findUserBycartId(long cartId);
}
