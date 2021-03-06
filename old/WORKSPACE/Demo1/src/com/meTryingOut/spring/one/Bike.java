package com.meTryingOut.spring.one;

public class Bike implements Vehicle {
	String vehicleNumber;
	
	public Bike() {
		System.out.println("Bike Created");
	}

	public String getVehicleNumber() {
		return "Bike "+vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	@Override
	public String goForward() {
		return "Bike " + vehicleNumber + " moving forward";
	}

	@Override
	public String stop() {
		return "Bike " + vehicleNumber + " stopping";
	}

	@Override
	public String backward() {
		return "Bike " + vehicleNumber + " moving backward";
	}

}
