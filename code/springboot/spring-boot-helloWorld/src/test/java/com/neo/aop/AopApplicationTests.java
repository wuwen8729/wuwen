package com.neo.aop;

import com.neo.controller.LoginController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Name ：AopApplicationTests
 * @Description ：
 * @Author ：wenbin
 * @Date ：2023/4/13 17:04
 * @History ：
 */

@SpringBootTest
class AopApplicationTests {
    @Autowired
    private LoginController loginController;

    @Test
    void contextLoads() {
        loginController.loginWithTryCatch("yuki", "1234");
    }
}
