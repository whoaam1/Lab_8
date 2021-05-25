package ua.lviv.iot.cars.models;

import lombok.*;

import ua.lviv.iot.cars.enums.Fuel;
import ua.lviv.iot.cars.enums.Standard;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)

public class Truck extends Car{
    public String typeOfTrailer;
    public String typeOfTrucks;

    public Truck(Integer id, Float weight, String color, Integer volume, Standard standardType, Float engineCapacity,
                 Integer price, Fuel fuel, Integer numberOfWheels, String typeOfTrailer, String typeOfTrucks){
        super(id, weight, color, volume, standardType, engineCapacity, price, fuel, numberOfWheels);
        this.typeOfTrailer = typeOfTrailer;
        this.typeOfTrucks = typeOfTrucks;
    }

}
