/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.colegio.controller;

import edu.colegio.model.MatriculaColegio;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author HP
 */
@ManagedBean
@SessionScoped
public class CalcularMatricula implements Serializable{

    private MatriculaColegio mc = new MatriculaColegio();
    
    public CalcularMatricula() {
    }
    
    public void calMatricula(){
        mc.valorTotal();
    }

    public MatriculaColegio getMc() {
        return mc;
    }

    public void setMc(MatriculaColegio mc) {
        this.mc = mc;
    }
    
}
