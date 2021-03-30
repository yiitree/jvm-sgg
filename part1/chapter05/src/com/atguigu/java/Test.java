package com.atguigu.java;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        int data = 10;
        BirthDate b1 = new BirthDate(5,4,1993);
        BirthDate b2 = new BirthDate(25,5,1992);
        test.change(data);
        test.change1(b1);
        test.change2(b2);

        // 10
        System.out.println(data);
        // 5,4,1993
        b1.display();
        // 1,1,1
        b2.display();
    }

    void change(int i){
        i = 100;
        i = i + 1;
    }
    void change1(BirthDate b){
        b = new BirthDate(1,1,1);
    }
    void change2(BirthDate b){
        b.setDay(100);
    }
}



