package com.example.MPR_Project.model;

public class Plane {
    private String make;
    private String model;
    private String year;
    private Integer capacity;
    private Integer range;

    public Plane(String make, String model, String year, Integer capacity, Integer range){
        this.make = make;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
        this.range = range;

    }
    public String getMake() {
        return make;
    }

    public void setMake(){
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(){
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(){
        this.year = year;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(){
        this.capacity = capacity;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(){
        this.range = range;
    }


}
