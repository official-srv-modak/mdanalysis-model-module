package com.modakdev.request;

import java.util.ArrayList;

public class TrainingRequest {
    String decisionColumn;
    String modelName;
    String modelFlag;
    String trainFilePath;
    String testFilePath;
    ArrayList<String> encodedColumns;

    public TrainingRequest() {
    }

    public TrainingRequest(String decisionColumn, String modelName, String modelFlag, String trainFilePath, String testFilePath, ArrayList<String> encodedColumns) {
        this.decisionColumn = decisionColumn;
        this.modelName = modelName;
        this.modelFlag = modelFlag;
        this.trainFilePath = trainFilePath;
        this.testFilePath = testFilePath;
        this.encodedColumns = encodedColumns;
    }

    public String getDecisionColumn() {
        
        return decisionColumn;
    }

    public void setDecisionColumn(String decisionColumn) {
        this.decisionColumn = decisionColumn;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelFlag() {
        return modelFlag;
    }

    public void setModelFlag(String modelFlag) {
        this.modelFlag = modelFlag;
    }

    public String getTrainFilePath() {
        return trainFilePath;
    }

    public void setTrainFilePath(String trainFilePath) {
        this.trainFilePath = trainFilePath;
    }

    public String getTestFilePath() {
        return testFilePath;
    }

    public void setTestFilePath(String testFilePath) {
        this.testFilePath = testFilePath;
    }

    public ArrayList<String> getEncodedColumns() {
        return encodedColumns;
    }

    public void setEncodedColumns(ArrayList<String> encodedColumns) {
        this.encodedColumns = encodedColumns;
    }

    @Override
    public String toString() {
        return "TrainingRequest{" +
                "decisionColumn='" + decisionColumn + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelFlag='" + modelFlag + '\'' +
                ", encodedColumn=" + encodedColumns +
                '}';
    }
}
