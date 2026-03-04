# LiterAlura <<Potaxiana>> 
ni modo que fife...

Bienvenidx. Este es un proyecto de consola desarrollado en Java con Spring Boot. Esta aplicación consume la API pública de [Gutendex](https://gutendex.com/) para buscar libros de dominio público,
guardar su información en una base de datos relacional y permitirte gestionar tu propia biblioteca virtual de acuerdo a los valores de jiafei (salve jiafei)

## Características 

La aplicación cuenta con un menú interactivo que te permite realizar las siguientes acciones:

1. **🔍 Buscar libro por título:** Consume la API de Gutendex, busca tu libro, lo mapea y lo guarda automáticamente en tu base de datos (junto con sus autores). 
2. **📖 Listar libros registrados:** Muestra todos los libros que ya has guardado en tu colección local.
3. **✍️ Listar autores registrados:** Extrae y muestra una lista única de todos los creadores de los libros de tu biblioteca.
4. **🕰️ Buscar autores vivos por año:** Ingresa un año y descubre qué autores de tu base de datos estaban respirando en ese momento.
5. **🌍 Listar libros por idioma:** Filtra tu colección usando siglas de idiomas (`es`, `en`, `fr`, `pt`). 
   * *prueba a buscar el idioma potaxie....*

## 🛠️ Tecnologías y Herramientas Utilizadas

Este proyecto fue construido con las siguientes tecnologías:

* **Java 25** 
* **Spring Boot** 
* **Spring Data JPA / Hibernate** 
* **Maven** 
* **Jackson** 
* **Base de Datos:** 
* **API Externa:** [Gutendex API](https://gutendex.com/)

## ⚙️ Requisitos Previos

Antes de correr esta Adele21, asegúrate de tener instalado:
* [Java JDK 25]
* [Maven](https://maven.apache.org/).
* Un gestor de base de datos (como MySQL o PostgreSQL).
* Un IDE (IntelliJ IDEA es altamente recomendado).

## Cómo ejecutar el proyecto

1. **Clona este repositorio:**
   ```bash
   git clone [https://github.com/tu-usuario/LiterAluraPotaxiana.git](https://github.com/angeltorres06/LiterAluraPotaxiana-ONE.git)
