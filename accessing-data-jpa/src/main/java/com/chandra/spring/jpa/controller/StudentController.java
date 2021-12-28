package com.chandra.spring.jpa.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.spring.jpa.model.Student;
import com.chandra.spring.jpa.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping(value="/student")
public class StudentController {
	 
	//private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(StudentController.class);
	  
	@Autowired
	 StudentRepository studentRepository; 
	
	   @GetMapping(value="/showAll")
	   public List<Student> showStudent(){
		   
		  
		   
		   return  (List<Student>) studentRepository.findAll();
		   
	   }
	   
	  @GetMapping(value="/showById")
	   public String showById(@RequestParam int id){
		  Student s = studentRepository.findById(id);
		
		  return s.toString();
		

	  }
	  
	  @GetMapping(value="/showByLastName")
	   public String showByLastName(@RequestParam String lastName){
		  Student s = studentRepository.findByLastName(lastName);
		  return s.toString();
	  }
	  
	  @GetMapping(value="/Delete")
	  public List<Student> deletebyId(@RequestParam int id) {
		     
		       studentRepository.deleteById(id);
			  
			  return  (List<Student>) studentRepository.findAll();
	  }

	  @PostMapping(value="/Insert")
	  public String insert(@RequestBody final Student student){
		
		       studentRepository.save(student);
		  
		  return "redirect:/student/showAll";
	  } 
	  
	  @GetMapping("/check")
	  public String check() {
		  return "Hello world";
	  }
	  
}
