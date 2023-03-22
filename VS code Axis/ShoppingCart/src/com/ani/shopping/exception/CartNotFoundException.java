package com.ani.shopping.exception;

@SuppressWarnings("serial")
public class CartNotFoundException extends RuntimeException{

	public CartNotFoundException(String message) {
        super(message);
    }
}
