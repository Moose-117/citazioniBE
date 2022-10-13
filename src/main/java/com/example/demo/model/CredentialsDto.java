package com.example.demo.model;

import java.io.Serializable;

public class CredentialsDto implements Serializable {
     
    private static final long serialVersionUID = -7075898400954487930L;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
