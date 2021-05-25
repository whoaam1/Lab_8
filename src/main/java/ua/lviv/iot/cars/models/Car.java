package ua.lviv.iot.cars.models;

import lombok.*;
import ua.lviv.iot.cars.enums.Fuel;
import ua.lviv.iot.cars.enums.Standard;

import javax.persistence.*;

@Table(name = "cars")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public Float weight;
    public String color;
    public Integer volume;
    public Standard standardType;
    public Float engineCapacity;
    public Integer price;
    public Fuel fuel;
    public Integer numberOfWheels;
}
