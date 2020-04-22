package com.example.database;

public class PostgreSQLConnector extends DatabaseConector {

	@Override
	public void connect() {
		System.out.println("Da ket noi toi PosgreSQL: " + getUrl());
	}

}
