package com.annatotation.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
	@Autowired
	@Qualifier("happFortuneService")
	private FortuneService fortuneService;
	
//	public BaseBallCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public String getDailyFortune() {
		return fortuneService.getFrotune();
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend some time in BaseBall field";
	}

}

class TestBaseballCoach {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach baseBallCoach = context.getBean("baseBallCoach", Coach.class);
		System.out.println(baseBallCoach.getDailyWorkOut());
		System.out.println(baseBallCoach.getDailyFortune());
		context.close();
	}
}
