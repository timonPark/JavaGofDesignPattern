package me.kindcoder.gofdesignpattern.abstractfactory.product;

import java.util.List;
import me.kindcoder.gofdesignpattern.abstractfactory.factory.CarFactory;

public class Car {
	private final Engine engine;
	private final Handle handle;
	private final List<? extends Wheel> wheels;
	private Car(CarFactory carFactory){
		this.engine = carFactory.createEngine();
		this.handle = carFactory.createHandle();
		this.wheels = carFactory.createWheels();
	}

	public static Car createCar(CarFactory carFactory){
		return new Car(carFactory);
	}

}
