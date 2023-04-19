package com.neo.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Name ：BigDecimalTest
 * @Description ：
 * @Author ：wenbin
 * @Date ：2023/4/19 16:47
 * @History ：
 */

public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal a= BigDecimal.valueOf(0);
        BigDecimal b= BigDecimal.valueOf(1);
        BigDecimal c= BigDecimal.valueOf(0);
        c= a.add(b);//加法
        c=a.subtract(b);//减法
        c=a.multiply(b);//乘法
        c=a.divide(b, RoundingMode.HALF_UP);
//除法 在除法中被除数不能为空，而且需要标明小数位保留的方法，否则会报
        c = a.abs();//绝对值
    }
}
