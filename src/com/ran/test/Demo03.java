package com.ran.test;

public class Demo03 {
    public static void main(String[] args) {
        // 整型 在java中,写的整数默认为int类型
        // 1个字节 8位      -128~127        -2的7次方  到 2的7次方-1
        byte b = 1;
        // 2个字节 16位                     -2的15次方 到 2的15次方-1
        short s = 2;
        // 4个字节 32位    最常用           -2的31次方 到 2的31次方-1
        int i = 3;
        // 8个字节 64位                     -2的63次方 到 2的63次方-1
        long l = 4L;
        System.out.println(b+","+s+","+i+","+l);
        // 强制转换,有风险的 -- 大类型转小类型
        //byte b = (byte)129;


        // 浮点型 在java中,写的浮点型数据默认为double类型
        // 4个字节 32位
        float f = 1.1f;
        // 8个字节 64位     最常用
        double d = 1.2;
        System.out.println(f+","+d);

        // 字符型  只能存储单个字符
        char c = '男';
        System.out.println(c);

        // 布尔型  只存储2个数据:false,true  逻辑判断使用
        boolean flag = true;
        System.out.println(flag);


        // 定义方式一:
        //定义的同时进行了赋值
        int num = 1;
        //定义方式二:
        //先定义,后赋值
        int num1,num2,num3;
        num1 = 2;
        System.out.println(num1);

    }
}
