package com.yao.jdk;

import javax.xml.ws.Endpoint;

/**
 * Created by root on 15-2-10.
 */
public class Server {
    public static void main(String[] args) {
        String address = "http://localhost:8080/ws/soap/hello";
        HelloService helloService = new HelloServiceImpl();

        Endpoint.publish(address, helloService);
        System.out.println("ws is published");
    }
}
