package com.basic.design.proxy.JdkProxy.staticProxy;

/**
 * @description:
 * @author: zxl
 * @create: 2020-10-22 15:47
 **/
public class AUserDao implements IUserDTO {
    @Override
    public void save() {
        System.out.println("AUSERdao");
    }
}
