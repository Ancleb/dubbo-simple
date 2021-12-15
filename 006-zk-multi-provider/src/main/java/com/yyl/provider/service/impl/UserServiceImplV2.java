package com.yyl.provider.service.impl;

import com.yyl.api.entity.User;
import com.yyl.api.service.UserService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author com.yyl
 * 2021/12/14 9:42
 */
public class UserServiceImplV2 implements UserService {

    private static Map<Integer, User> userMap;

    static {
        userMap = new HashMap<>();
        userMap.put(4, new User(4, "赵六", 26));
        userMap.put(5, new User(5, "小七", 27));
        userMap.put(6, new User(6, "丈八", 28));
    }

    @Override
    public User getUserById(int id) {
        return userMap.get(id);
    }
}
