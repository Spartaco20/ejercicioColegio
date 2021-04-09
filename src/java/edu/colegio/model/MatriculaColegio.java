/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.colegio.model;

/**
 *
 * @author HP
 */
public class MatriculaColegio {
    
    private int numHijos = 0;
    private int mensualidad = 0;
    private int matricula = 0;
    private int asoPadres = 0;
    private double valorTotal = 0;
    private String descuento = "";

    public MatriculaColegio() {
    }

    public MatriculaColegio(int numHijos, int mensualidad, int matricula, int asoPadres, int valorTotal) {
        this.numHijos = numHijos;
        this.mensualidad = mensualidad;
        this.matricula = matricula;
        this.asoPadres = asoPadres;
        this.valorTotal = valorTotal;
    }
    
    public double valorTotal() {
        if(this.numHijos > 0 && this.numHijos <= 1){
            this.valorTotal = this.mensualidad + this.matricula + this.asoPadres;
            this.descuento = "No aplica descuento";
        } else {
            if(this.numHijos == 2) {
                int v1 = this.mensualidad * this.numHijos;
                int v2 = this.matricula * this.numHijos;
                int v3 = this.asoPadres * this.numHijos;
                double v4 = (v1 + v2 + v3) * 0.10;
                this.valorTotal = (v1 + v2 + v3) - v4;
                this.descuento = "Aplica un 10% de descuento";
            } else {
                if(this.numHijos == 3) {
                    int v1 = this.mensualidad * this.numHijos;
                    int v2 = this.matricula * this.numHijos;
                    int v3 = this.asoPadres * this.numHijos;
                    double v4 = (v1 + v2 + v3) * 0.25;
                    this.valorTotal = (v1 + v2 + v3) - v4;
                    this.descuento = "Aplica un 25% de descuento";
                } else {
                    if(this.numHijos >= 4){
                        int v1 = this.mensualidad * this.numHijos;
                        int v2 = this.matricula * this.numHijos;
                        int v3 = this.asoPadres * this.numHijos;
                        double v4 = (v1 + v2 + v3) * 0.30;
                        this.valorTotal = (v1 + v2 + v3) - v4;
                        this.descuento = "Aplica un 30% de descuento";
                    }
                }
            }
        }
        return valorTotal;
    }
    
    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(int mensualidad) {
        this.mensualidad = mensualidad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAsoPadres() {
        return asoPadres;
    }

    public void setAsoPadres(int asoPadres) {
        this.asoPadres = asoPadres;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }
    
}
