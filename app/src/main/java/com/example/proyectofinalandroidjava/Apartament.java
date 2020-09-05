package com.example.proyectofinalandroidjava;

public class Apartament {

    private String nombre_proyecto;
    private String direccion_proyecto;
    private String numero_proyecto;
    private String imagen_proyecto;

    public Apartament() {

    }

    public Apartament(String nombre_proyecto, String direccion_proyecto, String numero_proyecto, String imagen_proyecto) {
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

    public String getImagen_proyecto() {
        return imagen_proyecto;
    }

    public void setImagen_proyecto(String imagen_proyecto) {
        this.imagen_proyecto = imagen_proyecto;
    }
}
