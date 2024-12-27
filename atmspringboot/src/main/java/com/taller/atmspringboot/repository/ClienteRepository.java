package com.taller.atmspringboot.repository;

import com.taller.atmspringboot.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
    Cliente findByNumeroDocumento(String numeroDocumento);
}
