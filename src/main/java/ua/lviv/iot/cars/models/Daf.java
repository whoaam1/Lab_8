package ua.lviv.iot.cars.models;

import lombok.*;

import ua.lviv.iot.cars.enums.Fuel;
import ua.lviv.iot.cars.enums.Standard;

@Data
@EqualsAndHashCode(callSuper = true)

public class Daf extends Truck{
    public Integer torque;
    public Integer topSpeed;

    public Daf(final Float weight, final String color, final Integer volume, final Standard standardType,
               final Float engineCapacity, final Integer price, final Fuel fuel, final Integer numberOfWheels,
               final String typeOfTrailer, final String typeOfTrucks, final Integer torque, final Integer topSpeed){
        super(weight, color, volume, standardType, engineCapacity, price, fuel, numberOfWheels, typeOfTrailer,
                typeOfTrucks);
        this.torque = torque;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Daf{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                ", standardType=" + standardType +
                ", engineCapacity=" + engineCapacity +
                ", price=" + price +
                ", fuel=" + fuel +
                ", numberOfWheels=" + numberOfWheels +
                ", torque=" + torque +
                ", topSpeed=" + topSpeed +
                ", standardType=" + standardType +
                ", fuel=" + fuel +
                ", typeOfTrailer='" + typeOfTrailer + '\'' +
                ", typeOfTrucks='" + typeOfTrucks + '\'' +
                '}';
    }
}
