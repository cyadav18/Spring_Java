package com.annatotation.practice;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getFrotune() {
		// TODO Auto-generated method stub
		return "Rest fortune Service";
	}

}
