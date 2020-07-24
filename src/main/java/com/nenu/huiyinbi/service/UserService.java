package com.nenu.huiyinbi.service;

import com.nenu.huiyinbi.dao.UserMapper;
import com.nenu.huiyinbi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther hiber
 * @create 2020/7/22
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id){
        return userMapper.selectById(id);
    }
}
