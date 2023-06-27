package me.kindcoder.gofdesignpattern.abstractfactory.factory;

import java.util.List;
import me.kindcoder.gofdesignpattern.abstractfactory.product.Engine;
import me.kindcoder.gofdesignpattern.abstractfactory.product.Handle;
import me.kindcoder.gofdesignpattern.abstractfactory.product.Wheel;

public interface CarFactory {
	Engine createEngine();

	Handle createHandle();

	List<? extends Wheel> createWheels();

}
