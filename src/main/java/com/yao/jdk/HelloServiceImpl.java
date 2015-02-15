package com.yao.jdk;

import javax.jws.WebService;

/**
 * Created by root on 15-2-10.
 */

@WebService(
        serviceName = "HelloService",
        portName = "HelloServicePort",
        endpointInterface = "com.yao.jdk.HelloService"
)
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String name) {
        return "hello " + name;
    }
}
