package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloApplication objectA = (HelloApplication) context.getBean("examplePrototype");
		
		//lúc nào gọi thì đối một đối tượng mới được tạo ra.
		objectA.setMessenger("This is example of SingleTon Bean: onbject A !");
		objectA.getMessenger();
		
		HelloApplication objectB = (HelloApplication) context.getBean("examplePrototype");
		objectB.getMessenger();
		/*
		 * Output
		 * Your messenger is : This is example of SingleTon Bean: onbject A !
		 * Your messenger is : Hello World!
		 */
	}
}
