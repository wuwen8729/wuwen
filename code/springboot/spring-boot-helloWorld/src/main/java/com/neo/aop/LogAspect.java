package com.neo.aop;

/**
 * @Name ：LogAspect
 * @Description ：
 * @Author ：wenbin
 * @Date ：2023/4/13 16:32
 * @History ：
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 输出日志注解
 */
@Order(0)
@Aspect
@Component
public class LogAspect {

    //抽出共通的execution用的
    //com.yuki.demo.aop.aspect 包或者子包下所有类的方法
    @Pointcut("execution(* com.neo.controller..*.*(..))")
    public void pointcut(){
    }

    //前置通知
//    @Before("execution(public void com.yuki.demo.aop.aspect.LoginController.*(String,String))")
    @Before("pointcut()")
    public void before() {
        System.out.println("LogAspect#before...");
    }

    //环绕通知
    //ProceedingJoinPoint 只有环绕通知有
    @Around("execution(public void com.neo.controller.LoginController.*(String,String))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("LogAspectA#around开始...");
        //代理方法的执行，如果没有joinPoint.proceed() ,则前置通知@Before 不会执行，其它的通知正常
        joinPoint.proceed();
        //执行方法之后，如果joinPoint.proceed() 抛出了异常，则该句不会执行，抛出异常后直接跳出了aroud方法了
        System.out.println("LogAspectA#around结束...");
    }

    //后置通知（只要连接点被执行，不管是否抛出异常）
    @After("execution(public void com.neo.controller.LoginController.*(String,String))")
    public void after() {
        System.out.println("LogAspect#after...");
    }

    //异常通知（只有在joinPoint.proceed()方法执行向外面抛出了异常，才会执行该通知）
    @AfterThrowing("execution(public void com.neo.controller.LoginController.*(String,String))")
    public void afterThrowing() {
        System.out.println("LogAspect#afterThrowing...");
    }

    //正常的返回通知通知（正常结束了才会执行该通知）
    @AfterReturning("execution(public void com.neo.controller.LoginController.*(String,String))")
    public void afterReturning() {
        System.out.println("LogAspect#afterReturning...");
    }
}

