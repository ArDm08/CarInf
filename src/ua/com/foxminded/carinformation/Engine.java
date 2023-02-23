package ua.com.foxminded.carinformation;

import java.util.Objects;

public class Engine {
	private String name;
	private String tipeOffuel;
	private int numOfPistons;
	private int volumeEngine;
	private int power;

	public Engine(String name, String tipeOffuel, int numOfPistons, int volumeEngine, int power) {
		this.name = name;
		this.tipeOffuel = tipeOffuel;
		this.numOfPistons = numOfPistons;
		this.volumeEngine = volumeEngine;
		this.power = power;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", tipeOffuel=" + tipeOffuel + ", numOfPistons=" + numOfPistons
				+ ", volumeEngine=" + volumeEngine + ", power=" + power + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, numOfPistons, power, tipeOffuel, volumeEngine);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		return Objects.equals(name, other.name) && numOfPistons == other.numOfPistons && power == other.power
				&& Objects.equals(tipeOffuel, other.tipeOffuel) && volumeEngine == other.volumeEngine;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getTipeOffuel() {
		return tipeOffuel;
	}

	public final void setTipeOffuel(String tipeOffuel) {
		this.tipeOffuel = tipeOffuel;
	}

	public final int getNumOfPistons() {
		return numOfPistons;
	}

	public final void setNumOfPistons(int numOfPistons) {
		this.numOfPistons = numOfPistons;
	}

	public final int getVolumeEngine() {
		return volumeEngine;
	}

	public final void setVolumeEngine(int volumeEngine) {
		this.volumeEngine = volumeEngine;
	}

	public final int getPower() {
		return power;
	}

	public final void setPower(int power) {
		this.power = power;
	}

}
