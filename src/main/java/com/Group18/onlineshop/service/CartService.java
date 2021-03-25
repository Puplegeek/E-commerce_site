package com.Group18.onlineshop.service;

import java.io.IOException;

import com.Group18.onlineshop.model.Cart;

public interface CartService {

	public void addCart(Cart cart);
	
	public Cart getCartById(long cartId);

	Cart validateCustomer(long cartId) throws IOException;
}
