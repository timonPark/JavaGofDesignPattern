package me.kindcoder.gofdesignpattern.abstractfactory.factory;

import java.util.ArrayList;
import java.util.List;
import me.kindcoder.gofdesignpattern.abstractfactory.product.BMWEngine;
import me.kindcoder.gofdesignpattern.abstractfactory.product.BMWHandle;
import me.kindcoder.gofdesignpattern.abstractfactory.product.BMWWheel;
import me.kindcoder.gofdesignpattern.abstractfactory.product.Engine;
import me.kindcoder.gofdesignpattern.abstractfactory.product.Handle;
import me.kindcoder.gofdesignpattern.abstractfactory.product.Wheel;

public class BMWFactory implements CarFactory{

	@Override public Engine createEngine() {
		return new BMWEngine();
	}

	@Override public Handle createHandle() {
		return new BMWHandle();
	}

	@Override public List<? extends Wheel> createWheels() {
		return new ArrayList<BMWWheel>();
	}
}
