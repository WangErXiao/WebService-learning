package com.yao.client;

import com.yao.spring_cxf.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 15-2-16.
 */
public class SpringClient {
    public static void main(String[]args){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("classpath*:spring-client.xml");
        long start=System.currentTimeMillis();
        HelloService helloService= (HelloService) applicationContext.getBean("helloService");
        String result=helloService.sayHello("yao");
        System.out.println("time consumer:"+(System.currentTimeMillis()-start));
        System.out.println(result);

        start=System.currentTimeMillis();
        helloService= (HelloService) applicationContext.getBean("helloService");
        result=helloService.sayHello("yao");
        System.out.println("time consumer:"+(System.currentTimeMillis()-start));
        System.out.println(result);

    }
}
