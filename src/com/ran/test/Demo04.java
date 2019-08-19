package com.ran.test;

public class Demo04 {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 4;
        //算术运算符(+,-,*,/,%,++,--)
        System.out.println(num1+num2);//13
        System.out.println(num1-num2);//5
        System.out.println(num1*num2);//36
        System.out.println(num1/num2);//2

        //前置:++/--  先自加1或者是自减1,再使用
        System.out.println(++num1);//10
        System.out.println(--num2);//3

        //后置:++/--  先使用再自加1或者自减1
        System.out.println(num1++);//10
        System.out.println(num1);//11
        System.out.println(num2--);//3
        System.out.println(num2);//2
    }
}
