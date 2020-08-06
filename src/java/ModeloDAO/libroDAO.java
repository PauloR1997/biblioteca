/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

/**
 *
 * @author Paty Ramirez
 */
public class libroDAO {
     int idlibro;
     String titulo;
     String autor;
     String año;
     String precio;
     String editorial;

    public libroDAO() {
    }

    public libroDAO(int idlibro, String titulo, String autor, String año, String precio, String editorial) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.precio = precio;
        this.editorial = editorial;
    }
     
    
}
