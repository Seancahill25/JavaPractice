package com.sean.springdemo;

public class BasketballCoach implements Coach {

	private AdviceService adviceService;
	
	public BasketballCoach() {
		
	}
	
	public BasketballCoach(AdviceService adviceService) {
		this.adviceService = adviceService;
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot 30 free throws";
	}

	@Override
	public String getDailyAdvice() {
		
		return "Seriously: " + adviceService.getAdvice();
	}
}
