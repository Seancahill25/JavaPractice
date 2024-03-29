package com.sean.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FootballCoach theCoach = context.getBean("myFootballCoach", FootballCoach.class);
		
		System.out.println(theCoach.getDailyAdvice());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		context.close();
	}
}
