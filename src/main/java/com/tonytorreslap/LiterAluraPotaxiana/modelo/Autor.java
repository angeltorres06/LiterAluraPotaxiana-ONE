package com.tonytorreslap.LiterAluraPotaxiana.modelo;

public class Autor {
    private String nombre;
    private String fechaDeNacimiento;


    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
