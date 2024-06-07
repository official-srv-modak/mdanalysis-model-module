package com.modakdev.model.pojo;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class Product {
    int pid;
    String name;
    String description;
    String correlationMatrix;
    ArrayList<String> encodedColumns;
    ConcurrentHashMap<String, String> otherParams = new ConcurrentHashMap<>();

    public Product() {
    }

    public Product(int pid, String name, String description, String correlationMatrix, ArrayList<String> encodedColumns, ConcurrentHashMap<String, String> otherParams) {
        this.pid = pid;
        this.name = name;
        this.description = description;
        this.correlationMatrix = correlationMatrix;
        this.encodedColumns = encodedColumns;
        this.otherParams = otherParams;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCorrelationMatrix() {
        return correlationMatrix;
    }

    public void setCorrelationMatrix(String correlationMatrix) {
        this.correlationMatrix = correlationMatrix;
    }

    public ArrayList<String> getEncodedColumns() {
        return encodedColumns;
    }

    public void setEncodedColumns(ArrayList<String> encodedColumns) {
        this.encodedColumns = encodedColumns;
    }

    public ConcurrentHashMap<String, String> getOtherParams() {
        return otherParams;
    }

    public void setOtherParams(ConcurrentHashMap<String, String> otherParams) {
        this.otherParams = otherParams;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", correlationMatrix='" + correlationMatrix + '\'' +
                ", encodedColumns='" + encodedColumns + '\'' +
                ", otherParams=" + otherParams +
                '}';
    }
}
