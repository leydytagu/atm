package com.taller.atmspringboot.controller;

import com.taller.atmspringboot.model.Cajero;
import com.taller.atmspringboot.service.CajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cajeros")
public class CajeroController {

    @Autowired
    private CajeroService cajeroService;

    @GetMapping("/{id}")
    public Cajero obtenerCajero(@PathVariable Long id) {
        return cajeroService.obtenerCajeroPorId(id);
    }

    @PostMapping("/guardar")
    public Cajero guardarCajero(@RequestBody Cajero cajero) {
        return cajeroService.guardarCajero(cajero);
    }
}
