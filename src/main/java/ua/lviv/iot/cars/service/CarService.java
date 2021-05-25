package ua.lviv.iot.cars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.iot.cars.models.Car;
import ua.lviv.iot.cars.repository.CarRepository;

import java.util.List;
@Service
@Transactional

public class CarService {
    @Autowired
    private CarRepository carRepository;
    public List<Car> listAllCars() {
        return carRepository.findAll();
    }
    public void saveCar(Car car) {
        carRepository.save(car);

    }
    public Car getCar(Integer id) {
        return carRepository.findById(id).get();
    }
    public void deleteCar(Integer id) {
        carRepository.deleteById(id);
    }
}

