package ua.com.foxminded.carinformation;

import java.util.List;
import java.util.Objects;

public class Car {
	private String name;
	private int yearOfProduct;
	private Engine engine;
	private CarBody carBody;
	private SterioSystem sterioSystem;
	private Wheel wheel;

	public Car(String name, int yearOfProduct, Engine engine, CarBody carBody, SterioSystem sterioSystem, Wheel wheel) {
		this.name = name;
		this.yearOfProduct = yearOfProduct;
		this.engine = engine;
		this.carBody = carBody;
		this.sterioSystem = sterioSystem;
		this.wheel = wheel;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getYearOfProduct() {
		return yearOfProduct;
	}

	public final void setYearOfProduct(int yearOfProduct) {
		this.yearOfProduct = yearOfProduct;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduct=" + yearOfProduct + ", engine=" + engine + ", carBody=" + carBody
				+ ", sterioSystem=" + sterioSystem + ", wheel=" + wheel + "]";
	}

	public final Engine getEngine() {
		return engine;
	}

	public final void setEngine(Engine engine) {
		this.engine = engine;
	}

	public final CarBody getCarBody() {
		return carBody;
	}

	public final void setCarBody(CarBody carBody) {
		this.carBody = carBody;
	}

	public final SterioSystem getSterioSystem() {
		return sterioSystem;
	}

	public final void setSterioSystem(SterioSystem sterioSystem) {
		this.sterioSystem = sterioSystem;
	}

	public final Wheel getWheel() {
		return wheel;
	}

	public final void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carBody, engine, name, sterioSystem, wheel, yearOfProduct);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(carBody, other.carBody) && Objects.equals(engine, other.engine)
				&& Objects.equals(name, other.name) && Objects.equals(sterioSystem, other.sterioSystem)
				&& Objects.equals(wheel, other.wheel) && yearOfProduct == other.yearOfProduct;
	}

}