package com.example.demo.Controller;


import com.example.demo.Entity.Campagne;
import com.example.demo.Entity.Dag;
import com.example.demo.Repository.DagRepository;
import com.example.demo.Service.CampagneService;
import com.example.demo.Service.DagService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/dags")
@CrossOrigin("*")
public class DagsController {

    private final DagService service;

    public DagsController(DagService service ) {
        this.service = service;
    }

    @GetMapping
    public List<Dag> getAll() {
        return service.findAll();
    }

    // ... in your service or controller
    WebClient webClient = WebClient.builder().baseUrl("http://localhost:8080/dags?limit=100&order_by=-dag_id&only_active=true").build();
    Mono<DagRepository> response = webClient.get()

            .retrieve()
            .bodyToMono(DagRepository.class);

}
