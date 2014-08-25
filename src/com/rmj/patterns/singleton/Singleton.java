package com.rmj.patterns.singleton;

/**
 * Created by G11 on 2014/8/25.
 */
public class Singleton {

    /** 初始即赋值（不足：会增加程序初始时的压力）*/
    private static Singleton mInstance = new Singleton();

    /** 静态工程方法，获取实例 */
    public static Singleton getInstance() {
        return mInstance;
    }

    /** 私有构造方法，防止被实例化 */
    private Singleton() {
    }
}
