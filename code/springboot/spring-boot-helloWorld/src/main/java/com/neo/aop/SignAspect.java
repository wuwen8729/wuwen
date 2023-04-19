package com.neo.aop;

/**
 * @Name ：SignAspect
 * @Description ：
 * @Author ：wenbin
 * @Date ：2023/4/13 17:03
 * @History ：
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 判断请求参数的sign是否正确的 切面类
 */
@Order(1)
@Aspect
@Component
public class SignAspect {
    @Around("execution(public void com.neo.controller.LoginController.*(String,String))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("SignAspect#around开始...");
        joinPoint.proceed();
        System.out.println("SignAspect#around结束...");
    }
}

