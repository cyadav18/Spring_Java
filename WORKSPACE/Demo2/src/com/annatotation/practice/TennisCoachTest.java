package com.annatotation.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TennisCoachTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(tennisCoach.getDailyWorkOut());
		System.out.println(tennisCoach.getDailyFortune());
		context.close();
	}

}
