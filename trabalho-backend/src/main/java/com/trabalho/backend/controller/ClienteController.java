package com.trabalho.backend.controller;

import com.trabalho.backend.model.Cliente;
import com.trabalho.backend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// RestController = Rest, formatação json, RequestMapping = URL
@RestController
@RequestMapping("/clientes")
public class ClienteController {

	// Injeção de automática de dependencias
    @Autowired
    private ClienteRepository clienteRepository;

    // GET -> listar todos os clientes
    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    // GET /{id} -> consultar cliente por id
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return clienteRepository.findById(id)
                .map(cliente -> ResponseEntity.ok().body(cliente))
                .orElse(ResponseEntity.notFound().build());
    }

    // POST -> criar um novo cliente
    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // DELETE /{id} -> deletar um cliente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return clienteRepository.findById(id).map(cliente -> {
            clienteRepository.deleteById(id);
            return ResponseEntity.ok().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}