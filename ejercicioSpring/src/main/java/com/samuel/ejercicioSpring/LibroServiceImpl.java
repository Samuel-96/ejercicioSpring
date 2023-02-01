package com.samuel.ejercicioSpring;

import com.samuel.ejercicioSpring.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImpl implements LibrosService{
    @Autowired
    private LibrosRepository lr;

    public List<Libro> findAll() {
        return (List<Libro>) lr.findAll();
    }

    public Optional<Libro> findById(Long id) {
        return lr.findById(id);
    }

    public void saveLibro(Libro libro) {
        lr.save(libro);
    }

    public Libro updateLibro(Long id, Libro libro) {
        if(lr.findById(id).isPresent())
        {
            lr.save(libro);
        }
        return libro;
    }

    public void deleteLibroById(Long id) {
        lr.deleteById(id);
    }
}
