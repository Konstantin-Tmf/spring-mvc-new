package web.sevice;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> filterCar(int count);
}