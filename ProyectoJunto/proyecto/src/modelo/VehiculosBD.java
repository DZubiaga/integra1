/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import proyecto.Proyecto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.GenericaBD;
/**
 *
 * @author 1gprog08
 */
public class VehiculosBD {
    private static Vehiculo v;
    
    
    public static boolean seleccionarVehiculos()
    {
        Proyecto.setListaVehiculos(new ArrayList());
        try {
          PreparedStatement ps = GenericaBD.getCon().prepareStatement("Select * from vehiculos");
          ResultSet rs = ps.executeQuery();
          while(rs.next())
          {
              v = new Vehiculo(rs.getString("Matricula"));
              Proyecto.setVehiculo(v);
          }
          return true;
          
        } catch (Exception e) 
        {
            
            JOptionPane.showMessageDialog(null, "Error En la fase de Vehiculos");
            return false;
        }
        
    }
    
}
