package me.kindcoder.gofdesignpattern.methodfactory.factorytype;

public enum FactoryType {
	BENZ("Benz", 100000, 999999, "🚗", "black"),
	BMW("BMW", 50000, 888888, "🚕", "blue"),
	HYUNDAI("BMW", 50000, 888888, "🚕", "blue");

	private String name;
	private int price;
	private int horsepower;
	private String logo;
	private String color;

	FactoryType(final String name, final int price, final int horsepower, final String logo, final String color) {
		this.name = name;
		this.price = price;
		this.horsepower = horsepower;
		this.logo = logo;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public String getLogo() {
		return logo;
	}

	public String getColor() {
		return color;
	}
}
