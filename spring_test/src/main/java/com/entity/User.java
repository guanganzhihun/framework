package com.entity;

public class User {
    private String userName;
    private String password;
    private String interview;

    public User() {
    }

    public User(String userName, String password, String interview) {
        this.userName = userName;
        this.password = password;
        this.interview = interview;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", interview='" + interview + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInterview() {
        return interview;
    }

    public void setInterview(String interview) {
        this.interview = interview;
    }
}
