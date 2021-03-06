package com.meTryingOut.spring.one;

public class Car implements Vehicle {
	String vehicleNumber;

	public Car() {
		System.out.println("Car created");
	}
	@Override
	public String goForward() {
		return "Car " + vehicleNumber + " moving forward";
	}

	@Override
	public String stop() {
		return "Car " + vehicleNumber + " stopping";
	}

	@Override
	public String backward() {
		return "Car " + vehicleNumber + " moving backward";
	}

	@Override
	public String getVehicleNumber() {
		return "Car " + vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	

}
