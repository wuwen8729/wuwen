package com.neo.util;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

/**
 * @Name ：TimeUtil
 * @Description ：
 * @Author ：wenbin
 * @Date ：2023/4/19 16:51
 * @History ：
 */

@SpringBootTest
public class TimeUtil {
    @Test
  public   void DemoTest1(){
        String nowTime = LocalDateTime.now().toLocalDate().toString();
        String nowTime2 = LocalDateTime.now().toLocalTime().toString();
        System.out.println(nowTime);
        System.out.println(nowTime2);
    }

}
