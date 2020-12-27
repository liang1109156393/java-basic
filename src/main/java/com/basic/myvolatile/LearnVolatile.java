package com.basic.myvolatile;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ProjectName: zxl
 * @Package: com.basic.myvolatile
 * @ClassName: LearnVolatile
 * @Author: zhangxiaoliang
 * @Description:
 * @Date: 2020/12/26 13:54
 * @Version: 1.0
 */
public class LearnVolatile {
    /**
     * volatile关键字的作用:
     * 修饰变量:内存中可见,防止指令重排序，修饰的变量不具有原子性操作
     * jvm内存屏障storeLoad内存屏障(store写  load读)
     */
    private volatile int count = 0;
    private final static int SIZE = 10;
    private static ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        atomicInteger.incrementAndGet();
        int inc = 0 ;
        for (int i = 0; i < SIZE ; i++) {
           ++inc;
        }
        System.out.println(inc);
    }


}
