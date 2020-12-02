package com.basic.collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-28 13:46
 **/
public class ArrayListTest {
    /*数组的创建方式:
     *  String[] string = new String[length];
     * String[] string = {"1"};
     * String[] string = new String[]{"1"};
     *
     * ArrayList 默认初始化空数组，添加元素时,初始化数组容量默认10。 有序的,可重复的,线程不安全。
     * 底层数组实现。扩容为原来的1.5倍
     * 会出现fail-fast异常 ArrayList中维护个ArrayList数据改变次数字段modCount 当modCount和sub
     *  避免fail-fast 使用CopyOnWriterArrayList 并发编程时候 ，但线程时候尽量使用itrator的reomve
     * RandomAccess 接口标记 来区别是使用for循环还是使用迭代器遍历
    *
    * Vector 默认初始化数组10 有序的线程安全的 扩容原来一倍 底层数组实现
    *
    *LinkedList 底层双向链表实现，线程不安全 删除快，查询慢
    *
    * */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(1);
        Vector votor = new Vector<String>(0);
        LinkedList linkedArrayList = new LinkedList();
        votor.add("1");
    }



}
