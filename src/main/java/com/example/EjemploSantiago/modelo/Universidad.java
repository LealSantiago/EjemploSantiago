package com.example.EjemploSantiago.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "universidades")
public class Universidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String ciudad;
    private int numeroDeEstudiantes;
    private int añoDeFundacion;

    public Universidad() {}

    public Universidad(String nombre, String ciudad, int numeroDeEstudiantes, int añoDeFundacion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numeroDeEstudiantes = numeroDeEstudiantes;
        this.añoDeFundacion = añoDeFundacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumeroDeEstudiantes() {
        return numeroDeEstudiantes;
    }

    public void setNumeroDeEstudiantes(int numeroDeEstudiantes) {
        this.numeroDeEstudiantes = numeroDeEstudiantes;
    }

    public int getAñoDeFundacion() {
        return añoDeFundacion;
    }

    public void setAñoDeFundacion(int añoDeFundacion) {
        this.añoDeFundacion = añoDeFundacion;
    }
}


