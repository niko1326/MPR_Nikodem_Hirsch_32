package com.example.MPR_Project.repository;

import com.example.MPR_Project.model.Plane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaneRepository extends CrudRepository<Plane,Long> {
    public List<Plane> findByModel(String model);
}
