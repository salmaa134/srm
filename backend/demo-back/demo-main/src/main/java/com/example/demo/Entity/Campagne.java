package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class Campagne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomCampagne;
    private Double seuilConsommation;
    private String fluideConcerne;
    private String natureCampagne;
    private String demandeurCampagne;

    public Campagne() {
    }

    public Campagne(Long id, String nomCampagne, Double seuilConsommation, String fluideConcerne, String natureCampagne, String demandeurCampagne) {
        this.id = id;
        this.nomCampagne = nomCampagne;
        this.seuilConsommation = seuilConsommation;
        this.fluideConcerne = fluideConcerne;
        this.natureCampagne = natureCampagne;
        this.demandeurCampagne = demandeurCampagne;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomCampagne() {
        return nomCampagne;
    }

    public void setNomCampagne(String nomCampagne) {
        this.nomCampagne = nomCampagne;
    }

    public Double getSeuilConsommation() {
        return seuilConsommation;
    }

    public void setSeuilConsommation(Double seuilConsommation) {
        this.seuilConsommation = seuilConsommation;
    }

    public String getFluideConcerne() {
        return fluideConcerne;
    }

    public void setFluideConcerne(String fluideConcerne) {
        this.fluideConcerne = fluideConcerne;
    }

    public String getNatureCampagne() {
        return natureCampagne;
    }

    public void setNatureCampagne(String natureCampagne) {
        this.natureCampagne = natureCampagne;
    }

    public String getDemandeurCampagne() {
        return demandeurCampagne;
    }

    public void setDemandeurCampagne(String demandeurCampagne) {
        this.demandeurCampagne = demandeurCampagne;
    }
}
