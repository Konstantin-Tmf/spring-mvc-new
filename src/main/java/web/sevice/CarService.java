package web.sevice;

import web.dao.CarDao;
import web.dao.CarImpDao;
import web.model.Car;

import java.util.stream.Collectors;
import java.util.List;

public class CarService {
    private CarDao carImpDao = new CarDao();

    public List<Car> listCar() {
        return carImpDao.carList();
    }

    public List<Car> filter(List<Car> cars, int value) {
        return carImpDao.filterCar(cars, value);
    }
}
