package com.basic.classload;

/**
 * @description:
 * @author: zxl
 * @create: 2020-11-10 10:38
 **/
public class ClassLoadParent {
    public static int a = 10;

    public ClassLoadParent() {
        System.out.println("父类构造方法");
    }

    static {
        a = 1;
        System.out.println("父类静态方法");
    }

    {
        System.out.println("父类代码方法");
    }
}
