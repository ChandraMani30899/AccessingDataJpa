package com.chandra.spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.chandra.spring.jpa.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

	Student findById(int id);

	Student findByLastName(String lastName);

	void deleteById(int id);

}
