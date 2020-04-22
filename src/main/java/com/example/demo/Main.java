package com.example.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context;
		  //autowire="no"
		  context = new ClassPathXmlApplicationContext("student-bean.xml");
		  Student student = (Student) context.getBean("student");
		  System.out.println(student); 
		  //Output: Student [address = Address [city = Ha Noi]]
	}

}
