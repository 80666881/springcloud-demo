package com.zeller.service;

import java.util.List;

import com.zeller.client.ProductClientRibbon;
import com.zeller.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProducts();

    }
}