package com.yang;


import com.yang.controller.UserController;
import com.yang.entry.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SbtestApplicationTests {

    @Autowired
    private UserController userController;

    @Test
    public void contextLoads() {
    }

    @Test
    public void userControllertest() {
        List<User> users = userController.selectUsers(new User());

        users.stream().forEach(user -> System.out.println(user.toString()));

        User userCon = new User();
        userCon.setAddress("Washington");

        userCon.setName("Redskins");
        int flag1 = userController.updateUser(userCon);

        System.out.println(flag1);
        int flag2 = userController.deleteUser(userCon);
        System.out.println(flag2);
    }

}
