package com.atguigu.java2;

/**
 * 题目：
 * new String("ab")会创建几个对象？看字节码，就知道是两个。
 *     一个对象是：new关键字在堆空间创建的
 *     另一个对象是：字符串常量池中的对象"ab"。 字节码指令：ldc
 *
 *
 * 思考：
 * new String("a") + new String("b")呢？
 *  对象1： new StringBuilder()
 *  对象2： new String("a")
 *  对象3： 常量池中的"a"
 *  对象4： new String("b")
 *  对象5： 常量池中的"b"
 *
 *  深入剖析： StringBuilder的toString():
 *      对象6 ：new String("ab")
 *       强调一下，toString()的调用，在字符串常量池中，没有生成"ab"
 */
public class StringNewTest {
    public static void main(String[] args) {

        String str = new String("ab");

//        String str = new String("a") + new String("b");
    }
}



/**
        助记符    说明
        nop        无操作
        aconst_null 将null推送至栈顶
        iconst_0    将int型0推送至栈顶
        bipush    将单字节的常量值(-128~127)推送至栈顶
        ldc    将int, float或String型常量值从常量池中推送至栈顶
        iload    将指定的int型本地变量推送至栈顶
        iload_0    将第一个int型本地变量推送至栈顶
        iaload    将int型数组指定索引的值推送至栈顶
        istore    将栈顶int型数值存入指定本地变量
        pop     将栈顶数值弹出 (数值不能是long或double类型的)
        dup     复制栈顶数值并将复制值压入栈顶
        swap    将栈最顶端的两个数值互换(数值不能是long或double类型的)
        iadd    将栈顶两int型数值相加并将结果压入栈顶
        isub    将栈顶两int型数值相减并将结果压入栈顶
        imul    将栈顶两int型数值相乘并将结果压入栈顶
        idiv    将栈顶两int型数值相除并将结果压入栈顶
        irem    将栈顶两int型数值作取模运算并将结果压入栈顶
        ineg    将栈顶int型数值取负并将结果压入栈顶
        ishl    将int型数值左移位指定位数并将结果压入栈顶
        iushr    将int型数值右（无符号）移位指定位数并将结果压入栈顶

        iand    将栈顶两int型数值作“按位与”并将结果压入栈顶
        ior     将栈顶两int型数值作“按位或”并将结果压入栈顶
        ixor    将栈顶两int型数值作“按位异或”并将结果压入栈顶
        lxor    将栈顶两long型数值作“按位异或”并将结果压入栈顶
        iinc    将指定int型变量增加指定值（i++, i--, i+=2）
        i2l     将栈顶int型数值强制转换成long型数值并将结果压入栈顶
        lcmp    比较栈顶两long型数值大小，并将结果（1，0，-1）压入栈顶
        ifeq    当栈顶int型数值等于0时跳转
        if_icmpeq    比较栈顶两int型数值大小，当结果等于0时跳转
        goto    无条件跳转
        jsr     跳转至指定16位offset位置，并将jsr下一条指令地址压入栈顶
        ret     返回至本地变量指定的index的指令位置（一般与jsr, jsr_w联合使用）
        tableswitch    用于switch条件跳转，case值连续（可变长度指令）
        lookupswitch    用于switch条件跳转，case值不连续（可变长度指令）
        ireturn    从当前方法返回int
        return    从当前方法返回void

        getstatic    获取指定类的静态域，并将其值压入栈顶
        putstatic    为指定的类的静态域赋值
        getfield    获取指定类的实例域，并将其值压入栈顶
        putfield    为指定的类的实例域赋值
        invokevirtual    调用实例方法
        invokespecial    调用超类构造方法，实例初始化方法，私有方法
        invokestatic    调用静态方法
        invokeinterface 调用接口方法
        invokedynamic  调用动态链接方法
        new     创建一个对象，并将其引用值压入栈顶
        newarray    创建一个指定原始类型（如int, float, char…）的数组，并将其引用值压入栈顶
        anewarray    创建一个引用型（如类，接口，数组）的数组，并将其引用值压入栈顶
        arraylength 获得数组的长度值并压入栈顶
        athrow    将栈顶的异常抛出
        checkcast    检验类型转换，检验未通过将抛出ClassCastException
        instanceof 检验对象是否是指定的类的实例，如果是将1压入栈顶，否则将0压入栈顶
        monitorenter    获得对象的锁，用于同步方法或同步块
        monitorexit    释放对象的锁，用于同步方法或同步块
        wide    扩大本地变量索引的宽度
        multianewarray 创建指定类型和指定维度的多维数组（执行该指令时，操作栈中必须包含各维度的长度值），并将其引用值压入栈顶
        ifnull    为null时跳转
        ifnonnull    不为null时跳转
        goto_w    无条件跳转
        jsr_w    跳转至指定32位offset位置，并将jsr_w下一条指令地址压入栈顶
*/
