package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class active4AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("badmintonCoach", Coach.class);
		
		// call method to get the dailyWorkout
		System.out.println(theCoach.getDailyWorkout());
		
		
		// close context
		context.close();
	}

}
