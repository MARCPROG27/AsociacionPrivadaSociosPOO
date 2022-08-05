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
public class nuevoSocio extends personasAsocioacion {

    private String sCode;
    private int iDay;
    private int iMonth;
    private int iYear;

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public int getiDay() {
        return iDay;
    }

    public void setiDay(int iDay) {
        this.iDay = iDay;
    }

    public int getiMonth() {
        return iMonth;
    }

    public void setiMonth(int iMonth) {
        this.iMonth = iMonth;
    }

    public int getiYear() {
        return iYear;
    }

    public void setiYear(int iYear) {
        this.iYear = iYear;
    }

    public nuevoSocio() {
        super();
    }

    public nuevoSocio(String sCode, int iDay, int iMonth, int iYear, String cNombres, String cApellidos) {
        super(cNombres, cApellidos);
        this.sCode = sCode;
        this.iDay = iDay;
        this.iMonth = iMonth;
        this.iYear = iYear;
    }

    public nuevoSocio(String sCode, int iDay, int iMonth, int iYear) {
        this.sCode = sCode;
        this.iDay = iDay;
        this.iMonth = iMonth;
        this.iYear = iYear;
    }

}
