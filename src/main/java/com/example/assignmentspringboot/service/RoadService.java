package com.example.assignmentspringboot.service;


import com.example.assignmentspringboot.entity.District;
import com.example.assignmentspringboot.entity.Road;
import com.example.assignmentspringboot.exception.NotFoundException;
import com.example.assignmentspringboot.repository.DistrictRepository;
import com.example.assignmentspringboot.repository.RoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoadService {
    @Autowired
    DistrictRepository districtRepository;
    @Autowired
    RoadRepository roadRepository;

    public Road save(Road road) {
        District district = districtRepository.findById(road.getDistrict_id()).orElse(null);
        if (district == null) {
            throw new NotFoundException("No district found!");
        }
        else {
            road.setDistrict(district);
            roadRepository.save(road);
        }
        return road;
    }
    public List<Road> findAll() {
        return roadRepository.findAll();
    }
}
