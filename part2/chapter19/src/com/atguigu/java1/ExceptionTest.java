package com.atguigu.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2020-09-08 11:30
 * 指令8：异常处理
 */
public class ExceptionTest {
    public void throwZero(int i){
        if(i == 0){
            throw new RuntimeException("参数值为0");
        }
    }
    public void throwOne(int i) throws RuntimeException,IOException{
        if(i == 1){
            throw new RuntimeException("参数值为1");
        }
    }
    public void throwArithmetic() {
        int i = 10;
        int j = i / 0;
        System.out.println(j);
    }

    public void tryCatch(){
        try{
            File file = new File("d:/hello.txt");
            FileInputStream fis = new FileInputStream(file);

            String info = "hello!";
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }
    }

    /**
     * 思考：如下方法返回结果为多少？
     * 此时在try中就已经返回结果了，但是有final，过程为：
     * 首先在局部变量表0的位置，也就是要返回的位置赋值hello，
     * 然后再声明一个变量，放到局部变量表1的位置一个atguigu，
     * 总结就是:把str赋值hello后，然后又复制一个变量到1的位置，内容为atguigu，只是没有使用
     */
    public static String func() {
        String str = "hello";
        try{
            return str;
        }
        finally{
            str = "atguigu";
        }
    }

    public static void main(String[] args) {
        System.out.println(func());//hello
    }
}
