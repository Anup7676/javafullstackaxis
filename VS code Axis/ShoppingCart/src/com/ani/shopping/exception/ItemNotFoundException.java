package com.ani.shopping.exception;

@SuppressWarnings("serial")
public class ItemNotFoundException extends RuntimeException {

	 public ItemNotFoundException(String message) {
	        super(message);
	    }
}
