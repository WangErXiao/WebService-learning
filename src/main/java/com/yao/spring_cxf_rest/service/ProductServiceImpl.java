package com.yao.spring_cxf_rest.service;

import com.yao.spring_cxf_rest.model.Product;

import javax.ws.rs.FormParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by root on 15-2-16.
 */

public class ProductServiceImpl implements ProductService {
    private final Product product=new Product(){{
        setName("面包");
        setPrice(19.9);
    }};
    @Override
    public List<Product> retrieveAllProducts() {
        return new ArrayList<Product>(){{
            add(product);
        }};
    }

    @Override
    public Product retrieveProductById(long id) {
        return null;
    }

    @Override
    public List<Product> retrieveProductsByName(@FormParam("name") String name) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProductById(long id, Map<String, Object> fieldMap) {
        return null;
    }

    @Override
    public Product deleteProductById(long id) {
        return null;
    }
}
