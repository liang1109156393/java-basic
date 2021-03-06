package com.basic.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-29 16:03
 **/

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new MyRunable());
        Future<String> submit = executorService.submit(new MyCallable());

        Future<String> submit1 = executorService.submit(new MyCallable());


        CountDownLatch countDownLatch = new CountDownLatch(4);
        for (int i = 0; i < 5; i++) {
            final Thread t = new Thread() {
                @Override
                public void run() {
                    System.out.println("当前线程:" + Thread.currentThread().getName() + ",已分配ID:" + ThreadId.get());
                }
            };
            t.start();
            countDownLatch.countDown();
        }

        countDownLatch.wait();
    }

    static class ThreadId {
        //一个递增的序列，使用AtomicInger原子变量保证线程安全
        private static final AtomicInteger nextId = new AtomicInteger(0);
        //线程本地变量，为每个线程关联一个唯一的序号
        private static final ThreadLocal<Integer> threadId =
                new ThreadLocal<Integer>() {
                    @Override
                    protected Integer initialValue() {
                        return nextId.getAndIncrement();//相当于nextId++,由于nextId++这种操作是个复合操作而非原子操作，会有线程安全问题(可能在初始化时就获取到相同的ID，所以使用原子变量
                    }
                };

        //返回当前线程的唯一的序列，如果第一次get，会先调用initialValue，后面看源码就了解了
        public static int get() {
            return threadId.get();
        }
    }
}
