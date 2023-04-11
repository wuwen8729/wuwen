package com.neo.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @Name ：Test
 * @Description ：
 * @Author ：wenbin
 * @Date ：2023/4/11 14:37
 * @History ：
 */



public class Test {
    @SuppressWarnings({ "deprecation", "unused" })
    public static void test(String[] args) {

        /*************************判   空**********************************/
        //判断是否Null 或者 "" 【不去空格】为空的标准是 str==null 或 str.length()==0
        boolean isEmpty = StringUtils.isEmpty("");//true
        boolean isEmpty1 = StringUtils.isEmpty("  ");//false
        boolean isEmptyNull = StringUtils.isEmpty(null);//true
        // 判断是否Null 或者 "" 【去空格】为空的标准是 str==null 或 str.length()==0
        boolean isBlack = StringUtils.isBlank("");//true
        boolean isBlack1 = StringUtils.isBlank("  ");//true
        boolean isBlankNull = StringUtils.isBlank(null);//true


        //找到2个字符串第一个出现不同的位置（1开始）
        String difference = StringUtils.difference("s123", "s13");
        System.out.println(difference);//3

        //判断2个字符串是否相等
        boolean equals = StringUtils.equals("s1", "s1");
        System.out.println(equals);//true

        // 不区分大小写判断两个字符串是都相等
        boolean equalsIgnoreCase = StringUtils.equalsIgnoreCase("abc", "ABc");//true
        System.out.println(equalsIgnoreCase);

        //判断字符串里面是否含有特定字符串
        boolean b2 = StringUtils.contains("asd", "as");
        System.out.println(b2);//true

        //把数组的元素用:进行拼接
        String concatStr = StringUtils.join(new String[]{"dog", "cat", "monkey"},":");
        System.out.println(concatStr);//dog:cat:monkey

        //根据特定分隔符对字符串进行拆分
        String[] split = StringUtils.split("apple|xiaomi|dell|lenovo", "|");
        for (String s1 : split) {
            System.out.print(s1 + "、");//apple、xiaomi、dell、lenovo、
        }
        System.out.println();

        //所有单词首字母大写
//        String capitaliseAllWords = StringUtils.capitaliseAllWords("today i will go to china");
//        System.out.println(capitaliseAllWords);//Today I Will Go To China

        //统计某个字符串在字符串出现的次数
        int matchCount = StringUtils.countMatches("Happy Birthday to you", "o");
        System.out.println(matchCount);//2

        //必须要8位，不够的就拿0去字符串左边补
        String leftPad = StringUtils.leftPad("54", 8, "0");
        System.out.println(leftPad);//00000054

        //必须要8位，不够的就拿0去字符串右边补
        String rightPad = StringUtils.rightPad("54", 8, "0");
        System.out.println(rightPad);//54000000

        //判断字符串是否以特定字符串开头，区分大小写
        boolean startsWith = StringUtils.startsWith("GoodMorning", "go");
        System.out.println(startsWith);//false

        //判断字符串是否以特定字符串结尾，区分大小写
        boolean endsWith = StringUtils.endsWith("GoodMorning", "ing");
        System.out.println(endsWith);//true

        // 去空格
        StringUtils.trim("      222     ");//222

        //将null和""转换为null
        StringUtils.trimToNull("");//null

        // 将null和""转换为""
        StringUtils.trimToEmpty(null);//""

        //当第一个字符串为null或者""时返回第二个参数
        StringUtils.defaultIfEmpty(null, "sos");//sos
        StringUtils.defaultIfEmpty("", "sos");//sos
        StringUtils.defaultIfEmpty("111", "sos");//111

        // 去除参数首尾和第二个参数相同的字符,如果第二个参数为null那就去除首尾的空格
        StringUtils.strip("fsfsdf", "f");//sfsd
        StringUtils.strip("fsfsdfa", "f");//sfsdfa
        // 去除首部和第二个参数相同的字符,如果第二个参数为null那就去除首部的空格
        StringUtils.stripStart("ddsuuud", "d");//suuud
        // 去除尾部和第二个参数相同的字符,如果第二个参数为null那就去除尾部的空格
        StringUtils.stripEnd("ddsuuud", "d");//ddsuuu

        // 对数组整体去除首尾空格
        //java
        //c++
        //python    script
        String[] strip = StringUtils.stripAll(new String[]{"    java ", "c++     ", "python    script"});
        for(String aa : strip){
            System.out.println(aa);
        }

        // 去掉数据中首尾和第二个参数一样的字符
        //java
        //hp
        //ython    script
        String[] strip1 = StringUtils.stripAll(new String[]{"    java ", "php     ", "python    script"},"p");
        for(String aa : strip){
            System.out.println(aa);
        }

        /**************************查找****************************/
        // 查找第二个参数首次出现的位置(区分大小写)，如果第一个参数为null或者没有查找到时返回-1
        StringUtils.indexOf("bbbb", "a");//-1
        StringUtils.indexOf(null, "a");//-1
        StringUtils.indexOf("aaaa", "a");//0
        StringUtils.indexOf("aaaa", "A");//-1

        // 查找第二个参数首次出现的位置(不区分大小写)，如果第一个参数为null或者没有查找到时返回-1
        StringUtils.indexOf("bbbb", "A");//-1
        StringUtils.indexOf(null, "A");//-1
        StringUtils.indexOf("aaaa", "A");//0


    }

    public static void main(String[] args) {
//        System.out.println(StringUtils.indexOfIgnoreCase("abbb", "A"));
        test(args);
    }

}
