package ua.com.foxminded.carinformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class MyCar {
	public static void main(String[] args) {

		Car audi = new Car("Q8", 2022, new Engine("WOR74T69", "Fuel", 6, 3, 190), new CarBody("Crossover", 5, 32, 4.6),
				new SterioSystem("Bose", 0.4, 16), new Wheel("Yokohama", "Japan", 20, "Summer"));

		Car nissan = new Car("Murano", 2023, new Engine("DFG6599WWR", "Gas", 6, 3, 171), new CarBody("SUV", 5, 36, 4.5),
				new SterioSystem("Pioneer", 0.45, 14), new Wheel("Vredestein", "Holland", 19, "AllSeasons"));

		Car toyota = new Car("Corolla", 2022, new Engine("YT008URE", "Diesel", 4, 2, 112),
				new CarBody("Sedan", 5, 21, 4.8), new SterioSystem("Mark Levinson", 0.3, 12),
				new Wheel("BridgeStone", "Japan", 17, "Winter"));

		EnumMap<TipeOfCar, List<Car>> exhibitionOfCars = new EnumMap<TipeOfCar, List<Car>>(TipeOfCar.class);
		exhibitionOfCars.put(TipeOfCar.CROSSOVER, Arrays.asList(audi));
		exhibitionOfCars.put(TipeOfCar.SEDAN, Arrays.asList(nissan));
		exhibitionOfCars.put(TipeOfCar.SUV, Arrays.asList(toyota));
		for (Map.Entry entry : exhibitionOfCars.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
