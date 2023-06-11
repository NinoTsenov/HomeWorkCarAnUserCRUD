package com.advanceaccademy.restfullapi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CarRequest {


    private long id;

    @NotBlank
    private String brand;

    @NotBlank
    private String model;

    @NotBlank
    private String carVin;

    @NotBlank
    private String carNumber;
}
