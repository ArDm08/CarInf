package ua.com.foxminded.carinformation;

import java.util.Objects;

public class SterioSystem {
	private String name;
	private double power;
	private int numOfSpeakers;

	public SterioSystem(String name, double power, int numOfSpeakers) {
		this.name = name;
		this.power = power;
		this.numOfSpeakers = numOfSpeakers;
	}

	@Override
	public String toString() {
		return "SterioSistem [name=" + name + ", power=" + power + ", numOfSpeakers=" + numOfSpeakers + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, numOfSpeakers, power);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SterioSystem other = (SterioSystem) obj;
		return Objects.equals(name, other.name) && numOfSpeakers == other.numOfSpeakers && power == other.power;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final double getPower() {
		return power;
	}

	public final void setPower(int power) {
		this.power = power;
	}

	public final int getNumOfSpeakers() {
		return numOfSpeakers;
	}

	public final void setNumOfSpeakers(int numOfSpeakers) {
		this.numOfSpeakers = numOfSpeakers;
	}

}
