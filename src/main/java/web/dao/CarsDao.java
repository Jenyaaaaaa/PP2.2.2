package web.dao;

import web.models.Car;

import java.util.List;

public interface CarsDao {
    List<Car> getCars();
    List<Car> getCarsCount(Integer countCars);
}
