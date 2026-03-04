package com.tonytorreslap.LiterAluraPotaxiana.repositorio;

import com.tonytorreslap.LiterAluraPotaxiana.modelo.Autor;
import com.tonytorreslap.LiterAluraPotaxiana.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LibrosRepositorio extends JpaRepository <Libro, Long> {
    Optional<Libro> findByTituloContainingIgnoreCase(String nombreLibro);

    @Query("SELECT DISTINCT a FROM Libro l JOIN l.autor a WHERE a.fechaDeNacimiento" +
            " <= :anio AND (a.fechaDeFallecimiento >= :anio OR a.fechaDeFallecimiento IS NULL)")
    List<Autor> autoresVivosEnDeterminadoAnio(@Param("anio") String anio);
}
