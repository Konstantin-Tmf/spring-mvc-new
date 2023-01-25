package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Component
public class CarImpDao implements CarDao {

    @Override
    public List<Car> carList() {

        List<Car> carList;

        {
            carList = new ArrayList<>();

            carList.add(new Car("Ford", "Mustang GT500", "yellow"));
            carList.add(new Car("Audi", "A7", "red"));
            carList.add(new Car("Peugeot", "406", "green"));
            carList.add(new Car("Mercedes", "600", "blue"));
            carList.add(new Car("Fiat", "124", "black"));
            return carList;
        }
    }

    @Override
    public List<Car> filterCar(List<Car> cars, int count) {
        if (count < 0) {
            return null;
        }
        if (count == 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }


}