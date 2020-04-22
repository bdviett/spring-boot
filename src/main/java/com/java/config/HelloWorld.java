package com.java.config;

public class HelloWorld {
	private String message;

	/**
	 * @return the message
	 */
	public void getMessage() {
		System.out.println("Tin nhan : " + message);
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
