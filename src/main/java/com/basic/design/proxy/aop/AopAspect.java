package com.basic.design.proxy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: zxl
 * @create: 2020-11-05 09:50
 **/
@Aspect
@Component
public class AopAspect {
    @Pointcut(value = "execution(* say*(..))")
    public void pointCut (){

    }

    @Before(value = "pointCut()")
    private void beforeAdvice (JoinPoint point){
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        System.out.println(method.toString());
        System.out.println("===========before advice param:");
    }

    @After( value = "pointCut()")
    private void afterAdvice (JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println(method.toString());
        System.out.println("===========after advice param:");
    }

    @Around(value = "pointCut()")
    private void aroundAdvice (ProceedingJoinPoint joinPoint) throws Throwable{
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println(method.toString());

        System.out.println("===========before advice param: around");
        joinPoint.proceed();
        System.out.println("===========after advice param: around");
    }

}
