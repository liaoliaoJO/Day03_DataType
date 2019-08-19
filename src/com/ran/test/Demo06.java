package com.ran.test;

public class Demo06 {
    public static void main(String[] args) {
        //赋值运算符(=,+=,-+,*=,/=,%=)
        int num = 1;
        //在绝大部分情况下等于 num = num +2
        num += 2;
        System.out.println(num);//3
        //num = num - 1;
        num -= 1;
        System.out.println(num);//2
        //num = num * 3;
        num *= 3;
        System.out.println(num);//6
        //num = num/2;
        num /= 2;
        System.out.println(num);//3
        num = 10;
        // num = num % 3;
        num %= 3;
        System.out.println(num);//1
    }
}
