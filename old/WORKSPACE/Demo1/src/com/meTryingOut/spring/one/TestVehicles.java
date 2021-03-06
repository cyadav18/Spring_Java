package com.meTryingOut.spring.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVehicles {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Vehicle v = context.getBean("Bike", Vehicle.class);
		v.setVehicleNumber("KA 02");
		System.out.println(v.goForward());
		System.out.println(v.backward());
		System.out.println(v.stop());
		System.out.println(v.getVehicleNumber());
		Mechanic mechanic = context.getBean("bikeMechanic", Mechanic.class);
		System.out.println(mechanic.repairVehicle());
		v = (Vehicle) context.getBean("Car");
		v.setVehicleNumber("KA 03");
		System.out.println(v.goForward());
		System.out.println(v.backward());
		System.out.println(v.stop());
		System.out.println(v.getVehicleNumber());
		mechanic = context.getBean("carMechanic", Mechanic.class);
		System.out.println(mechanic.repairVehicle());
		context.close();
	}

}
