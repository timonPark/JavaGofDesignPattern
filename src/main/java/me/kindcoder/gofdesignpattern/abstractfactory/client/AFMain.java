package me.kindcoder.gofdesignpattern.abstractfactory.client;

import me.kindcoder.gofdesignpattern.abstractfactory.factory.BMWFactory;
import me.kindcoder.gofdesignpattern.abstractfactory.factory.BenzFactory;
import me.kindcoder.gofdesignpattern.abstractfactory.product.Car;

public class AFMain {
	public static void main(String[] args) {
		Car benzCar = Car.createCar(new BenzFactory());
		Car bmwCar = Car.createCar(new BMWFactory());
	}

}
