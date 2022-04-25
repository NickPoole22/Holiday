package com.company;

public class Holiday {
    String name;
    int month;
    int dayOfMonth;
    boolean isfedRecognized;
    String description;


    public Holiday(String name, int month, int dayOfMonth, boolean isfedRecognized, String description) {
        this.name = name;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.isfedRecognized = isfedRecognized;
        this.description = description;
    }


    public boolean isIsfedRecognized() {
        return isfedRecognized;
    }

    public void setIsfedRecognized(boolean isfedRecognized) {
        this.isfedRecognized = isfedRecognized;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

