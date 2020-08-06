/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Paty Ramirez
 */
public class cliente {
    int idcliente;
    String nombre;
    String codigo;
    String ciudad;
    String tipo;
    String estado;

    public cliente() {
    }

    public cliente(int idcliente, String nombre, String codigo, String ciudad, String tipo, String estado) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.tipo = tipo;
        this.estado = estado;
    }
    

    
}
