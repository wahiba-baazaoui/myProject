package com.example.erobot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;
 @Entity
@Table (name = "company")

public class Company {
	 
		@Id
		 @GeneratedValue(strategy = GenerationType.AUTO)
		private Long  id ; 
		
		
		@Column(name= "name")
		private String name ;
		private String codeTva ;
		private String phoneNumber ;
		
		private String adresse ; 
		 private String email ; 
		 
		 @OneToMany(mappedBy="company" , fetch = FetchType.EAGER)
		
		
		  private List<Employe> employes = new ArrayList<>();
		 
	
	 public Company(Long id, String name, String codeTva, String phoneNumber, String adresse, String email) {
			super();
			this.id = id;
			this.name = name;
			this.codeTva = codeTva;
			this.phoneNumber = phoneNumber;
			this.adresse = adresse;
			this.email = email;
		}
	 public Company() {
			super();
			// TODO Auto-generated constructor stub
		}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCodeTva() {
		return codeTva;
	}
	public void setCode_Tva(String codeTva) {
		this.codeTva = codeTva;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	 
	

}
