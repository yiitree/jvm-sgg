package com.atguigu.java;

/**
 * 跑起来看一下具体内容
 * @Author: 曾睿
 * @Date: 2021/3/10 20:47
 */
public class Demo {

    public static void main(String[] args) {
        /**
         * new一个子类对象
         * 我们知道，子类对象实例化时，会隐式调用父类的无参构造
         * 所以Father里的System.out.println()会执行
         * 猜猜打印的内容是什么？
         */
        Son son = new Son();

        Daughter daughter = new Daughter();
    }

}

class Father{
    /**
     * 父类构造器
     */
    public Father(){
        // 打印当前对象所属Class的名字
        System.out.println(this.getClass().getName());
    }
}

class Son extends Father {
    Son(){
    }
    int i;
    Son(int j){
        super();
        this.i = j;
    }
}

class Daughter extends Father {
    Daughter(){
        super();
    }
}
