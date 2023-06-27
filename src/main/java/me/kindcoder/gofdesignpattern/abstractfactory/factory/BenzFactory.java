package me.kindcoder.gofdesignpattern.abstractfactory.factory;

import java.util.ArrayList;
import java.util.List;
import me.kindcoder.gofdesignpattern.abstractfactory.product.BenzEngine;
import me.kindcoder.gofdesignpattern.abstractfactory.product.BenzHandle;
import me.kindcoder.gofdesignpattern.abstractfactory.product.BenzWheel;
import me.kindcoder.gofdesignpattern.abstractfactory.product.Engine;
import me.kindcoder.gofdesignpattern.abstractfactory.product.Handle;
import me.kindcoder.gofdesignpattern.abstractfactory.product.Wheel;

public class BenzFactory implements CarFactory{

	@Override public Engine createEngine() {
		return new BenzEngine();
	}

	@Override public Handle createHandle() {
		return new BenzHandle();
	}

	@Override public List<? extends Wheel> createWheels() {
		return new ArrayList<BenzWheel>();
	}
}
