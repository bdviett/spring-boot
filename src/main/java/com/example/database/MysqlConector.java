package com.example.database;

public class MysqlConector extends DatabaseConector {

	@Override
	public void connect() {
		System.out.println("Da ket noi toi mysql : " + getUrl());
	}

}
