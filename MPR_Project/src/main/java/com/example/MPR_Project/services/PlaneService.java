package com.example.MPR_Project.services;

import com.example.MPR_Project.model.Plane;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlaneService {
    private List<Plane> planesList = new ArrayList<>();

    PlaneService(){
        planesList.add(new Plane("Boeing", "737", "1998",200,800));
        planesList.add(new Plane("Airbus", "320", "1988",180,1200));
        planesList.add(new Plane("Boeing", "787", "2002",160,2000));
    }

    public List<Plane> getAll(){
        return this.planesList;
    }
}
