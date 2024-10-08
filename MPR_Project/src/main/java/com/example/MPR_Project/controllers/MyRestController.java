package com.example.MPR_Project.controllers;

import com.example.MPR_Project.model.Plane;
import com.example.MPR_Project.services.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyRestController {
    @Autowired
    private PlaneService planeService;

    @GetMapping("plane/")
    public Plane getPlanes(){
        return null;
    }
    @GetMapping("plane/all")
    public List<Plane> getAllPlanes(){
        return planeService.getAll();
    }
}
