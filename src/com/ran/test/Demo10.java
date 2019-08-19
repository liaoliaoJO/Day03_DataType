package com.ran.test;

public class Demo10 {
    public static void main(String[] args) {
        // 逻辑运算符(&,|,!,&&,||,^)
        boolean flag1 = true;
        boolean flag2 = false;

        //& 逻辑与     运算符两边,只有一个为假,则结果为假
        // 表达式会运行完毕
        System.out.println(flag2 & flag1);//false
        // | 逻辑或    运算符两边,只有一个为真,则结果为真
        System.out.println(flag1 | flag2);//true
        // ! 非        取反,非false为true,非true为false
        System.out.println(!flag1);//false
        System.out.println(!flag2);//true

        //&& 短路与    运算符两边,只有一个为假,则结果为假
        // 一旦运算符左边为false,则直接返回结果
        System.out.println(flag2 && flag1);//false
        // || 短路或   运算符两边,只有一个为真,则结果为真
        System.out.println(flag1 || flag2);//true
        // ^ 异或      运算符两边,不同为true,相同为false
        System.out.println(flag1 ^ flag2);//true

        System.out.println("------------------------");
        boolean flag3 = true;
        boolean flag4 = false;
        boolean flag5 = true;
        boolean flag6 = false;
        System.out.println(flag4 & (flag3 = false));
        System.out.println(flag6 && (flag5 = false));
        System.out.println("flag3:"+flag3);
        System.out.println("flag5:"+flag5);
    }
}
