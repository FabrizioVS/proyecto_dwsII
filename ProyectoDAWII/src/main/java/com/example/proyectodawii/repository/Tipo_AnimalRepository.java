package com.example.proyectodawii.repository;

import com.example.proyectodawii.model.tipo_animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tipo_AnimalRepository extends JpaRepository<tipo_animal, Long>{
}
