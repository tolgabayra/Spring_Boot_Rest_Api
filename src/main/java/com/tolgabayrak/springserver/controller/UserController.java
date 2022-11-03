package com.tolgabayrak.springserver.controller;

import com.tolgabayrak.springserver.model.User;
import com.tolgabayrak.springserver.service.UserService;
import org.apache.coyote.Request;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return ResponseEntity.ok(userService.createUser(user)).getBody();
    }



}
