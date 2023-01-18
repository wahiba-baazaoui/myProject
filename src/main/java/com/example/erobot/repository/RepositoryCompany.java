package com.example.erobot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.erobot.model.Company;


@Repository
public interface RepositoryCompany   extends JpaRepository<Company,Long>{

}
