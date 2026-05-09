package com.trabalho.backend.repository;

import com.trabalho.backend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Avisa o spring que a interface vai interagir com o banco
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}