package com.annatotation.practice;

import org.springframework.stereotype.Component;

@Component
public class HappFortuneService implements FortuneService {

	@Override
	public String getFrotune() {
		return "Today is your Fortune Service , Happy Fortune Service";
	}

}
