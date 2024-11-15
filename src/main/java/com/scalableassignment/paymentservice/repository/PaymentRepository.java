package com.scalableassignment.paymentservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.scalablesassignment.paymentservice.entity.Payment;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String>{
	
	List<Payment> findByUserId(String userId);

}
