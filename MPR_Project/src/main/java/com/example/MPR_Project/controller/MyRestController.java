package com.example.MPR_Project.controller;

import com.example.MPR_Project.model.Plane;
import com.example.MPR_Project.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRestController {
    @Autowired
    private PlaneService planeService;

    @GetMapping("plane/all")
    public List<Plane> getAllPlanes(){
        return planeService.getAll();
    }

    @GetMapping("plane/model/{model}")
    public List<Plane> findByModel(@PathVariable String model){
        return this.planeService.getByModel(model);
    }

    @PostMapping ("plane")
    public void addPlane(@RequestBody Plane plane){
        planeService.add(plane);
    }
}
