package com.spring.java.config.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


public class TennisCoach implements Coach{

	
	private FortuneService fortuneService;
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
