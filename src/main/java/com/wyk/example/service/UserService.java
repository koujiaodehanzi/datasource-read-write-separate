package com.wyk.example.service;

import com.wyk.example.po.User;

import java.util.List;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/12/21 21:11
 * @Modified By:
 */
public interface UserService {

    void insert(User user);

    int update(User user);

    List<User> selectUserList(User user);

    List<User> selectUserListWithMaster(User user);

}
