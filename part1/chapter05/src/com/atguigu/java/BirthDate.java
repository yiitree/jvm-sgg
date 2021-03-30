package com.atguigu.java;

/**
 * @Author: 曾睿
 * @Date: 2021/3/10 10:12
 */
public class BirthDate {

    int day;
    int month;
    int year;

    BirthDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void display(){
            System.out.println("day = "+day+" month = "+month+" year = "+year);
        }
}
