package com.basic.classload;

/**
 * @description:
 * @author: zxl
 * @create: 2020-11-10 10:40
 **/
public class ClassLoadChild extends ClassLoadParent {
    public static int b = 10;

    public ClassLoadChild() {
        System.out.println("子类构造方法");
    }

    static {
        b = 1;
        System.out.println("子类静态方法");
    }

    {
        System.out.println("子类代码块方法");
    }
}
