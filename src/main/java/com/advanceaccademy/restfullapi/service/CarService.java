package com.advanceaccademy.restfullapi.service;
import com.advanceaccademy.restfullapi.dto.CarRequest;
import com.advanceaccademy.restfullapi.dto.CarResponse;


public interface CarService {

    CarResponse saveUser(CarRequest request);

    CarResponse getCar(Long id);

    void deletedCar(Long id);
}
