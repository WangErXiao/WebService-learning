package com.yao.spring_cxf;

import javax.jws.WebService;

/**
 * Created by root on 15-2-15.
 */
@WebService
public interface HelloService {
    public String sayHello(String name);
}
