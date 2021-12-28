package com.chandra.spring.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 
@Data
@Entity
public class Student {

      @Id
      @GeneratedValue
	  
      int id;
       String firstName;
      String lastName;
	
	
//	public Student() {}


//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//
//	public String getLastName() {
//		return lastName;
//	}
//
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
//	}
//	 
}
