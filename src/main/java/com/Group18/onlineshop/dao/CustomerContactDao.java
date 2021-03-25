package com.Group18.onlineshop.dao;

import com.Group18.onlineshop.model.CustomerContact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerContactDao extends CrudRepository<CustomerContact, Long>,PagingAndSortingRepository<CustomerContact, Long>{

}
