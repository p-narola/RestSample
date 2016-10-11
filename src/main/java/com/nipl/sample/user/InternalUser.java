package com.nipl.sample.user;


public class InternalUser {
    String userName;
    public InternalUser() {

    }
    public InternalUser(String name) {
        userName = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
