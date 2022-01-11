package ru.azanova.KPIris;

public class product {
    public String id, name, timeOver, timeUni, timePlos;

    public product() {
    }

    public product(String id, String name, String timeOver, String timeUni, String timePlos) {
        this.id = id;
        this.name = name;
        this.timeOver = timeOver;
        this.timeUni = timeUni;
        this.timePlos = timePlos;
    }
}
