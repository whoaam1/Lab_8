package ua.lviv.iot.cars;

import ua.lviv.iot.cars.enums.*;
import ua.lviv.iot.cars.manager.CarManager;
import ua.lviv.iot.cars.models.*;


import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
                Bmw bmw = new Bmw(2560.5f,  "Black", 5, Standard.EURO_5, 20.1f,
                        30000, Fuel.GASOLINE, 4, "Sedan", 80, "M5",
                        "Hydraulic");
                Daf daf = new Daf(7560.5f,  "White", 2, Standard.EURO_6, 20.2f,
                        25000, Fuel.GAS, 8, "On-board", "Truck", 3,
                        70);
                Mercedes mercedes = new Mercedes(3100.2f,  "Silver", 3, Standard.EURO_5, 20.2f,
                        15000, Fuel.DIESEL, 4, 3, 150, "AMG",
                        31);

        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(bmw);
        listOfCars.add(daf);
        listOfCars.add(mercedes);

        CarManager carManager = new CarManager(listOfCars);

        System.out.println("Cars found by standard:");
        CarManager.printCars(carManager.find_by_standard(Standard.EURO_5));
        System.out.print("\n");

        System.out.println("Cars sorted by price:");
        CarManager.printCars(carManager.sortByPrice(SortOrder.ASC));
        System.out.print("\n");

        System.out.println("Cars sorted by volume:");
        CarManager.printCars(carManager.sortByVolume(SortOrder.DESC));
    }
}
