package ua.lviv.iot.cars.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import lombok.ToString;
import ua.lviv.iot.cars.enums.Fuel;
import ua.lviv.iot.cars.enums.Standard;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Sedan extends Car {
    public String vehicleType;
    public Integer volumeOfTrunk;

    public Sedan(final Float weight, final String color, final Integer volume, final Standard standardType,
                 final Float engineCapacity, final Integer price, final Fuel fuel, final Integer numberOfWheels,
                 final String vehicleType, final Integer volumeOfTrunk) {
        super(weight, color, volume, standardType, engineCapacity, price, fuel, numberOfWheels);
        this.vehicleType = vehicleType;
        this.volumeOfTrunk = volumeOfTrunk;
    }
}
