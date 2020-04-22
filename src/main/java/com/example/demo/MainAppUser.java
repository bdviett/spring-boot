package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppUser {

	public static void main(String[] args) {
		
		ApplicationContext context;
		context = new ClassPathXmlApplicationContext("application-bean.xml");
		
		App app = (App) context.getBean("app");
		System.out.println(app);
	}

}
