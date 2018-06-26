package com.venu.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","venu" );
			statement=connection.createStatement();
			String sql="UPDATE  COMPANY set SALARY=25000 WHERE ID=1; ";
			statement.executeUpdate(sql);
			
		}catch(Exception e){
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	        return;
			
		}

	}

}
