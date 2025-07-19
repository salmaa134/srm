package com.example.demo.Service;

import com.example.demo.Entity.Campagne;
import com.example.demo.Entity.Dag;
import com.example.demo.Repository.CampagneRepository;
import com.example.demo.Repository.DagRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DagService {

    private final DagRepository   repository;

    public DagService(DagRepository  repository) {
        this.repository = repository;
    }

    public List<Dag> findAll() {
        return repository.findAll();
    }



}
