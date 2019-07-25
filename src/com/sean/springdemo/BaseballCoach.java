package com.sean.springdemo;

public class BaseballCoach implements Coach {
	
	private AdviceService adviceService;
	public BaseballCoach(AdviceService theAdviceService) {
		adviceService = theAdviceService;
	}
	
	@Override
	public String getDailyWorkout()	{
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyAdvice() {
		return adviceService.getAdvice();
	}
}
