package com.starting.spring;

public class MyApp {

	public static void main(String[] args) {
		Coach b = new BaseballCoach(new HappyFortuneService());
		System.out.println(b.getDailyWorkOut());
		System.out.println(b.getDailyFortuneService());
		b = new TrackCoach(new HappyFortuneService());
		System.out.println(b.getDailyWorkOut());
		System.out.println(b.getDailyFortuneService());
	}

}
