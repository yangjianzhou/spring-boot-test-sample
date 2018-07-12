package com.iwill;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @GetMapping("get-username")
    public String getUsername(@RequestParam("userId") long userId) {
        return "zhangsan";
    }
}
