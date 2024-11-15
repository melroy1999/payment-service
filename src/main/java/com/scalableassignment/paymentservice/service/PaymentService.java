package com.scalableassignment.paymentservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalableassignment.paymentservice.repository.PaymentRepository;
import com.scalablesassignment.paymentservice.entity.Payment;

@Service
public class PaymentService {
		
	@Autowired
    private PaymentRepository paymentRepository;


    public Payment createPayment(Payment payment) {

        return paymentRepository.save(payment); 
    }


    public List<Payment> getPaymentsByUserId(String userId) {
        return paymentRepository.findByUserId(userId);
    }


    public Optional<Payment> getPaymentByTransactionId(String transactionId) {
        return paymentRepository.findById(transactionId);
    }
}
