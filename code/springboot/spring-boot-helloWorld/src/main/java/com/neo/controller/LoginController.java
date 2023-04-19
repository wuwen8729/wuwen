package com.neo.controller;

/**
 * @Name ：LoginController
 * @Description ：
 * @Author ：wenbin
 * @Date ：2023/4/13 16:32
 * @History ：
 */

import org.springframework.stereotype.Controller;

/**
 * 登录控制器
 */
@Controller
public class LoginController {

    //向外面抛出异常
    public void loginWithThrow(String username, String password) throws Exception {
        if (username == null || password == null) {
            throw new Exception("登录信息不可为空啊");
        }
        System.out.println("LoginController#login...");
    }

    //抛出异常自己捕获的情况
    public void loginWithTryCatch(String username, String password) {
        try{
            if (username == null || password == null) {
                throw new Exception("登录信息不可为空啊");
            }
            System.out.println("LoginController#login...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
