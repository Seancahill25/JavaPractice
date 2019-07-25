package com.sean.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-ApplicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach otherCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == otherCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location the theCoach: " + theCoach);
		System.out.println("\nMemory location the otherCoach: " + otherCoach + "\n");
		
		context.close();
	}
}
