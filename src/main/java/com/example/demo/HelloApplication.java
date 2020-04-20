package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {
	
	private String messenger;
	
	public void setMessenger(String messenger) {
		this.messenger = messenger;
	}
	
	public void getMessenger() {
		System.out.println("Your messenger is : " + messenger);
	}
}
