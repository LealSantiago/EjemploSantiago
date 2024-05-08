package com.example.EjemploSantiago.controlador;

import com.example.EjemploSantiago.modelo.Universidad;
import com.example.EjemploSantiago.servicio.UniversidadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/universidades")
public class UniversidadControlador {

    @Autowired
    private UniversidadServicio universidadServicio;

    @GetMapping
    public String mostrarTodasLasUniversidades(Model model) {
        model.addAttribute("universidades", universidadServicio.obtenerTodasLasUniversidades());
        return "universidades";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioDeNuevaUniversidad(Model model) {
        Universidad universidad = new Universidad();
        model.addAttribute("universidad", universidad);
        return "formulario-universidad";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEditarUniversidad(@PathVariable Long id, Model model) {
        Universidad universidad = universidadServicio.obtenerUniversidadPorId(id);
        model.addAttribute("universidad", universidad);
        return "formulario-universidad";
    }

    @PostMapping("/guardar")
    public String guardarUniversidad(@ModelAttribute Universidad universidad) {
        universidadServicio.guardarUniversidad(universidad);
        return "redirect:/universidades";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarUniversidad(@PathVariable Long id) {
        universidadServicio.eliminarUniversidad(id);
        return "redirect:/universidades";
    }
}
