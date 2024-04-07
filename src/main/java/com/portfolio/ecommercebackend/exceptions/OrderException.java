package com.portfolio.ecommercebackend.exceptions;

public class OrderException extends RuntimeException{ 
	public OrderException() {
		
	}
	public OrderException(String message) {
		super(message);
	}

}
