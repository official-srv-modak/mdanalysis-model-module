package com.modakdev.response;
import org.json.simple.JSONObject;

public class PredictionResponse extends MDBaseResponse {
    JSONObject clientData;
    int decision;

    public PredictionResponse() {
    }

    public JSONObject getClientData() {
        return clientData;
    }

    public void setClientData(JSONObject clientData) {
        this.clientData = clientData;
    }

    public int getDecision() {
        return decision;
    }

    public void setDecision(int decision) {
        this.decision = decision;
    }
}
