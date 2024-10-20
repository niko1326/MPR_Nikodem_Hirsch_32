package com.example.MPR_Project.controller;

import com.example.MPR_Project.model.Plane;
import com.example.MPR_Project.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plane")
public class MyRestController {

    @Autowired
    private PlaneService planeService;

    // GET all planes
    @GetMapping("/all")
    public List<Plane> getAllPlanes(){
        return planeService.getAll();
    }

    // GET plane by ID
    @GetMapping("/{id}")
    public Plane getPlaneById(@PathVariable Long id) {
        return planeService.getById(id);
    }

    // GET planes by model
    @GetMapping("/model/{model}")
    public List<Plane> findByModel(@PathVariable String model){
        return planeService.getByModel(model);
    }

    // POST to add a new plane
    @PostMapping("/add")
    public void addPlane(@RequestBody Plane plane) {
        planeService.add(plane);
    }

    // PATCH to update a plane by ID
    @PatchMapping("/update/{id}")
    public Plane updatePlane(@PathVariable Long id, @RequestBody Plane updatedPlane) {
        return planeService.update(id, updatedPlane);
    }

    // DELETE a plane by ID
    @DeleteMapping("/delete/{id}")
    public void deletePlane(@PathVariable Long id) {
        planeService.delete(id);
    }
}

