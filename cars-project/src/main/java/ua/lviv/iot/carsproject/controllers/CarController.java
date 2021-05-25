package ua.lviv.iot.carsproject.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.carsproject.models.Car;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/cars")
@RestController
public class CarController {
    private final Map<Integer, Car> cars = new HashMap<>();
    private final AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public Collection<Car> getCars() {
        return new ArrayList<Car>(cars.values());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCar(@PathVariable("id") Integer id) {

        if (cars.get(id) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cars.get(id));

    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Car createCars(final @RequestBody Car car) {
        car.setId(idCounter.incrementAndGet());
        cars.put(car.getId(), car);
        return car;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Car> deleteCars(@PathVariable("id") int id) {
        HttpStatus status;
        if (cars.get(id) == null) {
            status = HttpStatus.NOT_FOUND;
        } else {
            status = HttpStatus.OK;
            cars.remove(id);
        }

        return ResponseEntity.status(status).build();

    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Car> updateCars(final @PathVariable("id") int id, final @RequestBody Car car) {
        HttpStatus status;
        if (cars.get(id) == null) {
            status = HttpStatus.NOT_FOUND;
        } else {
            status = HttpStatus.OK;
            car.setId(id);
            cars.put(id, car);
        }
        return ResponseEntity.status(status).build();
    }
}