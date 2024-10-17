package com.example.MPR_Project.service;

import com.example.MPR_Project.model.Plane;
import com.example.MPR_Project.repository.PlaneRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaneService {
    PlaneRepository repository;
    private List<Plane> planeList = new ArrayList<>();
    public PlaneService(PlaneRepository repository){
        this.repository = repository;

        repository.save(new Plane("Boeing", "737", "1998",200,800));
        repository.save(new Plane("Airbus", "320", "1988",180,1200));
        repository.save(new Plane("Boeing", "787", "2002",160,2000));
    }

    public List<Plane> getByModel(String model){
        return this.repository.findByModel(model);
    }

    public List<Plane> getAll(){
        return (List<Plane>) this.repository.findAll();
    }

    public void add(Plane plane) {
        planeList.add(plane);
    }
}
