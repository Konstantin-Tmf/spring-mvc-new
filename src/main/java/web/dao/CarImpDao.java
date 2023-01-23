package web.dao;

import web.model.Car;

import java.util.List;

public interface CarImpDao {
    List<Car> carList();

    List<Car> filterCar(List<Car> cars, int value);

}
