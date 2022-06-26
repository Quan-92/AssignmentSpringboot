package com.example.assignmentspringboot.repository;

import com.example.assignmentspringboot.entity.Road;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoadRepository extends JpaRepository<Road, Integer> {

}
