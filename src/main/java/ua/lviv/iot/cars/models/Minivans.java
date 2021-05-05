package ua.lviv.iot.cars.models;

import lombok.*;

import ua.lviv.iot.cars.enums.Fuel;
import ua.lviv.iot.cars.enums.Standard;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)

public class Minivans extends Car{
    public Integer numberOfRows;
    public Integer volumeOfTrunk;

    public Minivans(Float weight, String color, Integer volume, Standard standardType, Float engineCapacity,
                    Integer price, Fuel fuel, Integer numberOfWheels, Integer numberOfRows, Integer volumeOfTrunk){
        super(weight, color, volume, standardType, engineCapacity, price, fuel, numberOfWheels);
        this.numberOfRows = numberOfRows;
        this.volumeOfTrunk = volumeOfTrunk;
    }

    @Override
    public String toString() {
        return "Minivans{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                ", standardType=" + standardType +
                ", engineCapacity=" + engineCapacity +
                ", price=" + price +
                ", fuel=" + fuel +
                ", numberOfWheels=" + numberOfWheels +
                ", standardType=" + standardType +
                ", fuel=" + fuel +
                ", numberOfRows=" + numberOfRows +
                ", volumeOfTrunk=" + volumeOfTrunk +
                '}';
    }
}
