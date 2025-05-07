package com.demowebshop.tests;

public class UserLogin(){
    private String mail;
    private String password;

    public String getMail() {
        return mail;
    }

    public UserLogin setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserLogin setPassword(String password) {
        this.password = password;
        return this;
    }
}