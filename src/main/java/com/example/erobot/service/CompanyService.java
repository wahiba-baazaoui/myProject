package com.example.erobot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.erobot.model.Company;
import com.example.erobot.repository.RepositoryCompany;



@Service
public class CompanyService {
	
	
	
	@Autowired 
	RepositoryCompany companyRepository ;
	
	
	public Company getOneCompany(long id) {
		return companyRepository.findById(id).orElseThrow(null);
		
	}
	
	public List<Company> findallCompany(){
		
		 return companyRepository.findAll();
	}
	
	public void addCompany(Company compay) {
		 
		companyRepository.save(compay);
	}
	
	public void deleteCompany(long id) {
		companyRepository.deleteById(id);;
		
	}
	
	public void updateCompany(Company compay) {
		 
		companyRepository.save(compay);
	}
	
	
	public int   addition(int a , int  b ) {
		return  a+b;
	}
	



	


}