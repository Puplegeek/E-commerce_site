package com.Group18.onlineshop.service;

import com.Group18.onlineshop.model.BillingAddress;

public interface BillingAddressService {

	public void addBillingAddress(BillingAddress billingAddress);
	
	BillingAddress getBillingAddressbyId(long billingAddressId);
}
