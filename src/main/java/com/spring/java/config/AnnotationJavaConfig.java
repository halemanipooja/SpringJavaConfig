package com.spring.java.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationJavaConfig {

	public static void main(String[] args) {
		//read context file
		
		
 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
			
		//call the method on the bean
		
		String output = tennisCoach.getDailyWorkOut();
		System.out.println(output);
			
		System.out.println("before context close");
		//close the context 
		context.close();
		
		System.out.println("After context close");
		
		}
}
