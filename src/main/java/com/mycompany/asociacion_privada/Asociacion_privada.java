/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.asociacion_privada;

import java.util.ArrayList;

/**
 *
 * @authors Yenny Gómez Marco Antonio Salas José Nilo Marcelo Valenzuela
 * Maraboli
 */
public class Asociacion_privada {

    public static ArrayList<personasAsocioacion> Objetos = new ArrayList<>();

    public static void main(String[] args) {
        personasAsocioacion asociadoNew = new personasAsocioacion("Marco Antonio", "Salas Salgado");
        nuevoNif nifNuevo = new nuevoNif(nuevoNif.validaRut("13247302"), "13247302");
        newFecha fechaNew = new newFecha(14, 06, 1977);
        //nuevoSocio socioNew = new nuevoSocio("MASS12689407-20220803",3,8,2022,"Marco Antonio","Salas Salgado");
        //newFecha recordNew = new newFecha(03,08,2022);

        Objetos.add(asociadoNew);
        Objetos.add(nifNuevo);
        Objetos.add(fechaNew);

        nuevoSocio socioNew = new nuevoSocio("SOC" + nifNuevo.getrRut() + "-" + fechaNew.getaYear(), 3, 8, 2022, "Marcelo Alejandro", "Valenzuela Maraboli");
        Objetos.add(socioNew);

        System.out.println("Datos del Asociado");
        //for(personasAsocioacion personasAsocioacion: Objetos){
        String xRut = nifNuevo.getcRut();
        String xCName = asociadoNew.getcNombres() + " " + asociadoNew.getcApellidos();
        String xFNac = fechaNew.getnDay() + "-" + fechaNew.getnMonth() + "-" + fechaNew.getnYear();
        String xSCod = socioNew.getsCode();
        String xFInc = socioNew.getiDay() + "-" + socioNew.getiMonth() + "-" + socioNew.getiYear();

        System.out.println("RUT : " + (xRut));
        System.out.println("Nombre :" + xCName);
        System.out.println("Fecha de Nacimiento : " + xFNac);
        System.out.println("Fecha de Incorporación : " + xFInc);
        System.out.println("Código de Afiliación : " + xSCod);

    }
}
