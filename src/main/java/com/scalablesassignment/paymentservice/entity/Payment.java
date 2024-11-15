package com.scalablesassignment.paymentservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Payment")
public class Payment {
	
    @Id
    private String id;
    
    private String userId;
    
    private double amount;   
    
    private String paymentMethod; 
    
    private boolean successful;   
    
    private String transactionId;

	public Payment(String id, String userId, double amount, String paymentMethod, boolean successful,
			String transactionId) {
		this.id = id;
		this.userId = userId;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.successful = successful;
		this.transactionId = transactionId;
	}

	public Payment() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}  
    
    

}
