package me.kindcoder.gofdesignpattern.methodfactory.product;

public class Car {
	protected String name;
	protected String logo;
	protected int price;
	protected int horsepower;
	protected String color;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(final String logo) {
		this.logo = logo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(final int horsepower) {
		this.horsepower = horsepower;
	}

	public String getColor() {
		return color;
	}

	public void setColor(final String color) {
		this.color = color;
	}

	@Override public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", logo='" + logo + '\'' +
				", price=" + price +
				", horsepower=" + horsepower +
				", color='" + color + '\'' +
				'}';
	}
}
