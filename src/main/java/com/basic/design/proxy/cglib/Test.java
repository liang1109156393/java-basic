package com.basic.design.proxy.cglib;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-24 14:53
 **/
public class Test {
    public static void main(String[] args) {
        //目标对象 cglib 代理无需实现接口
        //代理的类不能为final,否则报错
        //目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法.
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");



        RoleDao target = new RoleDao();

        //代理对象
        RoleDao proxy = (RoleDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
