package com.advanceaccademy.restfullapi.converter;

import com.advanceaccademy.restfullapi.dto.UserRequest;
import com.advanceaccademy.restfullapi.dto.UserResponse;
import com.advanceaccademy.restfullapi.entity.User;
import org.springframework.stereotype.Component;

@Component

public class UserConverter {

    public User toUser (UserRequest request){
        User user = User.builder()
                .firstName(request.getFirstName())
                .familyName(request.getFamilyName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
        return user;
    }

    public UserResponse toUserResponse(User user){

        UserResponse userResponse = new UserResponse(user.getId(), user.getFirstName(),
                user.getFamilyName(), user.getEmail());
                return userResponse;
    }
}
