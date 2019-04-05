package com.julen.euskalmet;

public class Alojamiento {

    private String id;
    private String tipo;
    private String nombre;
    private String municipio;
    private String web;
    private String capacidad;

    public Alojamiento() {
    }

    public Alojamiento(String id, String tipo, String nombre, String municipio, String web, String capacidad) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.municipio = municipio;
        this.web = web;
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
   
    @Override
    public String toString() {
        return "Tendencia {" +
                "\n  id='" + id + '\'' +
                "\n  tipo='" + tipo + '\'' +
                "\n  nombre='" + nombre + '\'' +
                "\n  municipio='" + municipio + '\'' +
                "\n  web='" + web + '\'' +
                "\n  capacidad='" + capacidad + '\'' +                
                "\n}";
    }

}
