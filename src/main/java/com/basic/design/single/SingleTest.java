package com.basic.design.single;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-29 13:48
 **/
public class SingleTest {


}

// 饿汉式单例
// 优点：获取对象的速度快，线程安全（因为虚拟机保证只会装载一次，在装载类的时候是不会发生并发的）
//缺点：耗内存
class Singleton1 {
    // 指向自己实例的私有静态引用，主动创建
    private static Singleton1 singleton1 = new Singleton1();

    // 私有的构造方法s
    private Singleton1() {
    }

    // 以自己实例为返回值的静态的公有方法，静态工厂方法
    public static Singleton1 getSingleton1() {
        return singleton1;
    }
}

//懒汉模式
class Singleton2 {
    private static Singleton2 singleton2;

    public Singleton2() {
    }

    public static Singleton2 getSingleton2() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}

class Singleton3 {
    /**
     * 单例对象实例
     * volatile 多线程场景下防止指令重排序
     */
    private volatile static Singleton3 instance = null;//这里加volatitle是为了避免DCL失效

    //DCL对instance进行了两次null判断
    //第一层判断主要是为了避免不必要的同步
    //第二层的判断则是为了在null的情况下创建实例。
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}

//静态内部类
class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}