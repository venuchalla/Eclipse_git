package com.venu.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectCompany {
	Connection connection=null;
	Statement statement=null;
	
	public Connection createConnection() throws Exception{
		Class.forName("org.postgresql.Driver");
		
		connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","venu");
		System.out.println("Connection Created");
		return connection;
	}
	
	public Statement createStatement() throws Exception{
		System.out.println("Statement Created");
		return statement=connection.createStatement();
	}
	
	public String getName() throws Exception{
		String  name = null;
		String sql="select * from company where id=1;";
		ResultSet resultSet=statement.executeQuery(sql);
		while(resultSet.next()) {
			  name = resultSet.getString("name");
	  }
		System.out.println("name "+name);
		resultSet.close();
         statement.close();
         connection.close();
	
		
		return name;
	}
	
	
	
}
