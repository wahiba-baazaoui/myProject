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

import com.example.erobot.model.Employe;
import com.example.erobot.service.EmployeService;
@CrossOrigin("*") 
@RestController
public class ControllerEmploye {
	
	@Autowired
	EmployeService empserv ;
@GetMapping("/employe/{id}")
public Employe getbyid(@PathVariable long id) {
	
	 return  empserv.getbyeidserv(id);

			

	 
}
@GetMapping("/empbycompany/{id}")
public List<Employe> getbycompany(@PathVariable long id) {
	
	 return  empserv.findbycompany(id);

			

	 
}

@GetMapping("/employe")
public List<Employe> getgall() {
	

	
	 return  empserv.findallserv();
	 
}

@PostMapping("/employeadd")
public String  addemp(@RequestBody Employe newemp  ) {
	
	empserv.addempserve(newemp); 

	
	 return  "save with succefully ";
	
}
	@PutMapping("/employeupdate")
public String  updateemp(@RequestBody Employe emp  ) {
	 empserv.update(emp);
	 return  "update with succefully";
	 
}

@DeleteMapping("/empdelete/{id}")
public String  delete(@PathVariable long id  ) {
	 empserv.deletebyid(id);
	 return  "delete with succefully";
	 
}


}
