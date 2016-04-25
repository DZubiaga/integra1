package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import proyecto.Proyecto;
public class ViajeBD {

    public static boolean agregarAlbaran(Viaje v)
    {
        int prueba = 5;
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("INSERT INTO VIAJE VALUES (?,?,?,?,?)");
            ps.setInt(1, v.getAlbaran());
            ps.setString(2, v.getHoraSalida());
            ps.setString(3, v.getHoraLlegada());
            ps.setString(4, v.getMatricula());
            ps.setInt(5, prueba);
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al Insertar el Viaje");
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    
}
