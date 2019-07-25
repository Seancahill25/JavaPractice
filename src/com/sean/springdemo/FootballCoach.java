package com.sean.springdemo;

public class FootballCoach implements Coach {

	private AdviceService adviceService;
	private String emailAddress;
	private String team;
		
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("FootballCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("FootballCoach: inside setter method - setTeam");
		this.team = team;
	}

	public FootballCoach() {
		System.out.println("FootballCoach: inside no-arg constructor");
	}		
	
	public void setAdviceService(AdviceService adviceService) {
		System.out.println("FootballCoach: inside setter method - setAdviceService");
		this.adviceService = adviceService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5 laps around field";
	}

	@Override
	public String getDailyAdvice() {
		return adviceService.getAdvice();
	}

}
