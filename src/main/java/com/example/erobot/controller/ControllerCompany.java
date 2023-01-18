package com.example.erobot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.erobot.model.Company;
import com.example.erobot.service.CompanyService;


@CrossOrigin("*") 

@RestController
public class ControllerCompany {
	
	
	
	@Autowired
     CompanyService companyService;
	

	
	@GetMapping("/company/{id}")
	public Company getbyid(@PathVariable long id) {
		
		 return  companyService.getOneCompany(id);

				

		 
	}
	
	@GetMapping("/company")
	public List<Company> getgall() {
		

		
		 return companyService.findallCompany();
		 
	}
	
	@PostMapping("/newcompany")
	public String  addemp(@RequestBody Company newcompany  ) {
		
		companyService.addCompany(newcompany); 
	
		
		 return  "save with succefully ";
		
	}
		@PutMapping("/companyUpdate")
	public String  updateemp(@RequestBody Company  company ) {
			companyService.updateCompany(company);
		 return  "update with succefully";
		 
	}
	
	@DeleteMapping("/compnayDelete/{id}")
	public String  delete(@PathVariable long id  ) {
		companyService.deleteCompany(id);
		 return  "delete with succefully";
		 
	}
	






}
