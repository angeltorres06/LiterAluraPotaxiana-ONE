package com.tonytorreslap.LiterAluraPotaxiana.modelo;


import java.util.List;

public class Libro {
    private String titulo;
    private List<Autor> autor;
    private List <String> idiomas;
    private Double numeroDeDescargas;

    public Libro(){}

    public Libro (DatosLibros datosLibros){
        this.titulo = datosLibros.titulo();
        this.numeroDeDescargas = datosLibros.numeroDeDescargas();
        this.idiomas = datosLibros.idiomas();
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", idiomas=" + idiomas +
                ", numeroDeDescargas=" + numeroDeDescargas;
    }
}
