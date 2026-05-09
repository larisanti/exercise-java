package com.trabalho.backend.controller;

import com.trabalho.backend.model.Pedido;
import com.trabalho.backend.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// RestController = formatação json, RequestMapping = URL
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    // Injeção automática de dependencias
    @Autowired
    private PedidoRepository pedidoRepository;

    // GET -> listar todos os pedidos
    @GetMapping
    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    // GET /{id} -> consultar pedido por id
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id) {
        return pedidoRepository.findById(id)
                .map(pedido -> ResponseEntity.ok().body(pedido))
                .orElse(ResponseEntity.notFound().build());
    }

    // POST -> criar um novo pedido
    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // DELETE /{id} -> deletar um pedido
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return pedidoRepository.findById(id).map(pedido -> {
            pedidoRepository.deleteById(id);
            return ResponseEntity.ok().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
