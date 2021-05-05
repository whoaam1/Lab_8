package ua.lviv.iot.cars.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import ua.lviv.iot.cars.enums.Fuel;
import ua.lviv.iot.cars.enums.Standard;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)

public class Sedan extends Car {
    public String vehicleType;
    public Integer volumeOfTrunk;

    public Sedan(Float weight, String color, Integer volume, Standard standardType, Float engineCapacity,
                 Integer price, Fuel fuel, Integer numberOfWheels, String vehicleType, Integer volumeOfTrunk){
        super(weight, color, volume, standardType, engineCapacity, price, fuel, numberOfWheels);
        this.vehicleType = vehicleType;
        this.volumeOfTrunk = volumeOfTrunk;
    }

    @Override
    public String toString() {
        return "Sedan{" +
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
                ", vehicleType='" + vehicleType + '\'' +
                ", volumeOfTrunk=" + volumeOfTrunk +
                '}';
    }
}
