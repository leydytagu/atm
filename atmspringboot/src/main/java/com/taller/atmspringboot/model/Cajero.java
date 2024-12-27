package com.taller.atmspringboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cajero {

    @Id
    private Long id;
    private String ubicacion;
    private Double dineroDisponible;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }
}
