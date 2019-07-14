package com.antstep.library.entity;

public class Magazine extends Print{
    private String theme;
    private double periodicity;

    public String getTheme() {
        return theme;
    }

    public double getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(double periodicity) {
        this.periodicity = periodicity;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
