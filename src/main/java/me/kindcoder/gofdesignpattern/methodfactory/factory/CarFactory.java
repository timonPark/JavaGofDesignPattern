package me.kindcoder.gofdesignpattern.methodfactory.factory;

import me.kindcoder.gofdesignpattern.methodfactory.factorytype.FactoryType;
import me.kindcoder.gofdesignpattern.methodfactory.product.Car;

import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isEmpty;

public interface CarFactory {

	default Car orderCar(FactoryType factorytype, String name, String email){
		validate(name, email);
		prepareFor(name);
		Car car = createCar(factorytype);
		sendEmailTo(email, car);
		return car;
	}

	Car createCar(FactoryType factorytype);

	private void validate(String name, String email){
		validatationCheck(name, "이름을 남겨주세요");
		validatationCheck(email, "이메일을 남겨주세요");
	}

	private void validatationCheck(String input, String message){
		if (isBlank(input) || isEmpty(input)){
			throw new IllegalArgumentException(message);
		}
	}

	private void prepareFor(String name) {
		System.out.println(name + "만들 준비 중");
	}

	private void sendEmailTo(String email, Car car){
		System.out.println(car.getName() + "다 만들었습니다");
	}



}
