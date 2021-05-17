package ua.lviv.iot.cars.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import ua.lviv.iot.cars.enums.Fuel;
import ua.lviv.iot.cars.enums.Standard;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Bmw extends Sedan {
    public String sportSeries;
    public String typeOfBrakes;

    public Bmw(final Float weight, final String color, final Integer volume, final Standard standardType,
               final Float engineCapacity, final Integer price, final Fuel fuel, final Integer numberOfWheels,
               final String vehicleType, final Integer volumeOfTrunk, final String sportSeries, final String typeOfBrakes) {
        super(weight, color, volume, standardType, engineCapacity, price, fuel, numberOfWheels, vehicleType,
                volumeOfTrunk);
        this.sportSeries = sportSeries;
        this.typeOfBrakes = typeOfBrakes;
    }
}
