package com.julen.euskalmet;

public class Alojamiento {

    private String id;
    private String nombre;
    private String fecha;
    private String lugar;
    private int precio = 0;

    public Alojamiento() {
    }

    public Alojamiento(String id, String nombre, String fecha, String lugar, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

   
    @Override
    public String toString() {
        return "Tendencia {" +
                "\n  id='" + id + '\'' +
                "\n  nombre='" + nombre + '\'' +
                "\n  municipio='" + fecha + '\'' +
                "\n  web='" + lugar + '\'' +
                "\n  capacidad='" + precio + '\'' +                
                "\n}";
    }

}
