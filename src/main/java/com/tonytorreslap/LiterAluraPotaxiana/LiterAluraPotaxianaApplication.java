package com.tonytorreslap.LiterAluraPotaxiana;

import com.tonytorreslap.LiterAluraPotaxiana.principal.Principal;
import com.tonytorreslap.LiterAluraPotaxiana.repositorio.LibrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraPotaxianaApplication implements CommandLineRunner {
    @Autowired
    private LibrosRepositorio repositorio;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraPotaxianaApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(repositorio);
        principal.muestraElMenu();
    }

}
