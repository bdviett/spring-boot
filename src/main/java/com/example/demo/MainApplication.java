package com.example.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloApplication objectA = (HelloApplication) context.getBean("helloWorld");
		objectA.getMessenger();
		context.registerShutdownHook();
		/*
		 * Output
		 * Your messenger is : This is example of SingleTon Bean: onbject A !
		 * Your messenger is : Hello World!
		 */
	}
}
