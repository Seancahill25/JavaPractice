package com.sean.springdemo;

public class ObviousAdviceService implements AdviceService {

	@Override
	public String getAdvice() {		
		return "Drink water!";
	}

}
