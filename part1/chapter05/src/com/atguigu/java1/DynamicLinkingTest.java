package com.atguigu.java1;

/**
 * @author shkstart
 * @create 2020 下午 10:25
 */
public class DynamicLinkingTest {

    int num = 10;

    public void methodA(){
    }

    public void methodB(){
        methodA();
        num++;
    }

}
