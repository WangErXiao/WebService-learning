package com.yao.spring_cxf_rest.server;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.yao.spring_cxf_rest.service.ProductServiceImpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.ResourceProvider;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 15-2-16.
 */
public class Server01 {

 public static void main(String[] args) {
        // 添加 ResourceClass
        List<Class<?>> resourceClassList = new ArrayList<Class<?>>();
        resourceClassList.add(ProductServiceImpl.class);

        // 添加 ResourceProvider
        List<ResourceProvider> resourceProviderList = new ArrayList<ResourceProvider>();
        resourceProviderList.add(new SingletonResourceProvider(new ProductServiceImpl()));

        // 添加 Provider
        List<Object> providerList = new ArrayList<Object>();
        providerList.add(new JacksonJsonProvider());

        // 发布 REST 服务
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
        factory.setAddress("http://localhost:8080/ws/rest");
        factory.setResourceClasses(resourceClassList);
        factory.setResourceProviders(resourceProviderList);
        factory.setProviders(providerList);
        factory.create();
        System.out.println("rest ws is published");
    }

}
