package ua.lviv.iot.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.cars.models.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
