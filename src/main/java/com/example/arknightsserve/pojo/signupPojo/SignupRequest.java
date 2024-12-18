package com.example.arknightsserve.pojo.signupPojo;

public class SignupRequest {
    private String account;
    private String password;

    // Getters and Setters
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}