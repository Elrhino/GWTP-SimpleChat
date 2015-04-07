package com.renaud.webchat.shared;


public class CurrentUser {

    private String username;
    private boolean registered;

    public CurrentUser(String username, boolean registered) {
        this.username = username;
        this.registered = registered;
    }

    public CurrentUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public boolean isRegistered() {
        return registered;
    }
}
