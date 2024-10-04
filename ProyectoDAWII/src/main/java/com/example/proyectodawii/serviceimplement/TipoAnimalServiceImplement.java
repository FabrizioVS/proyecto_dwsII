package com.example.proyectodawii.serviceimplement;

import com.example.proyectodawii.model.tipo_animal;
import com.example.proyectodawii.repository.Tipo_AnimalRepository;
import com.example.proyectodawii.service.TipoAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TipoAnimalServiceImplement implements TipoAnimalService {

    @Autowired
    private Tipo_AnimalRepository dao;


    @Override
    public ResponseEntity<Map<String, Object>> listarTipoAnimal() {
return  null;
    }

    @Override
    public ResponseEntity<Map<String, Object>> listarTipoanimalPorId(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Object>> agregarTipoAnimal(tipo_animal tipoAnimal) {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Object>> editarTipoAnimal(tipo_animal tipoAnimal, Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Object>> eliminarTipoAnimal(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Object>> eliminarTipoAnimalEnable(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Object>> allTipoAnimalEnable() {
        return null;
    }
}
