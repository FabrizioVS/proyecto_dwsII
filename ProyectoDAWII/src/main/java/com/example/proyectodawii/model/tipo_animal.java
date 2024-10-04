package com.example.proyectodawii.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.util.List;

@Data
@Entity
@Table(name = "tipo_animal")
@AllArgsConstructor
@NoArgsConstructor
public class tipo_animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_animal")
    private long id;

    @Column(name = "descripcion")
    private String descripcion;


    private String estado;

    // Puedes agregar aquí un OneToMany si deseas obtener la lista de animales asociados.
    @OneToMany(mappedBy = "tipo_animal") // Indica que "tipoAnimal" es el campo que mantiene la relación en la clase Animal.
    private List<Animal> animales; // Esto es opcional pero puede ser útil.

}
