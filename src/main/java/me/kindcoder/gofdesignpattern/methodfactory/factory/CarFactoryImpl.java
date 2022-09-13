package me.kindcoder.gofdesignpattern.methodfactory.factory;

import java.util.HashMap;
import java.util.Map;
import me.kindcoder.gofdesignpattern.methodfactory.factorytype.FactoryType;
import me.kindcoder.gofdesignpattern.methodfactory.product.Car;

public class CarFactoryImpl implements CarFactory{
	Map<FactoryType, CarFactory> factorytypeMap = new HashMap<>();

	public CarFactoryImpl(){
		factorytypeMap.put(FactoryType.BENZ, new BenzFactory());
		factorytypeMap.put(FactoryType.BMW, new BMWFactory());
		factorytypeMap.put(FactoryType.HYUNDAI, new HyundaiFactory());
	}

	@Override public Car createCar(final FactoryType factorytype) {
		return factorytypeMap.get(factorytype).createCar(factorytype);
	}
}
