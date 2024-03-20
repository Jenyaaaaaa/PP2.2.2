package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarsDao carsDao;

    public CarServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    public List<Car> getCarsCount(Integer countCars) {
        return carsDao.getCarsCount(countCars);
    }
}