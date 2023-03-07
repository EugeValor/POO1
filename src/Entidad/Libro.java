/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class Libro {
    Scanner leer= new Scanner (System.in).useDelimiter("\n"); 
    public String titulo;
    public String autor;
    public int paginas;
    public String isbn;
    
  /*  public Libros() {
    }
*/
    public Libro(String titulo, String autor, int paginas, String isbn) {
        //System.out.println("Ingrese la catidad de libros a ingresar");
        //int cantidad = leer.nextInt();

       // for (int i = 0; i < cantidad; i++) {

            System.out.println("Ingrese el titulo del libro " );
            this.titulo = leer.next();
            System.out.println("Ingrese el nombre del autor");
            this.autor = leer.next();
            System.out.println("Ingrese el numero de paginas");
            this.paginas = leer.nextInt();
            System.out.println("Ingrese el numero de ISBN");
            this.isbn = leer.next();

        // }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", isbn=" + isbn + '}';
    }

   

   
    
}

