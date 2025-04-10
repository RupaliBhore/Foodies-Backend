package in.rupalibhore.foodiesapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import in.rupalibhore.foodiesapi.io.UserRequest;
import in.rupalibhore.foodiesapi.io.UserResponse;
import in.rupalibhore.foodiesapi.service.UserService;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;


    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse register(@RequestBody UserRequest request) {
        return userService.registerUser(request);
    }
}