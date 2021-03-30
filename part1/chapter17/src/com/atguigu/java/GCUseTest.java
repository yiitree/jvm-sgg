package com.atguigu.java;

import java.util.ArrayList;

/**
 *  -XX:+PrintCommandLineFlags
 *
 *  -XX:+UseSerialGC:
 *  新生代:Serial GC
 *  老年代:Serial Old GC
 *
 *  -XX:+UseParNewGC：
 *  新生代:arNew GC
 *
 *  -XX:+UseParallelGC:
 *  新生代:Parallel GC
 *
 *  -XX:+UseParallelOldGC
 *  老年代:Parallel Old GC
 *  说明：二者可以相互激活
 *
 *  -XX:+UseConcMarkSweepGC：
 *  老年代:CMS GC。
 *  年轻代:ParNew
 */
public class GCUseTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();

        while(true){
            byte[] arr = new byte[100];
            list.add(arr);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
