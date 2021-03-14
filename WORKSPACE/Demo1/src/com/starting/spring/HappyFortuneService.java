package com.starting.spring;

public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		System.out.println("HappyFortuneService created");
	}
	@Override
	public String getFortune() {
		return "Today is my lucky day! HappyFortuneService";
	}

}
