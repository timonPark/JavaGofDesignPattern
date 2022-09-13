package me.kindcoder.gofdesignpattern.methodfactory.factory;

import me.kindcoder.gofdesignpattern.methodfactory.factorytype.FactoryType;
import me.kindcoder.gofdesignpattern.methodfactory.product.Benz;
import me.kindcoder.gofdesignpattern.methodfactory.product.Car;

public class BenzFactory implements CarFactory{

	@Override public Car createCar(FactoryType factorytype) {
		return new Benz(factorytype);
	}
}
