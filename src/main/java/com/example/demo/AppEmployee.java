package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppEmployee {

	public static void main(String[] args) {
		ApplicationContext context;
		context = new ClassPathXmlApplicationContext("app-employee.xml");
		
		Employee employeeAddress = (Employee) context.getBean("employee");
		System.out.println(employeeAddress);
	}

}
