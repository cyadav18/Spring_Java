package com.meTryingOut.spring.one;

public class CarMechanic implements Mechanic {

	private String name;
	private Vehicle car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CarMechanic(Vehicle car) {
		System.out.println("Car Mechanic created");
		this.car = car;
	}

	public String repairVehicle() {
		String s = "I'm a mechanic " + name + " ";
		s += car.goForward() + " ";
		s += car.backward() + " ";
		s += car.stop();
		return s;
	}

}
