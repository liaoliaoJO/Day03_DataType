package com.ran.test;

public class Demo02 {
    public static void main(String[] args) {
        //数据类型 变量名 = 存储的数据(初始化值)
        //String为字符串,标识为双引号
        String name = "胡大霞";
        //int为整型的其中一种
        int age = 28;

        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);

        // 重新赋值
        name = "胡小霞";
        // 重复定义 -- 不允许
        //int age = 20;
        age = 20;

        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
    }
}
