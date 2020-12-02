package com.basic.design.proxy.JdkProxy.staticProxy;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-24 14:44
 **/
public class Test {
    public static void main(String[] args) {
        //目标对象
        IUserDTO target = new UserDao();

        //代理对象,把目标对象传给代理对象,建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();//执行的是代理的方法
    }
}
