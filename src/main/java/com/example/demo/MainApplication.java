package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloApplication obj = (HelloApplication) context.getBean("helloWorld"); //getBean se lay id tu thang Beans.xml: <bean id = "helloWorld">
		obj.getMessenger();
	}
}
