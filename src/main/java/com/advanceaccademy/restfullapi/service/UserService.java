package com.advanceaccademy.restfullapi.service;
import com.advanceaccademy.restfullapi.dto.UserRequest;
import com.advanceaccademy.restfullapi.dto.UserResponse;

public interface UserService {
    UserResponse saveUser(UserRequest request);

    UserResponse getUser(Long id);

    void deletedUser(Long id);

}
