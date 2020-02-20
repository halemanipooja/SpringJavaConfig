package com.spring.java.config.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.java.config.beans") -not needed as we are manually creating the bean id's 
public class SportConfig {

	//define bean for fortune service
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	//define bean and inject dependency for tennis coach
	@Bean
	public Coach tennisCoach() {
		return new TennisCoach(happyFortuneService());
	}
	
}
