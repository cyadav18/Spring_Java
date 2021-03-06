package com.annatotation.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
//	public TennisCoach(FortuneService fortuneService) {
//		System.out.println("Inside constructor for setting the value");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkOut() {
		return "Work out in tennis court for 1 hour Tennis Coach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFrotune();
	}
	
	
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

}
