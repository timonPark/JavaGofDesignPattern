package me.kindcoder.gofdesignpattern.methodfactory.product;

import me.kindcoder.gofdesignpattern.methodfactory.factorytype.FactoryType;

public class Hyundai extends Car{

	public Hyundai(FactoryType factorytype){
		setName(factorytype.getName());
		setPrice(factorytype.getPrice());
		setHorsepower(factorytype.getHorsepower());
		setLogo(factorytype.getLogo());
		setColor(factorytype.getColor());
	}
}
