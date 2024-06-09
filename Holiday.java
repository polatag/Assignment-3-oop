package com.mycompany.assignment_3_oop;

public class Holiday {

    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday vacance) {
        if (this.month == vacance.month) {
            return true;
        }

        return false;
    }

    public double avgDate(Holiday[] arr) {
        double avgOfdays = 0;
        for (Holiday i : arr) {
            avgOfdays += i.day;
        }
        return avgOfdays / 2;
    }
}
