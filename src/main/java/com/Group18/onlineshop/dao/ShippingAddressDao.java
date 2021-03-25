package com.Group18.onlineshop.dao;

import com.Group18.onlineshop.model.ShippingAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ShippingAddressDao extends CrudRepository<ShippingAddress, Long>{

}
