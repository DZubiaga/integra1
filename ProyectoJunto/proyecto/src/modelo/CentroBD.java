/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import proyecto.Proyecto;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author 1gprog12
 */
public class CentroBD {
    
    
    public static void solicitarCentro(Integer pId) {
        try {
            Connection con = GenericaBD.getCon();
            PreparedStatement sentencia = con.prepareStatement("SELECT * FROM CENTROS WHERE IDCENTRO = ?");
            sentencia.setInt(1, pId);
            ResultSet rs = sentencia.executeQuery();
            convertir(rs);
        } catch (SQLException ex) {
            System.out.println("Error al solicitar centro" + ex.getMessage());
        }
    }
    
    /*
    public static void solicitarCentros(){
        try {
            CallableStatement cst = GenericaBD.getCon().prepareCall("{call PACKFASE3.VER_CENTROS(?)}");
            cst.registerOutParameter(1, OracleTypes.CURSOR);
            cst.execute();
            ResultSet rs = (ResultSet) cst.getObject(1);
            if(!rs.next()){
                throw new Exception();
            }else{
                convertir(rs);
            } 
        }catch (Exception ex) {
            System.out.println("Error al acceder a los datos de los centros" + ex.getMessage());
        }
    }
    */
    
    public static void convertir(ResultSet rs) {
        try {
            Centro c = new Centro();
            if(rs.next()){
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setTelefono(rs.getString(3));
                c.setCalle(rs.getString(4));
                c.setNumero(Integer.parseInt(rs.getString(5)));
                c.setCp(Integer.parseInt(rs.getString(6)));
                c.setCiudad(rs.getString(7));
                c.setProvincia(rs.getString(8));
                Proyecto.setCentro(c);
            }
        } catch (SQLException ex) {
            System.out.println("error al convertir resultado" + ex.getMessage());
        }
    }
    
    /*
    public static void convertir(ResultSet rs) {
        try {
            ArrayList<Integer> centros = new ArrayList();
            ArrayList<String> nombres = new ArrayList();
            nombres = new ArrayList();
            do{
                centros.add(rs.getInt(1));
                nombres.add(rs.getString(2));
            }while(rs.next());
            Proyecto.guardarCentros(centros);
            Proyecto.guardarNombres(nombres);
        } catch (SQLException ex) {
            System.out.println("error " + ex.getMessage());
        }
    }
    */
    public static void insertar(Centro c) {
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("INSERT INTO CENTROS (NOMBRE, TELEFONO, CALLE, NUMERO, CODPOSTAL, CIUDAD, PROVINCIA) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getTelefono());
            ps.setString(3, c.getCalle());
            ps.setString(4, String.valueOf(c.getNumero()));
            ps.setString(5, String.valueOf(c.getCp()));
            ps.setString(6, c.getCiudad());
            ps.setString(7, c.getProvincia());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar los datos del nuevo centro" + e.getMessage());
        }
    }

    public static void modificar(Centro c) {
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("UPDATE CENTROS SET NOMBRE = ?, TELEFONO = ?, CALLE = ?, NUMERO = ?, CODPOSTAL = ?, CIUDAD = ?, PROVINCIA = ? WHERE IDCENTRO = ?");
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getTelefono());
            ps.setString(3, c.getCalle());
            ps.setString(4, String.valueOf(c.getNumero()));
            ps.setString(5, String.valueOf(c.getCp()));
            ps.setString(6, c.getCiudad());
            ps.setString(7, c.getProvincia());
            ps.setInt(8, c.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al modificar los datos del centro" + ex.getMessage());
        }
    }

    public static void borrar(Centro c) {
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("DELETE FROM CENTROS WHERE IDCENTRO = ?");
            ps.setInt(1, c.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al borrar el centro");
        }
    }
    
}
