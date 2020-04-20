package com.example.demo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainApplication {

	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		HelloApplication obj = (HelloApplication) factory.getBean("helloWorld");
		obj.getMessenger();
	}
}
