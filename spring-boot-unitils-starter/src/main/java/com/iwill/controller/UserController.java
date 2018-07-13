package com.iwill.controller;

import com.iwill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("get-username")
    public String getUsername(@RequestParam("userId") long userId) {
        return userService.getUsername(userId);
    }
}
