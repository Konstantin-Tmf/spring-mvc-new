package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("Ford", "Mustang GT500", "yellow"));
        carList.add(new Car("Audi", "A7", "red"));
        carList.add(new Car("Peugeot", "406", "green"));
        carList.add(new Car("Mercedes", "600", "blue"));
        carList.add(new Car("Fiat", "124", "black"));

    }


    @Override
    public List<Car> filterCar(int count) {
        if (count < 0) {
            return null;
        }
        if (count == 0 || count >= 5) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }


}