package com.example.assignmentspringboot.service;

import com.example.assignmentspringboot.entity.District;
import com.example.assignmentspringboot.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;

    public List<District> findAll() {
        return districtRepository.findAll();
    }

    public District save(District district) {
        return districtRepository.save(district);
    }
}
