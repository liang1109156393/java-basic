package com.basic.design.proxy.JdkProxy.staticProxy;

/**
 * @description:
 * @author: zxl
 * @create: 2020-09-24 14:42
 **/
public class UserDaoProxy implements IUserDTO {
    //接收保存目标对象
    private IUserDTO target;

    public UserDaoProxy(IUserDTO target) {
        this.target = target;
    }
    @Override
    public void save() {
        System.out.println("开始事务...");
        target.save();//执行目标对象的方法
        System.out.println("提交事务...");
    }
}