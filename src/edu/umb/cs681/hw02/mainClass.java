package edu.umb.cs681.hw02;

import java.util.ArrayList;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Lexus", "LS", 10000, 2008, 12500.5f);
		Car car2 = new Car("Toyota", "Camry", 4501, 2012, 15500.6f);
		Car car3 = new Car("Audi", "Q3", 2300, 2019, 35000.0f);
		Car car4 = new Car("Chevrolet", "Malibu", 8800, 2014, 21550.6f);
		ArrayList<Car> usedCar = new ArrayList<>();

		usedCar.add(car1);
		usedCar.add(car2);
		usedCar.add(car3);
		usedCar.add(car4);

		System.out.println("Used cars information");
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		System.out.println(car4.toString());
		System.out.println();

		// sorting by price ascending
		System.out.println("By Price\n");
		System.out.println("sorting by price ascending");
		Car.sortCarByPriceAscending(usedCar);
		System.out.println();

		// sorting by price descending
		System.out.println("sorting by price descending");
		Car.sortCarByPriceDescending(usedCar);
		System.out.println();

		// sorting by mileage ascending
		System.out.println("By Mileage\n");
		System.out.println("sorting by mileage ascending");
		Car.sortCarByMileageAscending(usedCar);
		System.out.println();

		// sorting by mileage descending
		System.out.println("sorting by mileage descending");
		Car.sortCarByMileageDescending(usedCar);
		System.out.println();

		// sorting by Year ascending
		System.out.println("By Year\n");
		System.out.println("sorting by Year ascending");
		Car.sortCarByYearAscending(usedCar);
		System.out.println();

		// sorting by Year descending
		System.out.println("sorting by Year descending");
		Car.sortCarByYearDescending(usedCar);
		System.out.println();

		// setting up the domination count initially.
		for (Car car : usedCar) {
			car.setDominationCount(car, usedCar);
		}

		// sorting by Pareto ascending
		System.out.println("By Pareto\n");
		System.out.println("sorting by Pareto ascending ( ascending means the best cars to the worst cars)");
		Car.sortCarByParetoAscending(usedCar);
		System.out.println();

		// sorting by Pareto descending
		System.out.println("sorting by Pareto descending (descending means the worst cars to the best cars");
		Car.sortCarByParetoDescending(usedCar);
		System.out.println();
	}

}
