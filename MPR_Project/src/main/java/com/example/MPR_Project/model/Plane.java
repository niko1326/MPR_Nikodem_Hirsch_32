package com.example.MPR_Project.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String make;
    private String model;
    private String year_made;
    private Integer capacity;
    private Integer distance;

    public Plane(){

    }

    public Plane(String make, String model, String year_made, Integer capacity, Integer distance){
        this.make = make;
        this.model = model;
        this.year_made = year_made;
        this.capacity = capacity;
        this.distance = distance;

    }
    public String getMake() {
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getYear_made() {
        return year_made;
    }

    public void setYear_made(String year_made){
        this.year_made = year_made;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity){
        this.capacity = capacity;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance){
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
