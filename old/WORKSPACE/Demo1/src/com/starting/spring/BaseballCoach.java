package com.starting.spring;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;

	public BaseballCoach() {
	}

	public BaseballCoach(FortuneService service) {
		System.out.println("Base ball coach created");
		fortuneService = service;
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes with Baseball";
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getFortune();
	}
	
	public void startUpMethodBasketBall() {
		System.out.println("Inside init method basket ball");
	}
	
	public void cleanUpMethodBasketBall() {
		System.out.println("Inside destry method basket ball");
	}
}
