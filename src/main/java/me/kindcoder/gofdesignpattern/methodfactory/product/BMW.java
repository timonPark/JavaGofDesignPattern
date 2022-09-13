package me.kindcoder.gofdesignpattern.methodfactory.product;

import me.kindcoder.gofdesignpattern.methodfactory.factorytype.FactoryType;

public class BMW extends Car {
	public BMW(FactoryType factorytype){
		setName(factorytype.getName());
		setPrice(factorytype.getPrice());
		setHorsepower(factorytype.getHorsepower());
		setLogo(factorytype.getLogo());
		setColor(factorytype.getColor());
	}
}
