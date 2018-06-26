package com.venu.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStat{

	public static void main(String[] args) {
		try{  
Class.forName("org.postgresql.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","venu");  
  
PreparedStatement stmt=con.prepareStatement("insert into company values(?,?,?,?,?)");  
stmt.setInt(1,101);//1 specifies the first parameter in the query  
stmt.setString(2,"Ratan"); 
stmt.setInt(3,43);
stmt.setString("hyderabad");
stmt.setBigdecimal(20000.00d);
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  

	}

}
