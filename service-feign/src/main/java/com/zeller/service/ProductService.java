package com.zeller.service;


import java.util.List;

import com.zeller.client.ProductClientFeign;
import com.zeller.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProduct();

    }
}