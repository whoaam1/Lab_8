package ua.lviv.iot.cars;

import ua.lviv.iot.cars.enums.*;
import ua.lviv.iot.cars.manager.CarManager;
import ua.lviv.iot.cars.models.*;


import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Car> listOfCars = List.of(
                new Bmw(2560.5f,  "Black", 5, Standard.EURO_5, 20.1f,
                        30000, Fuel.GASOLINE, 4, "Sedan", 80, "M5",
                        "Hydraulic"),
                new Daf(7560.5f,  "White", 2, Standard.EURO_6, 20.2f,
                        25000, Fuel.GAS, 8, "On-board", "Truck", 3,
                        70),
                new Mercedes(3100.2f,  "Silver", 3, Standard.EURO_5, 20.2f,
                        15000, Fuel.DIESEL, 4, 3, 150, "AMG",
                        31));

        CarManager carManager = new CarManager(listOfCars);

        System.out.print("Devices found by standard:" + "\n" + "\n");
        CarManager.printCars(carManager.find_by_standard(Standard.EURO_5));
        System.out.print("\n");

        System.out.print("Devices sorted by price:" + "\n" + "\n");
        CarManager.printCars(carManager.sortByPrice(SortOrder.ASC));
        System.out.print("\n");

        System.out.print("Devices sorted by volume:" + "\n" + "\n");
        CarManager.printCars(carManager.sortByVolume(SortOrder.DESC));
    }
}
