package com.antstep.library.entity;

public class User {
    private String name;
    private String role;
    private double id;

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
