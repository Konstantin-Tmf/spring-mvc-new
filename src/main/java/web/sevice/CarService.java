package web.sevice;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Component
public class CarService {
    private final CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }


    public List<Car> listCar() {
        return carDao.carList();
    }

    public List<Car> filter(List<Car> cars, int count) {
        return carDao.filterCar(cars, count);
    }
}
