package com.spring.classes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {
	
	private String name;
	private String designation;
	
	@PostConstruct
	public void initStudent() {
		System.out.println("Init Method got Executed");
	}

	@Autowired
	public void setName(@Value("Darshan") String name) {
		this.name = name;
	}

	@Autowired
	public void setDesignation(@Value("Software Developer") String designation) {
		this.designation = designation;
	}

	public void print() {
		System.out.println(name+" is a passionate "+designation);
	}
	
	@PreDestroy
	public void destroyStudent() {
		System.out.println("Student bean got destroyed");
	}
	


}
