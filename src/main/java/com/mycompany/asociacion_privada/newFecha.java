/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asociacion_privada;

import java.time.LocalDate;

/**
 *
 * @authors Yenny Gómez Marco Antonio Salas José Nilo Marcelo Valenzuela
 * Maraboli
 */
public class newFecha extends personasAsocioacion {

    private int nDay, nMonth, nYear, aYear = LocalDate.now().getYear();

    public int getaYear() {
        return aYear;
    }

    public void setaYear(int aYear) {
        this.aYear = aYear;
    }

    public int getnDay() {
        return nDay;
    }

    public void setnDay(int nDay) {
        this.nDay = nDay;
    }

    public int getnMonth() {
        return nMonth;
    }

    public void setnMonth(int nMonth) {
        this.nMonth = nMonth;
    }

    public int getnYear() {
        return nYear;
    }

    public void setnYear(int nYear) {
        this.nYear = nYear;
    }

    public newFecha(int nDay, int nMonth, int nYear) {
        //super(cNombres, cApellidos);
        this.nDay = nDay;
        this.nMonth = nMonth;
        this.nYear = nYear;

    }

}
