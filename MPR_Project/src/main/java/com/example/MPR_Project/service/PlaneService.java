package com.example.MPR_Project.service;

import com.example.MPR_Project.model.Plane;
import com.example.MPR_Project.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaneService {

    @Autowired
    private PlaneRepository planeRepository;

    // Constructor that saves some planes initially
    public PlaneService(PlaneRepository repository){
        this.planeRepository = repository;

        // Adding some initial planes to the repository
        planeRepository.save(new Plane("Boeing", "737", "1998",200,800));
        planeRepository.save(new Plane("Airbus", "320", "1988",180,1200));
        planeRepository.save(new Plane("Boeing", "787", "2002",160,2000));
    }

    // Method to find planes by model
    public List<Plane> getByModel(String model){
        return this.planeRepository.findByModel(model);
    }

    // Method to get all planes
    public List<Plane> getAll(){
        return (List<Plane>) this.planeRepository.findAll();
    }

    // Method to add a new plane
    public void add(Plane plane) {
        planeRepository.save(plane);  // Use the injected planeRepository instance
    }

    // Method to find a plane by ID
    public Plane getById(Long id) {
        return planeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Plane not found with ID " + id));  // Throw exception if plane not found
    }

    // Method to update a plane
    public Plane update(Long id, Plane updatedPlane) {
        Plane existingPlane = planeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Plane not found with ID " + id));

        if (updatedPlane.getMake() != null) {
            existingPlane.setMake(updatedPlane.getMake());
        }
        if (updatedPlane.getModel() != null) {
            existingPlane.setModel(updatedPlane.getModel());
        }
        if (updatedPlane.getYear_made() != null) {
            existingPlane.setYear_made(updatedPlane.getYear_made());
        }
        if (updatedPlane.getCapacity() != null) {
            existingPlane.setCapacity(updatedPlane.getCapacity());
        }
        if (updatedPlane.getDistance() != null) {
            existingPlane.setDistance(updatedPlane.getDistance());
        }

        return planeRepository.save(existingPlane);  // Save and return updated plane
    }

    // Method to delete a plane by ID
    public void delete(Long id) {
        if (!planeRepository.existsById(id)) {
            throw new RuntimeException("Plane not found with ID " + id);
        }
        planeRepository.deleteById(id);
    }
}
