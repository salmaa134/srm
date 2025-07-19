package com.example.demo.Controller;


import com.example.demo.Entity.Campagne;
import com.example.demo.Service.CampagneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campagnes")
@CrossOrigin("*")
public class CampagneController {

    private final CampagneService service;

    public CampagneController(CampagneService service) {
        this.service = service;
    }

    @GetMapping
    public List<Campagne> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Campagne create(@RequestBody Campagne campagne) {
        return service.save(campagne);
    }
}
