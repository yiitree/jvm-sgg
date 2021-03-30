package com.atguigu.java;


/**
 * String的基本使用：体现String的不可变性
 */
public class StringTest1 {
    public void test1() {
        // 字面量定义的方式，"abc"存储在字符串常量池中---堆中
        // 字符串常量池中都是不重复的，所以局部变量表中s1s2指向的都是同一块地址
        String s1 = "abc";
        String s2 = "abc";
        // 再次复制，不是销毁，是另外增加一个字符串，然后改变指向
        s1 = "hello";

        // 判断地址：true  --> false
        System.out.println(s1 == s2);
        System.out.println(s1);
        // abc
        System.out.println(s2);
    }

    public void test2() {
        String s1 = "abc";
        String s2 = "abc";
        s2 += "def";
        // abcdef---只要做修改，都是重新创建，因为底层是数组
        System.out.println(s2);
        // abc
        System.out.println(s1);
    }

    public void test3() {
        String s1 = "abc";
        String s2 = s1.replace('a', 'm');
        // abc
        System.out.println(s1);
        // mbc只要做修改，都是新开辟空间，原来的不变
        System.out.println(s2);
    }
}
