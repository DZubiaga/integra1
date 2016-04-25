
package modelo;

import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;

public class AfterParteBD {
    
    public static void agregarParte(AfterParte ap)
    {
        try {
            
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("Insert into partes (FECHA,KMINICIO,KMFINAL,GASOLINA,PEAJE,DIETAS,OTROS,INCIDENCIA,ESTADO,TRABAJADOR)  values(?,?,?,?,?,?,?,?,?,?)");
            ps.setDate(1, ap.getFecha());
            ps.setInt(2, ap.getKmInicial());
            ps.setInt(3, ap.getKmFinal());
            ps.setInt(4, ap.getGasolina());
            ps.setInt(5, ap.getPeaje());
            ps.setInt(6, ap.getDietas());
            ps.setInt(7, ap.getOtros());
            ps.setString(8, ap.getIncidencia());
            ps.setString(9, ap.getEstado());
            ps.setString(10, ap.getT().getDni());
            
            ps.executeUpdate();
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
