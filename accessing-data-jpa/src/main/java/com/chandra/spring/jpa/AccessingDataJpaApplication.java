package com.chandra.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootApplication
public class AccessingDataJpaApplication {

	public static void main(String[] args) {
		 log.debug("Hello world");  
		SpringApplication.run(AccessingDataJpaApplication.class, args);
	}

}
