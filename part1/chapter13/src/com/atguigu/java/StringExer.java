package com.atguigu.java;

/**
 * 面试案例
 */
public class StringExer {

    int i = 10;
    String str = "good";
    char[] ch = {'t', 'e', 's', 't'};

    public void change(int i, String str, char ch[]) {
        i = 0;
        str = "test ok";// 指的是str方法内部变量，
//        this.str = "xxx";// 这个才是类变量，方法变量和类变量没有影响
        ch[0] = 'b';


    }

    public static void main(String[] args) {
        StringExer ex = new StringExer();
        ex.change(ex.i, ex.str,ex.ch);

        System.out.println(ex.i);
        // good --- String的不可变性，是创建新的变量
        System.out.println(ex.str);
        // best 修改数组的某一个选项
        System.out.println(ex.ch);
    }

}
