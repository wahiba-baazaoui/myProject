package com.example.erobot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.erobot.model.Company;
import com.example.erobot.model.Employe;
import com.example.erobot.repository.RepositoryEmploye;

@Service

public class EmployeService {
	
	@Autowired 
	RepositoryEmploye empRepository ;
	
	
	public Employe getbyeidserv(long id) {
		return empRepository.findById(id).orElseThrow(null);
		
	}
	
	public List<Employe> findallserv(){
		
		 return empRepository.findAll();
	}
	

	
	public void addempserve(Employe newemp) {
		 
		   empRepository.save(newemp);
	}
	
	public void deletebyid(long id) {
	        empRepository.deleteById(id);;
		
	}
	
	public void update(Employe newemp) {
		 
		   empRepository.save(newemp);
	}
	
	
	public List<Employe> findbycompany( long id ){
		
		 return empRepository.findbycompany(id );
	}
	
	
	

}
