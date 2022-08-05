/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asociacion_privada;

/**
 *
 * @authors Yenny Gómez Marco Antonio Salas José Nilo Marcelo Valenzuela
 * Maraboli
 */
public class personasAsocioacion {

    protected String cNombres;
    protected String cApellidos;

    public String getcNombres() {
        return cNombres;
    }

    public void setcNombres(String cNombres) {
        this.cNombres = cNombres;
    }

    public String getcApellidos() {
        return cApellidos;
    }

    public void setcApellidos(String cApellidos) {
        this.cApellidos = cApellidos;
    }

    public personasAsocioacion(String cNombres, String cApellidos) {
        this.cNombres = cNombres;
        this.cApellidos = cApellidos;
    }

    public personasAsocioacion() {
        super();
    }
}
