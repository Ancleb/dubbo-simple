package com.yyl.consumer.controller;

import com.yyl.api.entity.User;
import com.yyl.api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yyl
 * 2021/12/15 11:25
 */
@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {
    private UserService userService;


    @GetMapping("userInfo/{userId}")
    public User getUserInfo(@PathVariable int userId) {
        return userService.getUserById(userId);
    }
}
