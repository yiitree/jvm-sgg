package com.atguigu.java;

/**
 * -XX:+PrintGCDetails
 * @author shkstart  shkstart@126.com
 * @create 2020  14:57
 */
public class LocalVarGC {

    /**
     * 情况1：不回收
     * 此时buffer还进行指向，不回收
     */
    public void localvarGC1() {
        byte[] buffer = new byte[10 * 1024 * 1024];//10MB
        System.gc();
    }

    /**
     * 情况2：回收
     * buffer指向null，此时会把对象进行回收
     */
    public void localvarGC2() {
        byte[] buffer = new byte[10 * 1024 * 1024];
        buffer = null;
        System.gc();
    }

    /**
     * 情况3：不回收
     * 原理：槽会重复利用
     * 局部变量槽有两个对象，this,buffer
     * 此时buffer创建后放在局部变量槽中第一个位置，
     * 此时作用域完后，buffer已经不再了，但是槽中还在指向这个对象，
     * 如果再另外设置一个数，就回占用这个槽，此时就可以吧第一个槽的指向位置改变，
     * 对象就可以回收了
     */
    public void localvarGC3() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        System.gc();
    }

    /**
     * 情况4：回收
     * 此时buffer第一个槽的位置放value了，就回回收了
     */
    public void localvarGC4() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        int value = 10;
        System.gc();
    }

    /**
     * 情况5：回收
     */
    public void localvarGC5() {
        localvarGC1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGC local = new LocalVarGC();
        local.localvarGC1();
    }
}
