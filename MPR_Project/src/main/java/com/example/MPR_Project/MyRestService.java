package com.example.MPR_Project;

import com.example.MPR_Project.model.Planes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestService {

    @GetMapping("planes/")
    public Planes getPlanes(){
        return null;
    }
}
