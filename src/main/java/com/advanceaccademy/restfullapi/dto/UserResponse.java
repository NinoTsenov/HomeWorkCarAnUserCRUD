package com.advanceaccademy.restfullapi.dto;

import com.advanceaccademy.restfullapi.entity.Car;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserResponse {


    private long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String familyName;

    @NotBlank
    private String email;

    private Set<Car> cars;
}
