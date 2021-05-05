package ua.lviv.iot.cars.models;

import lombok.*;

import ua.lviv.iot.cars.enums.Fuel;
import ua.lviv.iot.cars.enums.Standard;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)

public class Car {
    public Float weight;
    public String color;
    public Integer volume;
    public Standard standardType;
    public Float engineCapacity;
    public Integer price;
    public Fuel fuel;
    public Integer numberOfWheels;

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                ", standardType=" + standardType +
                ", engineCapacity=" + engineCapacity +
                ", price=" + price +
                ", fuel=" + fuel +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }
}
