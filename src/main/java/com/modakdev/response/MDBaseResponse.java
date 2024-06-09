package com.modakdev.response;

import org.springframework.http.HttpStatus;

import java.util.UUID;

public class MDBaseResponse {

    protected final String txnId;
    protected String txnDate;
    protected String txnTime;
    protected HttpStatus status;
    protected String message = "";

    public MDBaseResponse() {
        this.txnId = UUID.randomUUID().toString();
        this.txnDate = String.valueOf(java.time.LocalDate.now());
        this.txnTime = String.valueOf(java.time.LocalTime.now());
    }

    public MDBaseResponse(HttpStatus status, String message) {
        this.txnId = UUID.randomUUID().toString();;
        this.txnDate = String.valueOf(java.time.LocalDate.now());
        this.txnTime = String.valueOf(java.time.LocalTime.now());
        this.status = status;
        this.message = message;
    }

    public String getTxnId() {
        return txnId;
    }

    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
