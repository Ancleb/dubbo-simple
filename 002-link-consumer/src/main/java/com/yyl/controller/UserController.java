package com.yyl.controller;

import com.yyl.entity.User;
import com.yyl.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author com.yyl
 * 2021/12/14 10:06
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
