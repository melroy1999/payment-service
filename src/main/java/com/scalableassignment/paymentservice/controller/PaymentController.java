package com.scalableassignment.paymentservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scalableassignment.paymentservice.service.PaymentService;
import com.scalablesassignment.paymentservice.entity.Order;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
	
	@Autowired
    private PaymentService paymentService;


    @PostMapping("/checkout/{userName}")
    public ResponseEntity<Order> addOrder(@PathVariable String userName) {
    	System.out.println("Inside copntroller");
    	Order order = paymentService.addOrder(userName);
        return new ResponseEntity<>(order,HttpStatus.CREATED);
    }

    @GetMapping("/orders/{userName}")
    public ResponseEntity<Order> getPaymentsByUserId(@PathVariable String userName) {
    	return new ResponseEntity<>(paymentService.getOrderByUserId(userName),HttpStatus.CREATED);
    }


    

}
