package com.julen.euskalmet;

public class Alojamiento {

    private String codigo;
    private String nombre;  
    private String tipo;
    private String direccion;
    private String localidad;
    private String municipio;

    public Alojamiento() {
    }

    public Alojamiento(String codigo, String nombre, String tipo, String direccion, String localidad, String municipio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.localidad = localidad;
        this.municipio = municipio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }


   
    @Override
    public String toString() {
        return "Tendencia {" +
                "\n  id='" + codigo + '\'' +
                "\n  nombre='" + nombre + '\'' +
                "\n  tipo='" + tipo + '\'' +
                "\n  direccion='" + direccion + '\'' +
                "\n  localidad='" + localidad + '\'' +
                "\n  municipio='" + municipio + '\'' +                
                "\n}";
    }

}
