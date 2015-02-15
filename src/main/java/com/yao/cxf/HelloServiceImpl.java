package com.yao.cxf;


import javax.jws.WebService;

/**
 * Created by root on 15-2-15.
 */
@WebService
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String name) {
        return "hello cxf --- "+name;
    }
}
