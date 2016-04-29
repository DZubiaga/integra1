/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author 1gprog12
 */
public class Trabajador {
    
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String calle;
    private String portal;
    private int piso;
    private String mano;
    private String telEmpresa;
    private String telPersonal;
    private Date fechaNac;
    private Float salario;
    private int centro;

    public Trabajador() {
    }

    public Trabajador(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, int piso, String mano, String telMovil, String telPersonal, Date fechaNac, Float salario, int centro) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.calle = calle;
        this.portal = portal;
        this.piso = piso;
        this.mano = mano;
        this.telEmpresa = telMovil;
        this.telPersonal = telPersonal;
        this.fechaNac = fechaNac;
        this.salario = salario;
        this.centro = centro;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getMano() {
        return mano;
    }

    public void setMano(String mano) {
        this.mano = mano;
    }

    public String getTelEmpresa() {
        return telEmpresa;
    }

    public void setTelEmpresa(String telMovil) {
        this.telEmpresa = telMovil;
    }

    public String getTelPersonal() {
        return telPersonal;
    }

    public void setTelPersonal(String telPersonal) {
        this.telPersonal = telPersonal;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public int getCentro() {
        return centro;
    }

    public void setCentro(int centro) {
        this.centro = centro;
    }
    
    
}
