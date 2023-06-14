package com.advanceaccademy.restfullapi.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CarResponse {


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
