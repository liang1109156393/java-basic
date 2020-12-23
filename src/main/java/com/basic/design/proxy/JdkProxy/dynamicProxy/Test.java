package com.basic.design.proxy.JdkProxy.dynamicProxy;

import com.basic.design.proxy.JdkProxy.staticProxy.IUserDTO;
import com.basic.design.proxy.JdkProxy.staticProxy.UserDao;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-24 14:48
 **/
public class Test {
    public static void main(String[] args) {
        // 目标对象  代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理 代理只和目标对象关

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        IUserDTO target = new UserDao();
        // 给目标对象，创建代理对象
        IUserDTO proxy = (IUserDTO) new ProxyFactory(target).getProxyInstance();
        //内存中动态生成的代理对象
        System.out.println(proxy.getClass());
        // 执行方法   【代理对象】
        proxy.save();
    }
}
