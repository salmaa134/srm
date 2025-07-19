package com.example.demo.Repository;

import com.example.demo.Entity.Campagne;
import com.example.demo.Entity.Dag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DagRepository extends JpaRepository<Dag, Long> {
}
