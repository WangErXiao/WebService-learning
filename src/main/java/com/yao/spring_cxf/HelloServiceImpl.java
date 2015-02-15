package com.yao.spring_cxf;


import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * Created by root on 15-2-15.
 */
@WebService
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello spring cxf "+name;
    }
}
