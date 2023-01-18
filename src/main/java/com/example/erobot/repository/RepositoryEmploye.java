package com.example.erobot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.erobot.model.Employe;

@Repository
public interface RepositoryEmploye  extends JpaRepository<Employe,Long> {
	@Query ( value = "SELECT * FROM empolye where  company_id = ?1  ;" , nativeQuery = true)
	List<Employe> findbycompany ( long idcompany ) ;

}
