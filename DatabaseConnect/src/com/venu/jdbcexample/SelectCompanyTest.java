package com.venu.jdbcexample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectCompanyTest {
	@Test
	public void showMessage() throws Exception{
		SelectCompany selectCompany =new SelectCompany();
		
		assertNotNull(selectCompany.createConnection());
		assertNotNull(selectCompany.createStatement());
		assertTrue(selectCompany.getName().equals("Paul"));
		
		
		
}
}