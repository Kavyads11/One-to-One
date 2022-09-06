package com.example;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.entity.Department;
import com.example.entity.Employe;

import com.example.repository.EmployeRepository;


@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Autowired
	private EmployeRepository postRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
	
		Department c1=new Department("SE");
		Department c2=new Department("IE");
		Employe post = new Employe("Kiran","SE",c1);
		
		
		
		
		
	this.postRepository.save(post);
	}

}
