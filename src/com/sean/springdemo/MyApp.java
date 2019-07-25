package com.sean.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new BasketballCoach();
		
		System.out.println(theCoach.getDailyWorkout());
	}
}
