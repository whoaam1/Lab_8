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

public class Minivans extends Car {
    public Integer numberOfRows;
    public Integer volumeOfTrunk;

    public Minivans(final Float weight, final String color, final Integer volume, final Standard standardType,
                    final Float engineCapacity, final Integer price, final Fuel fuel, final Integer numberOfWheels,
                    final Integer numberOfRows, final Integer volumeOfTrunk) {
        super(weight, color, volume, standardType, engineCapacity, price, fuel, numberOfWheels);
        this.numberOfRows = numberOfRows;
        this.volumeOfTrunk = volumeOfTrunk;
    }
}
