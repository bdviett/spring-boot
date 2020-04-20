package com.example.demo;

public class HelloApplication {
	
	private String messenger;
	
	public void setMessenger(String messenger) {
		this.messenger = messenger;
	}
	
	public void getMessenger() {
		System.out.println("Your messenger is : " + messenger);
	}
	
	//init-method="init"
	
	public void init() {
		System.out.println("Bean is going through init.");
	}
	
	//destroy-method="destroy"
	public void destroy() {
		System.out.println("Bean will destroy now");
	}
}
