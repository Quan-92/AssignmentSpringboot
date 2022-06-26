package com.example.asmspb.service;


import com.example.asmspb.entity.District;
import com.example.asmspb.entity.Road;
import com.example.asmspb.exception.NotFoundException;
import com.example.asmspb.repository.DistrictRepository;
import com.example.asmspb.repository.RoadRepository;
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
