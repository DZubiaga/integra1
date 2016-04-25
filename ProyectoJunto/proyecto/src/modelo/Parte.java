/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 1gprog08
 */
public class Parte {
    
    private int idParte;
    private Date fecha ;
    private int kmInicial;
    private int kmFinal;
    private int peaje;
    private int dieta;
    private int otros;
    private String incidencia;
    private String estado;
    private Trabajador t;

    public Parte() {
    }

    public Parte(Date fecha, int kmInicial, int kmFinal, int peaje, int dieta, int otros, String incidencia, String estado, Trabajador t) {
        this.fecha = fecha;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.peaje = peaje;
        this.dieta = dieta;
        this.otros = otros;
        this.incidencia = incidencia;
        this.estado = estado;
        this.t = t;
    }

    public Parte(int idParte, Date fecha, int kmInicial, int kmFinal, int peaje, int dieta, int otros, String incidencia, String estado, Trabajador t) {
        this.idParte = idParte;
        this.fecha = fecha;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.peaje = peaje;
        this.dieta = dieta;
        this.otros = otros;
        this.incidencia = incidencia;
        this.estado = estado;
        this.t = t;
    }

    public int getIdParte() {
        return idParte;
    }

    public void setIdParte(int idParte) {
        this.idParte = idParte;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public int getPeaje() {
        return peaje;
    }

    public void setPeaje(int peaje) {
        this.peaje = peaje;
    }

    public int getDieta() {
        return dieta;
    }

    public void setDieta(int dieta) {
        this.dieta = dieta;
    }

    public int getOtros() {
        return otros;
    }

    public void setOtros(int otros) {
        this.otros = otros;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Trabajador getT() {
        return t;
    }

    public void setT(Trabajador t) {
        this.t = t;
    }
    
    
    
}
