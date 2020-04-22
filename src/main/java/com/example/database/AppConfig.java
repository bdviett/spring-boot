package com.example.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean("mysqlConnector")
	DatabaseConector mysqlConfig () {
		DatabaseConector mysql = new MysqlConector();
		mysql.setUrl("jdbc:mysql://host1:33060/");
		return mysql;
	}
	
	@Bean("postgresqlConnector")
	DatabaseConector posgresqlConfig () {
		DatabaseConector posgresql = new MysqlConector();
		posgresql.setUrl("jdbc:posgresql://host1:33060/");
		return posgresql;
	}
}
