package com.ran.test;

public class Demo11 {
    public static void main(String[] args) {
        //三目运算符(三元运算符)
        //关系表达式?表达式1:表达式2
        //关系表达式返回结果如果为true,则执行表达式1,如果为false,则执行表达式2
        int a = 1;
        int b = 5;
        //输出两个数较大的数
        System.out.println(a>b?a:b);
        //输出两个数较小的数
        System.out.println(a>b?b:a);
    }
}
