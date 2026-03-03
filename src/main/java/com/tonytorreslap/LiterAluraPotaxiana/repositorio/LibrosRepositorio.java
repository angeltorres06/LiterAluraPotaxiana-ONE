package com.tonytorreslap.LiterAluraPotaxiana.repositorio;

import com.tonytorreslap.LiterAluraPotaxiana.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrosRepositorio extends JpaRepository <Libro, Long> {
}
