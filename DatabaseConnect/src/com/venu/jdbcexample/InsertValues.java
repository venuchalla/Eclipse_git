package com.venu.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertValues {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		
	
		
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "venu");
			 System.out.println("Opened database successfully");
			 
			 statement=connection.createStatement();
				String sql="INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY)"+ "VALUES (6, 'sai', 25, 'texas', 20000.00);";
				 statement.executeUpdate(sql);
				
				         statement.close();
				         
				         connection.close();
			 
		}
		catch(Exception e){
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	        return;
			
		}
		

	}

}
