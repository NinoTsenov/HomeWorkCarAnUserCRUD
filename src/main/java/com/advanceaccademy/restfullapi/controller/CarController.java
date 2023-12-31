package com.advanceaccademy.restfullapi.controller;
import com.advanceaccademy.restfullapi.dto.CarRequest;
import com.advanceaccademy.restfullapi.dto.CarResponse;
import com.advanceaccademy.restfullapi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/car")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping
    public ResponseEntity<String> addCar(@Valid @RequestBody CarRequest request){

      CarResponse carResponse = carService.saveUser(request);
      String response = String.format("Car with brand %s was created with %s id",
              carResponse.getBrand(),carResponse.getId());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarResponse> getCar(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(carService.getCar(id));
    }



    @DeleteMapping("/{id}")
    public HttpStatus deletedCar (@PathVariable Long id){
        carService.deletedCar(id);
        return HttpStatus.ACCEPTED;
    }
}
