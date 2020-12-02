package com;

import com.basic.design.proxy.aop.AopMethod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class JavaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(JavaApplication.class, args);
		AopMethod bean = run.getBean(AopMethod.class);
		bean.say();;
	}

}
