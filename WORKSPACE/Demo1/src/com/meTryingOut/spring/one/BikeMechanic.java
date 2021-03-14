package com.meTryingOut.spring.one;

public class BikeMechanic implements Mechanic{
	private String name;
	private Vehicle bike;
	
	public BikeMechanic(Vehicle vehicle) {
		System.out.println("Bike Mechanic Created");
		this.bike = vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String repairVehicle() {
		String s = "I'm a mechanic " + name+" ";
		s += bike.goForward()+" ";
		s += bike.backward()+" ";
		s += bike.stop();
		return s;
	}
}
