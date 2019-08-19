package com.ran.test;

public class Demo08 {
    public static void main(String[] args) {
        //经典面试题三:
        short s1 = 1;
        //2是int类型的值,大类型与小类型进行运算,结果必须是大类型
        s1 = (short)(s1 + 2);
        System.out.println(s1);

        short s2 = 1;
        //不涉及类型转换的问题,在本身的基础上加上2
        s2 += 2;
        System.out.println(s2);
    }
}
