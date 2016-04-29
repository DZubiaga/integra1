
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.Proyecto;

public class AfterParteBD {
    private static int auto_id;
    private static Trabajador t;
  
    public static void agregarParte(AfterParte ap)
    {
        
        try {
            
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("Insert into partes (FECHA,KMINICIO,KMFINAL,GASOLINA,PEAJE,DIETAS,OTROS,INCIDENCIA,ESTADO,TRABAJADOR)  values(?,?,?,?,?,?,?,?,?,?)",new String[]{"IDPARTE"});
            
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
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            auto_id = rs.getInt(1);
        
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());   
        }
    

    }
    public static ArrayList<AfterParte> seleccionarPartes(Date d)
    {
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("Select * from partes");
            ps.setDate(1, d);
            ResultSet rs = ps.executeQuery();
            Proyecto.setListaPartes(new ArrayList());
            while(rs.next())
            {
                if(rs.getString("estado").equalsIgnoreCase("Abierto"))
                {
                    AfterParte ap = new AfterParte(rs.getInt("IDPARTE"),rs.getDate("FECHA"),rs.getInt("KMINICIO"),rs.getInt("KMFINAL"),rs.getInt("GASOLINA"),
                            rs.getInt("PEAJE"),rs.getInt("DIETAS"),rs.getInt("OTROS"),rs.getString("INCIDENCIA"),rs.getString("ESTADO"),t);
                    Proyecto.getListaPartes().add(ap);
                }
            }   
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Proyecto.getListaPartes();
    }
    public static boolean actualizarParte(AfterParte ap)
    {
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("UPDATE PARTES SET FECHA=?,KMINICIO=?,KMFINAL=?,GASOLINA=?,PEAJE=?,DIETAS=?,OTROS=?,INCIDENCIA=?,ESTADO=?,TRABAJADOR=? WHERE IDPARTE=?");
            ps.setDate(1, ap.getFecha());
            ps.setInt(2, ap.getKmInicial());
            ps.setInt(3, ap.getKmFinal());
            ps.setInt(4, ap.getGasolina());
            ps.setInt(5, ap.getPeaje());
            ps.setInt(6, ap.getDietas());
            ps.setInt(7, ap.getOtros());
            ps.setString(8, ap.getIncidencia());
            ps.setString(9, ap.getEstado());
            ps.setString(10, ap.getT().getDni());//Este hay que mirarlo meter el objeto enter o con el dni ya vale??
            ps.setInt(11, ap.getIdParte());
            ps.executeUpdate();
            
            return true;
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        
    }

   

    public static int getAuto_id() {
        return auto_id;
    }

    public static void setAuto_id(int auto_id) {
        AfterParteBD.auto_id = auto_id;
    }
    
}
