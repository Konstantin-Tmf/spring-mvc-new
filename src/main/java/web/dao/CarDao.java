package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDao implements CarImpDao {

    @Override
    public List<Car> carList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Ford", "Mustang GT500", "yellow"));
        carList.add(new Car("Audi", "A7", "red"));
        carList.add(new Car("Peugeot", "406", "green"));
        carList.add(new Car("Mercedes", "600", "blue"));
        carList.add(new Car("Fiat", "124", "black"));
        return carList;

    }

    @Override
    public List<Car> filterCar(List<Car> cars, int value) {
        if (value < 0) {
            return null;
        }
        if (value == 0 || value >= 5) {
            return cars;
        }
        return cars.stream().limit(value).collect(Collectors.toList());
    }
}
