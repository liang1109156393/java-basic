package com.basic.design.proxy.aop;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zxl
 * @create: 2020-11-05 09:48
 **/
@Component
public class AopMethod {
    public void say(){
        System.out.println("springaop");
    }
}
