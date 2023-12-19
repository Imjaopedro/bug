package com.example.equipamento.controller;

import com.example.equipamento.dto.EquipamentoResponseDTO;
import com.example.equipamento.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentoController {

    @Autowired
    private EquipamentoRepository repository;

    @GetMapping
    public List<EquipamentoResponseDTO> getALl(){
        List<EquipamentoResponseDTO> equipamentoList = repository.findAll().stream().map(EquipamentoResponseDTO::new).toList();
        return equipamentoList;
    }


}
