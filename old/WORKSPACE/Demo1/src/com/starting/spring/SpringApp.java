package com.starting.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		//create the context or load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve the class from applicationContext.xml
		Coach b = context.getBean("baseCoach", Coach.class);
		//call the the method
		System.out.println(b.getDailyWorkOut());
		System.out.println(b.getDailyFortuneService());
		b = context.getBean("TrackCoach", Coach.class);
		System.out.println(b.getDailyWorkOut());
		System.out.println(b.getDailyFortuneService());
		//close the application context
		context.close();
	}
}
