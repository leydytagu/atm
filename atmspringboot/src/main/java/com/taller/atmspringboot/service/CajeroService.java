package com.taller.atmspringboot.service;

import com.taller.atmspringboot.model.Cajero;
import com.taller.atmspringboot.repository.CajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CajeroService {

    @Autowired
    private CajeroRepository cajeroRepository;

    public Cajero obtenerCajeroPorId(Long id) {
        return cajeroRepository.findById(id).orElse(null);
    }

    public Cajero guardarCajero(Cajero cajero) {
        return cajeroRepository.save(cajero);
    }
}
