package ua.lviv.iot.carsproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private Integer id;
    private Float weight;
    private String color;
    private Integer volume;
    private Float engineCapacity;
    private Integer price;
    private Integer numberOfWheels;
}
