package com.advanceaccademy.restfullapi.service.impl;
import com.advanceaccademy.restfullapi.converter.UserConverter;
import com.advanceaccademy.restfullapi.dto.UserRequest;
import com.advanceaccademy.restfullapi.dto.UserResponse;
import com.advanceaccademy.restfullapi.entity.User;
import com.advanceaccademy.restfullapi.repository.UserRepository;
import com.advanceaccademy.restfullapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserConverter userConverter;
    private final UserRepository userRepository;
    @Autowired

    public UserServiceImpl(UserConverter userConverter, UserRepository userRepository) {
        this.userConverter = userConverter;
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse saveUser(UserRequest request) {
        User user = userConverter.toUser(request);
        User savedUser = userRepository.save(user);


        return userConverter.toUserResponse(savedUser);
    }

    @Override
    public UserResponse getUser(Long id) {
        User user = userRepository.findById(id).orElse(new User());
        return userConverter.toUserResponse(user);
    }

    @Override
    public void deletedUser(Long id) {
        userRepository.deleteById(id);
    }
}
