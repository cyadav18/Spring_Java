package com.starting.spring;

public class TrackCoach implements Coach {

	FortuneService fortuneService;
	
	public TrackCoach() {
	}
	
	public TrackCoach(FortuneService service) {
		System.out.println("Track coach created");
		fortuneService = service;
	}

	public String getDailyWorkOut() {
		return "Spend 30 minutes on Track";
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getFortune();
	}
	
	public void startUpMethodTrackCoach() {
		System.out.println("Inside init method Track");
	}
	
	public void cleanUpMethodTrackCoach() {
		System.out.println("Inside destry method Track");
	}

}
