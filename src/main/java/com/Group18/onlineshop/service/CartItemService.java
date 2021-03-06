package com.Group18.onlineshop.service;

import java.util.List;

import com.Group18.onlineshop.model.Cart;
import com.Group18.onlineshop.model.CartItem;

public interface CartItemService {

	public void addCartItem(CartItem cartItem);
	
	public void deleteCartItem(CartItem cartItem);
	
	
	public void removeAllCartItems(Cart cart);
	
	CartItem getCartItemByProduct(long productId);
	List<CartItem> findAllCartItemsBycart(Cart cart);
}
