package ua.lviv.iot.cars.models;

import lombok.*;

import ua.lviv.iot.cars.enums.Fuel;
import ua.lviv.iot.cars.enums.Standard;

@Data
@EqualsAndHashCode(callSuper = true)

public class Mercedes extends Minivans{
    public String sportSeries;
    public Integer clearance;

    public Mercedes(final Float weight, final String color, final Integer volume, final Standard standardType,
                    final Float engineCapacity, final Integer price, final Fuel fuel, final Integer numberOfWheels,
                    final Integer numberOfRows, final Integer volumeOfTrunk, final String sportSeries,
                    final Integer clearance){
        super(weight, color, volume, standardType, engineCapacity, price, fuel, numberOfWheels, numberOfRows,
                volumeOfTrunk);
        this.sportSeries = sportSeries;
        this.clearance = clearance;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                ", standardType=" + standardType +
                ", engineCapacity=" + engineCapacity +
                ", price=" + price +
                ", fuel=" + fuel +
                ", numberOfWheels=" + numberOfWheels +
                ", sportSeries='" + sportSeries + '\'' +
                ", clearance=" + clearance +
                ", standardType=" + standardType +
                ", fuel=" + fuel +
                ", numberOfRows=" + numberOfRows +
                ", volumeOfTrunk=" + volumeOfTrunk +
                '}';
    }
}
