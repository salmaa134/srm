package com.example.demo.Controller;

import com.example.demo.Entity.Utilisateur;
import com.example.demo.Service.UtilisateurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utilisateurs")
@CrossOrigin("*")
public class UtilisateurController {

    private final UtilisateurService service;

    public UtilisateurController(UtilisateurService service) {
        this.service = service;
    }

    @GetMapping
    public List<Utilisateur> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Utilisateur create(@RequestBody Utilisateur utilisateur) {
        return service.save(utilisateur);
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Utilisateur loginUser) {
        List<Utilisateur> utilisateurs = service.findAll();

        for (Utilisateur utilisateur : utilisateurs) {
            if (
                    utilisateur.getUsername().equals(loginUser.getUsername()) &&
                            utilisateur.getPassword().equals(loginUser.getPassword())
            ) {
                return ResponseEntity.ok("Login successful");
            }
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
    }

}
