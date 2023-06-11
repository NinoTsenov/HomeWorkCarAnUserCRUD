package com.advanceaccademy.restfullapi.converter;

import com.advanceaccademy.restfullapi.dto.CarRequest;
import com.advanceaccademy.restfullapi.dto.CarResponse;
import com.advanceaccademy.restfullapi.entity.Car;
import org.springframework.stereotype.Component;

@Component
public class CarConverter {

    public Car toCar (CarRequest request){

        Car car = Car.builder()
                .brand(request.getBrand())
                .model(request.getModel())
                .carVin(request.getCarVin())
                .carNumber(request.getCarNumber())
                .build();
        return car;
    }

    public CarResponse toCarResponse(Car car){

        CarResponse carResponse = new CarResponse(car.getId(), car.getBrand(),
                car.getModel(), car.getCarVin(), car.getCarNumber());
        return carResponse;
    }

}
