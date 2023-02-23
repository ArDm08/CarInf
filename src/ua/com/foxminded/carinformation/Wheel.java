package ua.com.foxminded.carinformation;

import java.util.Objects;

public class Wheel {
	private String name;
	private String countryOfProduct;
	private int radius;
	private String tipe;

	public Wheel(String name, String countryOfProduct, int radius, String tipe) {
		this.name = name;
		this.countryOfProduct = countryOfProduct;
		this.radius = radius;
		this.tipe = tipe;
	}

	@Override
	public String toString() {
		return "Wheel [name=" + name + ", countryOfProduct=" + countryOfProduct + ", radius=" + radius + ", tipe="
				+ tipe + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(countryOfProduct, name, radius, tipe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		return Objects.equals(countryOfProduct, other.countryOfProduct) && Objects.equals(name, other.name)
				&& radius == other.radius && Objects.equals(tipe, other.tipe);
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getCountryOfProduct() {
		return countryOfProduct;
	}

	public final void setCountryOfProduct(String countryOfProduct) {
		this.countryOfProduct = countryOfProduct;
	}

	public final int getRadius() {
		return radius;
	}

	public final void setRadius(int radius) {
		this.radius = radius;
	}

	public final String getTipe() {
		return tipe;
	}

	public final void setTipe(String tipe) {
		this.tipe = tipe;
	}
}
