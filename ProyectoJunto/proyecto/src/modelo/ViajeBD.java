package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.Proyecto;
public class ViajeBD {
private static Viaje vi;
    public static boolean agregarAlbaran(Viaje v)
    {
    
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("INSERT INTO VIAJES VALUES (?,?,?,?,?)");
            ps.setInt(1, v.getAlbaran());
            ps.setString(2, v.getHoraSalida());
            ps.setString(3, v.getHoraLlegada());
            ps.setString(4, v.getMatricula());
            ps.setInt(5, v.getParte());
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al Insertar el Viaje");
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        
        
    }
    public static ArrayList<Viaje> agregarViaje(int id)
    {
        
        try {
            
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("Select * from viajes where PARTE = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                vi = new Viaje(rs.getInt("ALBARAN"),rs.getString("HORASALIDA"),rs.getString("HORALLEGADA"),rs.getString("MATRICULA"));
                Proyecto.setListaViajes(vi);
            }
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Error al seleccionar los viajes");
            return null;
        }
        return Proyecto.getListaViajes();
    }
    
    public static boolean actualizarViaje(int Albaran,String kmInicial,String kmFinal,String matricula)
    {
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("UPDATE VIAJES SET HORASALIDA=? , HORALLEGADA=?,MATRICULA=? WHERE ALBARAN=?");
            ps.setString(1, kmInicial);
            ps.setString(2, kmFinal);
            ps.setString(3,matricula);
            ps.setInt(4, Albaran);
            ps.executeUpdate();
            
            
            
            return true;
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    
}
