package com.ran.test;

public class Demo13 {
    public static void main(String[] args) {
        // 默认为十进制
        int a = 100;
        // 二进制,标记0b
        int b = 0b100;
        // 八进制,标记是0
        int c = 0100;
        // 十六进制,标记是0x
        int d = 0x100;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int num1 = 0b1001;
        System.out.println(num1);
        int num2 = 011;
        System.out.println(num2);
        int num3 = 0x1e;
        System.out.println(num3);
        System.out.println("------------");
        int num4 = 0b111;
        int num5 = 0x1ef;
        int num6 = 0123;
        // ctrl + D 复制一行
        // ctrl + X 删除一行
        System.out.println("num4:"+num4);
        System.out.println("num5:"+num5);
        System.out.println("num6:"+num6);
    }
}
