package com.example.proyectofinalandroidjava;

public class Departament {

    private String nombre_proyecto;
    private String direccion_proyecto;
    private String numero_proyecto;
    private int imagen_proyecto;

    public Departament() {

    }

    public Departament(String nombre_proyecto, String direccion_proyecto, String numero_proyecto, int imagen_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
        this.direccion_proyecto = direccion_proyecto;
        this.numero_proyecto = numero_proyecto;
        this.imagen_proyecto = imagen_proyecto;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getDireccion_proyecto() {
        return direccion_proyecto;
    }

    public void setDireccion_proyecto(String direccion_proyecto) {
        this.direccion_proyecto = direccion_proyecto;
    }

    public String getNumero_proyecto() {
        return numero_proyecto;
    }

    public void setNumero_proyecto(String numero_proyecto) {
        this.numero_proyecto = numero_proyecto;
    }

    public int getImagen_proyecto() {
        return imagen_proyecto;
    }

    public void setImagen_proyecto(int imagen_proyecto) {
        this.imagen_proyecto = imagen_proyecto;
    }
}