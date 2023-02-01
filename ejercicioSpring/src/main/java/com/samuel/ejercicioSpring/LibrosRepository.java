package com.samuel.ejercicioSpring;

import com.samuel.ejercicioSpring.model.Libro;
import org.springframework.data.repository.CrudRepository;
//En el CrudRepository la primera es el tipo de entidad o POJO y la segunda el tipo de la clave principal
public interface LibrosRepository extends CrudRepository<Libro,Long> {
}
