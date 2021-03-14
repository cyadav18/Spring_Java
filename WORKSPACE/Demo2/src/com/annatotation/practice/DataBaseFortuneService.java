package com.annatotation.practice;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService {

	@Override
	public String getFrotune() {
		// TODO Auto-generated method stub
		return "Hey whoo Database Fortune Service";
	}

}
