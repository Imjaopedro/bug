package com.example.equipamento.repository;

import com.example.equipamento.entity.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoRepository extends JpaRepository<Equipamento,Long> {
}
