package com.samuel.ejercicioSpring.controller;

import com.samuel.ejercicioSpring.LibroServiceImpl;
import com.samuel.ejercicioSpring.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {
    @Autowired
    private LibroServiceImpl lsi;
    //C POST
    @PostMapping("/alta")
    public void altaLibro(Libro libro)
    {
        lsi.saveLibro(libro);
    }
    //R
    @GetMapping("/libros")
    public List<Libro> listaLibros()
    {
        return lsi.findAll();
    }
    //U
    @PutMapping("libros/{id}")
    public Libro actualizaEmpleado(@PathVariable Long id, Libro libro)
    {
        return lsi.updateLibro(id,libro);
    }

    //D
    @DeleteMapping("/libros/{id}")
    public void borraLibro(@PathVariable Long id)
    {
        lsi.deleteLibroById(id);
    }
}
