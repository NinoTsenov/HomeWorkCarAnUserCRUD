package com.advanceaccademy.restfullapi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

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
}
