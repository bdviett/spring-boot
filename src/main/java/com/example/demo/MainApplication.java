package com.example.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloApplication objectA = (HelloApplication) context.getBean("helloWorld");
		objectA.getMessenger();
		context.registerShutdownHook();
	}
}
