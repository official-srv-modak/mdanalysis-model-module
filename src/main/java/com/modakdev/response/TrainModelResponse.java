package com.modakdev.response;

import com.modakdev.model.pojo.Product;

import java.util.Arrays;

public class TrainModelResponse extends MDBaseResponse{
    Product[] products;

    public TrainModelResponse() {
    }

    public TrainModelResponse(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "TrainModelResponse{" +
                "products=" + Arrays.toString(products) +
                ", txnId='" + txnId + '\'' +
                ", txnDate='" + txnDate + '\'' +
                ", txnTime='" + txnTime + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
