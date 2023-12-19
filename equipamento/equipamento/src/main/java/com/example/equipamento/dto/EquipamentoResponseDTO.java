package com.example.equipamento.dto;

import com.example.equipamento.entity.Equipamento;

public record EquipamentoResponseDTO(Long id, String nome, String departamento, String sku) {

    public EquipamentoResponseDTO(Equipamento equipamento){
        this(equipamento.getId(), equipamento.getNome(), equipamento.getDepartamento(), equipamento.getSku());
    }

}
