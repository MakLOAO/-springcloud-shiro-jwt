package com.haochen.consumer.auth.dto;

import java.io.Serializable;

public class LoginOutputBean implements Serializable {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
