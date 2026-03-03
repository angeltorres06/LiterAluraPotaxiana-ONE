package com.tonytorreslap.LiterAluraPotaxiana.principal;

import com.tonytorreslap.LiterAluraPotaxiana.repositorio.LibrosRepositorio;
import com.tonytorreslap.LiterAluraPotaxiana.servicio.ConsumoAPI;
import com.tonytorreslap.LiterAluraPotaxiana.servicio.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner (System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConvierteDatos conversor = new ConvierteDatos();

    private LibrosRepositorio repositorio;
    public Principal (LibrosRepositorio repositorio){
        this.repositorio = repositorio;
    }

    public void muestraElMenu() {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    -------------------------------------------------------------------------------------------------
                    ¡Bienvenide! Seleccione una opción por favxr :))
                    1- Buscar libro por titulo
                    2- Listar libros registrados
                    3- Listar autores registrados
                    4- Listar autores vivos en determinado año
                    5- ////
                    
                    0-salir de esta bongos
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Cerrando esta Withness bb! ADIÓS.");
                    break;
                default:
                    System.out.println("Opción inválida eso qué...");
            }
        }
    }
}
