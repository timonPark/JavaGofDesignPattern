package me.kindcoder.gofdesignpattern.methodfactory.client;

import me.kindcoder.gofdesignpattern.methodfactory.factory.CarFactoryImpl;
import me.kindcoder.gofdesignpattern.methodfactory.factorytype.FactoryType;
import me.kindcoder.gofdesignpattern.methodfactory.product.Car;

public class MfMain {

	public static void main(String[] args) {

		Car car = new CarFactoryImpl().orderCar(FactoryType.BENZ, "벤츠슈퍼카", "aa1@naver.com");
		System.out.println(car);
		Car car2 = new CarFactoryImpl().orderCar(FactoryType.BMW,"BMW-SUV", "aa2@naver.com");
		System.out.println(car2);
		Car car3 = new CarFactoryImpl().orderCar(FactoryType.HYUNDAI,"현대-세단", "aa3@naver.com");
		System.out.println(car3);
	}

}
