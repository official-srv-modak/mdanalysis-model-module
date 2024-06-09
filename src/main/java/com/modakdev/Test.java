package com.modakdev;

import com.modakdev.model.pojo.Product;
import com.modakdev.response.SingleProductResponse;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        Product p = new Product();
        p.setName("Abc");
        p.setDescription("Something");
        p.setId(10);
        p.setEncodedColumns("aafsfaa");
        p.setCorrelationMatrix("ancoancan");

        SingleProductResponse productResponse = new SingleProductResponse();
        productResponse.build(p);

        System.out.println(productResponse);
    }
}
