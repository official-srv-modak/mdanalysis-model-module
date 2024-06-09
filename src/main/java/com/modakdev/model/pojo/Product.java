package com.modakdev.model.pojo;


public class Product {
    int id;
    String name;
    String description;
    String correlationMatrix;
    String encodedColumns;
    String decisionColumn;
    String testModelPath, trainModelPath;


    public Product(int id, String name, String description, String correlationMatrix, String encodedColumns, String decisionColumn, String testModelPath, String trainModelPath) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.correlationMatrix = correlationMatrix;
        this.encodedColumns = encodedColumns;
        this.decisionColumn = decisionColumn;
        this.testModelPath = testModelPath;
        this.trainModelPath = trainModelPath;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEncodedColumns() {
        return encodedColumns;
    }

    public void setEncodedColumns(String encodedColumns) {
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

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", correlationMatrix='" + correlationMatrix + '\'' +
                ", encodedColumns='" + encodedColumns + '\'' +
                '}';
    }
}
