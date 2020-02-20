package com.spring.java.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//annoatation to add to the methods
@Component 
public class TennisCoach implements Coach{

	
	public TennisCoach() {
		System.out.println("inside default tenniscoach constructor");
	}
	
	//define init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("Tenniscoach: inside of doMyStartUpStuff");
	}
	
	//define destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("Tenniscoach: inside of doMyCleanUpStuff");
	}
	
	public String getDailyWorkOut() {
		return "practise your backhand volley";
	}
}
