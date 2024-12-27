package com.taller.atmspringboot.repository;

import com.taller.atmspringboot.model.Cajero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CajeroRepository extends JpaRepository<Cajero, Long> {
}
