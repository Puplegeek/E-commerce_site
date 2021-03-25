package com.Group18.onlineshop.service;

import com.Group18.onlineshop.model.ShippingAddress;

public interface ShippingAddressService {

	public void addShippingAddress(ShippingAddress shippingAddress);
	
	ShippingAddress getShippingAddressById(long shippingAddressId);
}
