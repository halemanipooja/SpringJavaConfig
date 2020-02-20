package com.spring.java.config.properties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class TennisCoach implements Coach{

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	private FortuneService fortuneService;
	
	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
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

	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}
}
