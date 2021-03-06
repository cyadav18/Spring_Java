package com.starting.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeastBeanCoachScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
		Coach coach1 = context.getBean("baseBallCoach", Coach.class);
		System.out.println(coach1.getDailyFortuneService());
		context.close();
	}

}
