package com.example.authentication;

public class User {
    private String name;
    private String email;
    private String userId;

    public User(){

    }

    public User(String name, String email){
        this.name = name;
        this.email= email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
