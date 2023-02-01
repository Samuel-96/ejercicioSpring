package com.samuel.ejercicioSpring;

import com.samuel.ejercicioSpring.model.Libro;

import java.util.List;
import java.util.Optional;

public interface LibrosService {
    List<Libro> findAll();

    Optional<Libro> findById(Long id);

    void saveLibro(Libro libro);

    Libro updateLibro(Long id, Libro libro);

    void deleteLibroById(Long id);

}
