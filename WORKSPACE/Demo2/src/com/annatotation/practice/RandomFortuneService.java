package com.annatotation.practice;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String [] data = {
			"Ramdom 1",
			"Random 2",
			"Random 3"
	};
	Random myRandom = new Random();
	
	@Override
	public String getFrotune() {
		// TODO Auto-generated method stub
		
		return "WHoo hey Random Fortune Service "+data[myRandom.nextInt(data.length)];
	}

}
