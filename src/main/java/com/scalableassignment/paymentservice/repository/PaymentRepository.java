package com.scalableassignment.paymentservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.scalablesassignment.paymentservice.entity.Order;

@Repository
public interface PaymentRepository extends MongoRepository<Order, String>{
	
	Order findByUserName(String userName);

}
