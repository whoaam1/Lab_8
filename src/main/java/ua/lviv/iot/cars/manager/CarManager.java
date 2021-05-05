package ua.lviv.iot.cars.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.lviv.iot.cars.models.Car;
import ua.lviv.iot.cars.enums.Standard;
import ua.lviv.iot.cars.enums.SortOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor

public class CarManager {
    private List<Car> vehicles;

    public List<Car> find_by_standard(final Standard standardType) {
        return vehicles.stream().filter(item -> item.getStandardType() == standardType).collect(Collectors.toList());
    }

    public List<Car> sortByPrice(final SortOrder sortOrder) {
        List<Car> sortedCars = new ArrayList<>(vehicles);
        if (sortOrder == SortOrder.ASC) {
            sortedCars.sort((vehicle1, vehicle2) ->
                    vehicle1.getPrice().compareTo(vehicle2.getPrice()));
        } else{
            sortedCars.sort((vehicle1, vehicle2) ->
                    vehicle2.getPrice().compareTo(vehicle1.getPrice()));
        }
        return sortedCars;
    }

    public List<Car> sortByVolume(final SortOrder sortOrder) {
        List<Car> sortedCars = new ArrayList<>(vehicles);
        if (sortOrder == SortOrder.ASC) {
            sortedCars.sort((vehicle1, vehicle2) ->
                    vehicle1.getVolume().compareTo(vehicle2.getVolume()));
        } else{
            sortedCars.sort((vehicle1, vehicle2) ->
                    vehicle2.getVolume().compareTo(vehicle1.getVolume()));
        }
        return sortedCars;
    }

    public static void printCars(final List<Car> vehicles) {
        vehicles.forEach(System.out::println);
    }

}
