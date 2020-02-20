package com.spring.java.config.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
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
