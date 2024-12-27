package com.taller.atmspringboot.controller;

import com.taller.atmspringboot.model.Cliente;
import com.taller.atmspringboot.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{numeroDocumento}")
    public Cliente obtenerCliente(@PathVariable String numeroDocumento) {
        return clienteService.obtenerClientePorNumeroDocumento(numeroDocumento);
    }

    @PostMapping("/guardar")
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return clienteService.guardarCliente(cliente);
    }
}
