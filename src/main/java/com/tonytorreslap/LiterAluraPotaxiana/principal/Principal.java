package com.tonytorreslap.LiterAluraPotaxiana.principal;

import com.tonytorreslap.LiterAluraPotaxiana.modelo.Datos;
import com.tonytorreslap.LiterAluraPotaxiana.modelo.DatosLibros;
import com.tonytorreslap.LiterAluraPotaxiana.modelo.Libro;
import com.tonytorreslap.LiterAluraPotaxiana.repositorio.LibrosRepositorio;
import com.tonytorreslap.LiterAluraPotaxiana.servicio.ConsumoAPI;
import com.tonytorreslap.LiterAluraPotaxiana.servicio.ConvierteDatos;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner (System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConvierteDatos conversor = new ConvierteDatos();
    private Optional<DatosLibros>  libroBuscado;


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
                    buscarLibroPorTitulo();
                    break;
                case 2:
                    mostrarLibrosRegistrados();
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

    private void buscarLibroPorTitulo() {
        System.out.println("Escriba el nombre del libro potaxiano que desea buscar");
        var nombreLibro = teclado.nextLine();

        Optional<Libro> libroExistente = repositorio.findByTituloContainingIgnoreCase(nombreLibro);
        if (libroExistente.isPresent()) {
            System.out.println("¡El libro ya está registradx en nuestrx base de dates! Aquí lo tienes reina:");
            System.out.println(libroExistente.get());
            return;
        }
        var json = consumoApi.obtenerDatos(URL_BASE + "?search=" + nombreLibro.replace(" ", "+"));
        var datosBusqueda = conversor.obtenerDatos(json, Datos.class);

        libroBuscado = datosBusqueda.resultados().stream()
                .filter(l -> l.titulo().toUpperCase().contains(nombreLibro.toUpperCase()))
                .findFirst();

        if (libroBuscado.isPresent()){
            System.out.println("¡Libro encontradx en Gutendex!");
            Libro libro = new Libro(libroBuscado.get());
            repositorio.save(libro);
            System.out.println("Libro guardado exitosamente bb: \n" + libro);
        } else {
            System.out.println("Libre no encontrade :(");
        }
    }
    private void mostrarLibrosRegistrados() {
        System.out.println("\n--- Lista de Libros Potaxianos Registrados ---");
        List<Libro> libros = repositorio.findAll();

        if (libros.isEmpty()) {
            System.out.println("Aún no hay libros en la base de datos bb. ¡Busca algunos en la opción 1 primerx!");
        } else {
            libros.forEach(System.out::println);
        }
    }

}
