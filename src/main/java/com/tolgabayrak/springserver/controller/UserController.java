package com.tolgabayrak.springserver.controller;

import com.tolgabayrak.springserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/users")
public class UserController {
    @Autowired
    UserService userService;
}
