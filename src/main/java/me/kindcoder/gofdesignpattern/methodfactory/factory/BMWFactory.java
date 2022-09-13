package me.kindcoder.gofdesignpattern.methodfactory.factory;

import me.kindcoder.gofdesignpattern.methodfactory.factorytype.FactoryType;
import me.kindcoder.gofdesignpattern.methodfactory.product.BMW;
import me.kindcoder.gofdesignpattern.methodfactory.product.Car;

public class BMWFactory implements CarFactory{

	@Override public Car createCar(FactoryType factorytype) {
		return new BMW(factorytype);
	}
}
