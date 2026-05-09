package com.trabalho.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;

//Precisa avisar o spring que a classe vai ser uma table
@Entity
public class Produto {

	// Id = primary key, GenerateValue = gera id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private BigDecimal preco;

    private Boolean estoque;

    // Construtor padrão vazio
    // JPA precisa do construtor vazio
    public Produto() {
    }

    // Construtor alternativo
    public Produto(String nome, BigDecimal preco, Boolean estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Boolean getEstoque() {
        return estoque;
    }

    public void setEstoque(Boolean estoque) {
        this.estoque = estoque;
    }
}