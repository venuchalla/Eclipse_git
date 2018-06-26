package com.venu.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Connection connection=null;
 Statement statement=null;
 try {
	 Class.forName("org.postgresql.Driver");
	 connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","venu");
	 statement=connection.createStatement();
	 String sql="delete from company where id=3;";
	 statement.executeUpdate(sql);
 }catch(Exception e) {
	 System.err.println( e.getClass().getName()+": "+ e.getMessage() );
     return;
	 
 }
	}

}
