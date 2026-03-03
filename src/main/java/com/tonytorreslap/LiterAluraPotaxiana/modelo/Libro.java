package com.tonytorreslap.LiterAluraPotaxiana.modelo;


import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long ID;
    private String titulo;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Autor> autor;
    @ElementCollection(fetch = FetchType.EAGER)
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
