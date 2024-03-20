package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsDaoImpl implements CarsDao{

    private static List<Car> cars;
    static {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Car1", 1));
        cars.add(new Car(2, "Car2", 2));
        cars.add(new Car(3, "Car3", 3));
        cars.add(new Car(4, "Car4", 4));
        cars.add(new Car(5, "Car5", 5));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsCount(Integer countCars) {
        List<Car> list = getCars();
        if (countCars == null || countCars < 0 || countCars > list.size()) {
            countCars = list.size();
        }
        return list.stream().limit(countCars).toList();
    }
}