package ua.com.foxminded.carinformation;

import java.util.Objects;

public class CarBody {
	private String name;
	private int numOfDoors;
	private int clearance;
	private double lengthOfCarBody;

	public CarBody(String name, int numOfDoors, int clearance, double lengthOfCarBody) {
		this.name = name;
		this.numOfDoors = numOfDoors;
		this.clearance = clearance;
		this.lengthOfCarBody = lengthOfCarBody;
	}

	@Override
	public String toString() {
		return "CarBody [name=" + name + ", numOfDoors=" + numOfDoors + ", clearance=" + clearance
				+ ", lengthOfCarBody=" + lengthOfCarBody + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(clearance, lengthOfCarBody, name, numOfDoors);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarBody other = (CarBody) obj;
		return clearance == other.clearance && lengthOfCarBody == other.lengthOfCarBody
				&& Objects.equals(name, other.name) && numOfDoors == other.numOfDoors;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getNumOfDoors() {
		return numOfDoors;
	}

	public final void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public final int getClearance() {
		return clearance;
	}

	public final void setClearance(int clearance) {
		this.clearance = clearance;
	}

	public final double getLengthOfCarBody() {
		return lengthOfCarBody;
	}

	public final void setLengthOfCarBody(int lengthOfCarBody) {
		this.lengthOfCarBody = lengthOfCarBody;
	}
}
