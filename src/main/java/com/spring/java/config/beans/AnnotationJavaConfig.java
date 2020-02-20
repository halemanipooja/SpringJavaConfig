package com.spring.java.config.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationJavaConfig {

	public static void main(String[] args) {
		//read the java config class
		
 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
			
		//call the method on the bean
		
		String output = tennisCoach.getDailyWorkOut();
		System.out.println(output);
			
		System.out.println(tennisCoach.getDailyFortune());
		
		//close the context 
		context.close();
		
		
		
		}
}
