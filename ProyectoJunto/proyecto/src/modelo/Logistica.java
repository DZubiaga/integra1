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
public class Logistica extends Trabajador{

    public Logistica(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, int piso, String mano, String telMovil, String telPersonal, Date fechaNac, Float salario, int centro) {
        super(dni, nombre, apellido1, apellido2, calle, portal, piso, mano, telMovil, telPersonal, fechaNac, salario, centro);
    }

    public Logistica() {
        super();
    }
    
    
}
