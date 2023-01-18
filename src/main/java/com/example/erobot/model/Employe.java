package com.example.erobot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "Empolye")
public class Employe {
	
	
	
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
private long id ;
	
	private String fistName ;
	private String lastName ;
	private double salary;
	private String adresse; 

	@ManyToOne
private Company company;
	
	
	
	public Company getCompany() {
		return company;
	}




	public void setCompany(Company company) {
		this.company = company;
	}




	public Employe(long id, String fistName, String lastName, double salary, String adresse, Company company) {
		super();
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.salary = salary;
		this.adresse = adresse;
		this.company = company;
	}




	public Employe(long id, String fistName, String lastName, double salary, String adresse
		) {
		super();
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.salary = salary;
		this.adresse = adresse;
		
	}

	

	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}






}