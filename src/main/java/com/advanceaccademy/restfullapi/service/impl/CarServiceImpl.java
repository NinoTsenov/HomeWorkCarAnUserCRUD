package com.advanceaccademy.restfullapi.service.impl;
import com.advanceaccademy.restfullapi.converter.CarConverter;
import com.advanceaccademy.restfullapi.dto.CarRequest;
import com.advanceaccademy.restfullapi.dto.CarResponse;
import com.advanceaccademy.restfullapi.entity.Car;
import com.advanceaccademy.restfullapi.repository.CarRepository;
import com.advanceaccademy.restfullapi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    private final CarConverter carConverter;
    private final CarRepository carRepository;
    @Autowired
    public CarServiceImpl(CarConverter carConverter, CarRepository carRepository) {
        this.carConverter = carConverter;
        this.carRepository = carRepository;
    }

    @Override
    public CarResponse saveUser(CarRequest request) {

        Car car = carConverter.toCar(request);
        Car savedCar = carRepository.save(car);

        return carConverter.toCarResponse(savedCar);
    }

    @Override
    public CarResponse getCar(Long id) {
        Car car = carRepository.findById(id).orElse(new Car());
        return carConverter.toCarResponse(car);
    }

    @Override
    public void deletedCar(Long id) {
        carRepository.deleteById(id);
    }
}
