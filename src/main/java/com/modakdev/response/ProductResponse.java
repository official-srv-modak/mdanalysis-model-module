package com.modakdev.response;

import com.modakdev.model.pojo.Product;
import com.modakdev.model.values.InputType;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

public class ProductResponse extends MDBaseResponse {
    ConcurrentHashMap<String, String> productResponse = new ConcurrentHashMap<>();
    Product product;

    public ProductResponse() {
    }

    public Product getProduct() {
        return product;
    }

    public void build(Product product) {
        this.product = product;
        Field[] fields = Product.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); // Make it accessible if private
            Class<?> type = field.getType();
            String fieldName = "";
            if(type != String.class)
                fieldName = InputType.MULTIPLE_TEXT.getStringValue();
            else
                fieldName = InputType.SINGLE_TEXT.getStringValue();

            productResponse.put(field.getName(), fieldName);
        }
    }

    @Override
    public String toString() {
        return "ProductResponse{" +
                "productResponse=" + productResponse +
                ", product=" + product +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
