package com.scalableassignment.paymentservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.scalablesassignment.paymentservice.entity.Cart;

@Repository
public interface CartRepository extends MongoRepository<Cart, String>{
	Cart findByUserName(String userName);
	
	void deleteByUserName(String userName);
}
