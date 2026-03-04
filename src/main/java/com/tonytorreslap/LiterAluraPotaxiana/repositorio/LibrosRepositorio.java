package com.tonytorreslap.LiterAluraPotaxiana.repositorio;

import com.tonytorreslap.LiterAluraPotaxiana.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibrosRepositorio extends JpaRepository <Libro, Long> {
    Optional<Libro> findByTituloContainingIgnoreCase(String nombreLibro);
}
