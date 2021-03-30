package com.atguigu.java2;

/**
 * @Author: 曾睿
 * @Date: 2021/3/12 15:25
 */
public class MyTest {
    public static void main(String[] args) {

        String a1 = "a";  //常量池
        String a2 = "a";
        String a3 = new String("a");
        System.out.println("a1 "+System.identityHashCode(a1));
        System.out.println("a2 "+System.identityHashCode(a2));
        System.out.println("a3 "+System.identityHashCode(a3));
        System.out.println("---------------------");

        String b1 = new String("b");
        String b2 = "b";
        System.out.println("b1 "+System.identityHashCode(b1));
        System.out.println("b2 "+System.identityHashCode(b2));
        System.out.println("---------------------");

        String c1 = new String("c");
        String c3 = c1.intern();
        String c4 = "c";

        System.out.println("c1 "+System.identityHashCode(c1));
//        System.out.println("c1 "+System.identityHashCode(c2));
        System.out.println("c1 "+System.identityHashCode(c3));
        System.out.println("c1 "+System.identityHashCode(c4));
        System.out.println("---------------------");

        String d1 = new String("d");
        String d2 = "d";
        String d3 = c1.intern();
        String d4 = "d";

        System.out.println("c1 "+System.identityHashCode(c1));
//        System.out.println("c1 "+System.identityHashCode(c2));
        System.out.println("c1 "+System.identityHashCode(c3));
        System.out.println("c1 "+System.identityHashCode(c4));
        System.out.println("---------------------");
    }
}
