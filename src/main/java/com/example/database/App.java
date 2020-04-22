package com.example.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		
		DatabaseConector mysql = (DatabaseConector) context.getBean("mysqlConnector");
		mysql.connect();
		
		
		DatabaseConector postgresql = (DatabaseConector) context.getBean("postgresqlConnector");
		postgresql.connect();
		
	}

}
