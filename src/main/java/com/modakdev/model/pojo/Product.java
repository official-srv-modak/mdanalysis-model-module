package com.modakdev.model.pojo;


import java.util.List;

public class Product {
    int id;
    Double accuracy;
    String name;
    String description;
    String correlationMatrix;
    List<String> encodedColumns;
    String decisionColumn;
    String testModelPath, trainModelPath;
    String imageUrl;

    public Product() {
    }

    public Product(int id, Double accuracy, String name, String description, String correlationMatrix, List<String> encodedColumns, String decisionColumn, String testModelPath, String trainModelPath, String imageUrl) {
        this.id = id;
        this.accuracy = accuracy;
        this.name = name;
        this.description = description;
        this.correlationMatrix = correlationMatrix;
        this.encodedColumns = encodedColumns;
        this.decisionColumn = decisionColumn;
        this.testModelPath = testModelPath;
        this.trainModelPath = trainModelPath;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
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

    public List<String> getEncodedColumns() {
        return encodedColumns;
    }

    public void setEncodedColumns(List<String> encodedColumns) {
        this.encodedColumns = encodedColumns;
    }

    public String getDecisionColumn() {
        return decisionColumn;
    }

    public void setDecisionColumn(String decisionColumn) {
        this.decisionColumn = decisionColumn;
    }

    public String getTestModelPath() {
        return testModelPath;
    }

    public void setTestModelPath(String testModelPath) {
        this.testModelPath = testModelPath;
    }

    public String getTrainModelPath() {
        return trainModelPath;
    }

    public void setTrainModelPath(String trainModelPath) {
        this.trainModelPath = trainModelPath;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", accuracy=" + accuracy +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", correlationMatrix='" + correlationMatrix + '\'' +
                ", encodedColumns=" + encodedColumns +
                ", decisionColumn='" + decisionColumn + '\'' +
                ", testModelPath='" + testModelPath + '\'' +
                ", trainModelPath='" + trainModelPath + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
