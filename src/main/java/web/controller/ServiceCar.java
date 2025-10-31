package web.controller;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceCar {

    private static final List<Car> cars = List.of(
            new Car("Model1", "red", 1995),
            new Car("Model2", "green", 2001),
            new Car("Model3", "blue", 2009),
            new Car("Model4", "white", 2025),
            new Car("Model5", "yellow", 1974));

    public static List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
