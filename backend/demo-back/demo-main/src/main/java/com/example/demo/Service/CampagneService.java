package com.example.demo.Service;

import com.example.demo.Entity.Campagne;
import com.example.demo.Repository.CampagneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampagneService {

    private final CampagneRepository repository;

    public CampagneService(CampagneRepository repository) {
        this.repository = repository;
    }

    public List<Campagne> findAll() {
        return repository.findAll();
    }

    public Campagne save(Campagne campagne) {
        return repository.save(campagne);
    }
}
