package com.yyl.provider.service.impl;

import com.yyl.api.entity.User;
import com.yyl.api.service.UserService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author com.yyl
 * 2021/12/14 9:42
 */
public class UserServiceImpl implements UserService {

    private static Map<Integer, User> userMap;

    static {
        userMap = new HashMap<>();
        userMap.put(1, new User(1, "张三", 23));
        userMap.put(2, new User(2, "李四", 24));
        userMap.put(3, new User(3, "王五", 25));
    }

    @Override
    public User getUserById(int id) {
        return userMap.get(id);
    }
}
