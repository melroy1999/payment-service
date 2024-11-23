package com.scalableassignment.paymentservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalableassignment.paymentservice.repository.CartRepository;
import com.scalableassignment.paymentservice.repository.PaymentRepository;
import com.scalablesassignment.paymentservice.entity.Cart;
import com.scalablesassignment.paymentservice.entity.Order;

@Service
public class PaymentService {
		
	@Autowired
    private PaymentRepository paymentRepository;
	
	@Autowired
	private CartRepository cartRepository;


    public Order addOrder(String userName) {
    	Cart cart = cartRepository.findByUserName(userName);
    	System.out.println(cart.getUserName());
    	Order order = new Order();
    	order.setAmount(cart.getTotalCost());
    	order.setUserName(userName);
    	order.setCart(cart);
    	
        Order retOrder = paymentRepository.save(order); 
        cartRepository.deleteByUserName(userName);
        return retOrder;
    }


    public Order getOrderByUserId(String userName) {
        return paymentRepository.findByUserName(userName);
    }


}
