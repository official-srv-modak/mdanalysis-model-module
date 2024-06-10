package com.modakdev.response;

import com.modakdev.model.pojo.Product;
import com.modakdev.model.values.InputType;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class MultipleProductResponse extends MDBaseResponse{
    ConcurrentHashMap<String, String> productResponse = new ConcurrentHashMap<>();
    ArrayList<Product> products;

    public MultipleProductResponse() {

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void build(ArrayList<Product> products){
        this.products = products;
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
}
