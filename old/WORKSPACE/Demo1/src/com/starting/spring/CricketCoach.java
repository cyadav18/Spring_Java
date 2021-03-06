package com.starting.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CricketCoach implements Coach {
	FortuneService fortuneService;
	private String name;
	private int age;
	public CricketCoach() {
	}
	
	public void setFortuneService(FortuneService service) {
		this.fortuneService = service;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDailyWorkOut() {
		return "Run along cricket ground 20 times";
	}

	public String getDailyFortuneService() {
		return fortuneService.getFortune();
	}

	public String toString() {
		return "CricketCoach [name=" + name + ", age=" + age + "]";
	}

}

class TestCricke{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach c = context.getBean("crickeCoach",CricketCoach.class);
		System.out.println(c);
		System.out.println(c.getDailyWorkOut());
		System.out.println(c.getDailyFortuneService());
		context.close();
	}
}
