package com.spring.java.config.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationJavaConfig {

	public static void main(String[] args) {
		//read the java config class
		
 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
 TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
		
			
		//call the method on the bean
		
		String output = tennisCoach.getDailyWorkOut();
		System.out.println(output);
			
		System.out.println(tennisCoach.getDailyFortune());
		
		System.out.println(tennisCoach.getEmail());
		System.out.println(tennisCoach.getName());
		//close the context 
		context.close();
		
		
		
		}
}
