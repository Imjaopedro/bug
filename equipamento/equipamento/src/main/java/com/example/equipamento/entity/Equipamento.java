package com.example.equipamento.entity;

import jakarta.persistence.*;

@Table(name = "equipamento")
@Entity(name = "equipamento")
public class Equipamento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String departamento;
    private String sku;

    public Equipamento() {
    }

    public Equipamento(Long id, String nome, String departamento, String sku) {
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
        this.sku = sku;
    }

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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
