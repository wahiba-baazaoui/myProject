package com.example.erobot.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanyTest {

	
	
	@Autowired
	CompanyService companyService;
	
	@Test
 public void 	foctionTest () {
	 
		assertEquals(5, companyService.addition(2, 3));
 }

}
