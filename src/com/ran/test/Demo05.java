package com.ran.test;

public class Demo05 {
    public static void main(String[] args) {
        //经典面试题一:
        int num = 8;
        //118 117 108 97
        //num=9,num=10
        //8+10+100
        int b = (num++)+(++num)+(num*10);
        System.out.println(b);
    }
}
