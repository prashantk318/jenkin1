package com.prashant.model;

public class Springboot {
	
	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public Springboot(String message) {
		super();
		this.message = message;
	}
	
	

}
