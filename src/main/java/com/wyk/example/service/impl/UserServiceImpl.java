package com.wyk.example.service.impl;

import com.wyk.example.aop.annotation.DataSource;
import com.wyk.example.mapper.UserMapper;
import com.wyk.example.po.User;
import com.wyk.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/12/21 21:11
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @DataSource("master")
    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @DataSource("master")
    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @DataSource("slave1")
    @Override
    public List<User> selectUserList(User user) {
        return userMapper.selectUserList(user);
    }

    @DataSource("master")
    @Override
    public List<User> selectUserListWithMaster(User user) {
        return null;
    }
}
