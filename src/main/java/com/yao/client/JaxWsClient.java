package com.yao.client;

import com.yao.spring_cxf.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by root on 15-2-16.
 */
public class JaxWsClient {
    public static void main(String[]args){
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://localhost:8080/ws/soap/hello");
        factory.setServiceClass(HelloService.class);
        long start=System.currentTimeMillis();
        HelloService helloService = factory.create(HelloService.class);
        String result = helloService.sayHello("world");
        System.out.println("time consumer:"+(System.currentTimeMillis()-start));
        System.out.println(result);
    }
}
