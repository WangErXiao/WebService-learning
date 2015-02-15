package com.yao.cxf;

import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * Created by root on 15-2-15.
 */
public class JaxWsServer {
    public static void main(String[]args){

        ServerFactoryBean factory=new ServerFactoryBean();
        factory.setAddress("http://localhost:8080/ws/soap/hello");
        factory.setServiceClass(HelloService.class);
        factory.setServiceBean(HelloServiceImpl.class);
        factory.create();
        System.out.println("soap is starting-----");

    }
}
