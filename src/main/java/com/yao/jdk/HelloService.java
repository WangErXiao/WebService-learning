package com.yao.jdk;

import javax.jws.WebService;

/**
 * Created by root on 15-2-10.
 */
@WebService
public interface HelloService {
    String say(String name);
}
