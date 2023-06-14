package com.advanceaccademy.restfullapi.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserRequest {


    private long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String familyName;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

}
