package com.wyk.example.mapper;

import com.wyk.example.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wyk
 * @Description:
 * @Date: Create in 2019/12/21 20:46
 * @Modified By:
 */
@Mapper
public interface UserMapper {

    void insert(User user);

    int update(User user);

    List<User> selectUserList(User user);

}
