package com.example.demo.Repository;

import com.example.demo.Entity.Campagne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampagneRepository extends JpaRepository<Campagne, Long> {
}
