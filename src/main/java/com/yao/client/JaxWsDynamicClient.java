package com.yao.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created by root on 15-2-16.
 */
public class JaxWsDynamicClient {
    public static void main(String[] args) {
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        long start=System.currentTimeMillis();
        Client client = factory.createClient("http://localhost:8080/ws/soap/hello?wsdl");
        try {
            Object[] results = client.invoke("sayHello", "world");
            System.out.println("time consumer:"+(System.currentTimeMillis()-start));
            System.out.println(results[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
