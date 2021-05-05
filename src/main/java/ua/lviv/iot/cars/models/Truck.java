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

    public Truck(Float weight, String color, Integer volume, Standard standardType, Float engineCapacity,
                 Integer price, Fuel fuel, Integer numberOfWheels, String typeOfTrailer, String typeOfTrucks){
        super(weight, color, volume, standardType, engineCapacity, price, fuel, numberOfWheels);
        this.typeOfTrailer = typeOfTrailer;
        this.typeOfTrucks = typeOfTrucks;
    }

    @Override
    public String toString() {
        return "Truck{" +
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
                ", typeOfTrailer='" + typeOfTrailer + '\'' +
                ", typeOfTrucks='" + typeOfTrucks + '\'' +
                '}';
    }
}
