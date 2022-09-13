package me.kindcoder.gofdesignpattern.methodfactory.factory;

import me.kindcoder.gofdesignpattern.methodfactory.factorytype.FactoryType;
import me.kindcoder.gofdesignpattern.methodfactory.product.Car;
import me.kindcoder.gofdesignpattern.methodfactory.product.Hyundai;

public class HyundaiFactory implements CarFactory{

	@Override public Car createCar(FactoryType factorytype) {
		return new Hyundai(factorytype);
	}
}
