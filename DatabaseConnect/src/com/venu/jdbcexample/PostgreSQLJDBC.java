package com.venu.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgreSQLJDBC {
	Connection connection=null;
	Statement statement=null;
	void createTable() {
		try {
		statement = connection.createStatement();
        String sql = "CREATE TABLE COMPANY " +
           "(ID INT PRIMARY KEY     NOT NULL," +
           " NAME           TEXT    NOT NULL, " +
           " AGE            INT     NOT NULL, " +
           " ADDRESS        CHAR(50), " +
           " SALARY         REAL)";
        statement.executeUpdate(sql);
        statement.close();
        connection.close();
        }
		catch(Exception e) {System.out.println("error");}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostgreSQLJDBC postgreSQLJDBC=new PostgreSQLJDBC();
		
		try {
			Class.forName("org.postgresql.Driver");
			postgreSQLJDBC.connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "venu");
			 System.out.println("Opened database successfully");
			 postgreSQLJDBC.createTable();
		}
		catch(Exception e){
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	        return;
			
		}
		
	}

}
