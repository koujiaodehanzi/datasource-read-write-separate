package com.wyk.example;

import com.wyk.example.po.User;
import com.wyk.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ExampleApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testWrite() {
        User user = new User();
        user.setName("zhangsan");
        userService.insert(user);
    }

    @Test
    public void testSave() {
        User user = new User();
        user.setName("wangwu");
        userService.insert(user);
    }

    @Test
    public void testRead() {
        List<User> userList = userService.selectUserList(new User());
        if (!CollectionUtils.isEmpty(userList)){
            for (User user : userList){
                System.out.println(user);
            }
        }
    }

    @Test
    public void testReadFromMaster() {
        List<User> userList = userService.selectUserListWithMaster(new User());
        if (!CollectionUtils.isEmpty(userList)){
            for (User user : userList){
                System.out.println(user);
            }
        }
    }

}
