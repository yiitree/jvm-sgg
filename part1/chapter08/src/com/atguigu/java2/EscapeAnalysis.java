package com.atguigu.java2;

/**
 * 逃逸分析
 *
 * 如何快速的判断是否发生了逃逸分析，大家就看new的对象 实体 是否有可能在方法外被调用。
 * 就是方法内对象，是否进行返回，返回的对象
 *
 * 主要看这个类的对象是从哪里来的，到哪去
 * 1.外部传递进来的实例对象
 * 2.和要方法返回值的对象
 *
 * @author shkstart
 * @create 2020 下午 4:00
 */
public class EscapeAnalysis {

    public EscapeAnalysis obj;

    /*
    方法返回EscapeAnalysis对象，发生逃逸
     */
    public EscapeAnalysis getInstance(){
        // 如果返回null就new一个EscapeAnalysis对象，所以有可能会被其他方法调用
        return obj == null ? new EscapeAnalysis() : obj;
    }
    /*
    为成员属性赋值，发生逃逸
     */
    public void setObj(){
        this.obj = new EscapeAnalysis();
    }
    //思考：如果当前的obj引用声明为static的？仍然会发生逃逸。

    /*
    对象的作用域仅在当前方法中有效，没有发生逃逸
     */
    public void useEscapeAnalysis(){
        EscapeAnalysis e = new EscapeAnalysis();
    }
    /*
    引用成员变量的值，发生逃逸
     */
    public void useEscapeAnalysis1(){
        //getInstance()方法产生的对象本身就是外面传递进来的，所以发生逃逸
        EscapeAnalysis e = getInstance();
        //getInstance().xxx()同样会发生逃逸
    }
}
