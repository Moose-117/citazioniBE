package com.example.demo.model;

import java.io.Serializable;

public class Token implements Serializable {

    private static final long serialVersionUID = 1657026722406315730L;
    private String content;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}