package com.advanceaccademy.restfullapi.controller;
import com.advanceaccademy.restfullapi.dto.UserRequest;
import com.advanceaccademy.restfullapi.dto.UserResponse;
import com.advanceaccademy.restfullapi.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/v1/user")
public class userController {

    @Autowired
    UserService userService;

    @PostMapping()
    public ResponseEntity<String> addUser(@Valid @RequestBody UserRequest request){

      UserResponse userResponse =  userService.saveUser(request);
      String response = String.format("User with first name %s was created with %s id",
              userResponse.getFirstName(), userResponse.getId());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById (@PathVariable Long id){
        return  ResponseEntity.status(HttpStatus.FOUND).body(userService.getUser(id));
    }

    @DeleteMapping("/{id}")
    public HttpStatus deletedUser(@PathVariable Long id){
        userService.deletedUser(id);
        return HttpStatus.ACCEPTED;
    }

}
