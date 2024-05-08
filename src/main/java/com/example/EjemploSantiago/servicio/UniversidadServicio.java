package com.example.EjemploSantiago.servicio;

import com.example.EjemploSantiago.modelo.Universidad;
import com.example.EjemploSantiago.repositorio.UniversidadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UniversidadServicio {

    @Autowired
    private UniversidadRepositorio universidadRepositorio;

    public List<Universidad> obtenerTodasLasUniversidades() {
        return universidadRepositorio.findAll();
    }

    public Universidad obtenerUniversidadPorId(Long id) {
        Optional<Universidad> resultado = universidadRepositorio.findById(id);
        return resultado.orElse(null);
    }

    public Universidad guardarUniversidad(Universidad universidad) {
        return universidadRepositorio.save(universidad);
    }

    public void eliminarUniversidad(Long id) {
        universidadRepositorio.deleteById(id);
    }
}
