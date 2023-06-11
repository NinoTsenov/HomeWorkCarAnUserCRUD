package com.advanceaccademy.restfullapi.repository;

import com.advanceaccademy.restfullapi.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
