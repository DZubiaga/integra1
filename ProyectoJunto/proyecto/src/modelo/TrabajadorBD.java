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

public class TrabajadorBD {
    
    private static ArrayList<Trabajador> listado;
    /*
    public static ResultSet getTrabajador(String pDni){
        
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("SELECT * FROM PROGTRAB WHERE DNI = ?");
            
            ps.setString(1, pDni);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (Exception ex) {
            System.out.println("Error al acceder a los datos del trabajador");
            return null;
        }
    }
    */

    public static Trabajador getTrabajador(String pDni){
        
        try {
            CallableStatement cst = GenericaBD.getCon().prepareCall("{call PACKFASE3.VER_TRABAJADOR_DNI(?,?)}");
            cst.setString(1, pDni);
            cst.registerOutParameter(2, OracleTypes.CURSOR);
            cst.execute();
            ResultSet rs = (ResultSet) cst.getObject(2);
            if(!rs.next()){
                return null;
            }else{
                try {
                    if(rs.getString("TIPOTRABAJADOR").equalsIgnoreCase("logistica")){
                        Trabajador t = new Logistica(rs.getString("DNI"), rs.getString("NOMBRE"), rs.getString("APELLIDO1"), rs.getString("APELLIDO2"),
                                rs.getString("CALLE"), rs.getString("PORTAL"), rs.getInt("PISO"), rs.getString("MANO"), rs.getString("TELEFPERSONAL"),
                                rs.getString("TELEFEMPRESA"), rs.getDate("FECHANAC"), rs.getFloat("SALARIO"), rs.getInt("CENTRO"));
                        return t;
                    }else{
                        Trabajador t = new Administracion(rs.getString("DNI"), rs.getString("NOMBRE"), rs.getString("APELLIDO1"), rs.getString("APELLIDO2"),
                                rs.getString("CALLE"), rs.getString("PORTAL"), rs.getInt("PISO"), rs.getString("MANO"), rs.getString("TELEFPERSONAL"),
                                rs.getString("TELEFEMPRESA"), rs.getDate("FECHANAC"), rs.getFloat("SALARIO"), rs.getInt("CENTRO"));
                        return t;
                    }
                } catch (Exception e) {
                    System.out.println("Error al crear el nuevo trabajador");
                    return null;
                }
            } 
        }catch (Exception ex) {
            System.out.println("Error al acceder a los datos del trabajador");
            return null;
        }
    }
    
    public static ArrayList<Trabajador> getTrabajadoresCentro(Integer pId){
        try {
            CallableStatement cst = GenericaBD.getCon().prepareCall("{call PACKFASE3.VER_TRABAJADORES(?,?)}");
            cst.setInt(1, pId);
            cst.registerOutParameter(2, OracleTypes.CURSOR);
            cst.execute();
            ResultSet rs = (ResultSet) cst.getObject(2);
            listado = new ArrayList();
            if(!rs.next()){
                return null;
            }
            do{
                try {
                    if(rs.getString("tipotrabajador").equalsIgnoreCase("logistica")){
                        Trabajador t = new Logistica(rs.getString("DNI"), rs.getString("NOMBRE"), rs.getString("APELLIDO1"), rs.getString("APELLIDO2"),
                                rs.getString("CALLE"), rs.getString("PORTAL"), rs.getInt("PISO"), rs.getString("MANO"), rs.getString("TELEFPERSONAL"),
                                rs.getString("TELEFEMPRESA"), rs.getDate("FECHANAC"), rs.getFloat("SALARIO"), rs.getInt("CENTRO"));
                        listado.add(t);
                    }else{
                        Trabajador t = new Administracion(rs.getString("DNI"), rs.getString("NOMBRE"), rs.getString("APELLIDO1"), rs.getString("APELLIDO2"),
                                rs.getString("CALLE"), rs.getString("PORTAL"), rs.getInt("PISO"), rs.getString("MANO"), rs.getString("TELEFPERSONAL"),
                                rs.getString("TELEFEMPRESA"), rs.getDate("FECHANAC"), rs.getFloat("SALARIO"), rs.getInt("CENTRO"));
                        listado.add(t);
                    }
                } catch (Exception e) {
                    System.out.println("Error al crear el nuevo trabajador");
                    return null;
                }
            }while(rs.next());
            return listado;
        }catch (Exception ex) {
            System.out.println("Error al acceder a los datos del trabajador");
            return null;
        }
    }
    
    public static void insertar(Trabajador t) {
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("INSERT INTO TRABAJADORES VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, t.getDni());
            ps.setString(2, t.getNombre());
            ps.setString(3, t.getApellido1());
            ps.setString(4, t.getApellido2());
            ps.setString(5, t.getCalle());
            ps.setString(6, t.getPortal());
            ps.setInt(7, t.getPiso());
            ps.setString(8, t.getMano());
            ps.setString(9, t.getTelPersonal());
            ps.setString(10, t.getTelEmpresa());
            java.sql.Date fecha = new java.sql.Date(t.getFechaNac().getTime());
            ps.setDate(11, fecha);
            ps.setFloat(12, t.getSalario());
            if(t.getClass() == Proyecto.getClaseLogistica()){
                ps.setString(13, "Logistica");
            }else{
                ps.setString(13, "Administracion");
            }
            ps.setInt(14, 1);
            ps.setString(15, "1");
            ps.executeUpdate();
            GenericaBD.getCon().commit();
        } catch (Exception e) {
            System.out.println("Error al insertar los datos del nuevo trabajador" + e.getMessage());
        }
    }

    public static void modificar(Trabajador t) {
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("UPDATE TRABAJADORES SET NOMBRE = ?, APELLIDO1 = ?, APELLIDO2= ?, CALLE = ?, PORTAL = ?, PISO = ?, MANO = ?, TELEFPERSONAL = ?, TELEFEMPRESA = ?, FECHANAC = ?, SALARIO = ? WHERE DNI = ? ");
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getApellido1());
            ps.setString(3, t.getApellido2());
            ps.setString(4, t.getCalle());
            ps.setString(5, t.getPortal());
            ps.setInt(6, t.getPiso());
            ps.setString(7, t.getMano());
            ps.setString(8, t.getTelPersonal());
            ps.setString(9, t.getTelEmpresa());
            java.sql.Date fecha = new java.sql.Date(t.getFechaNac().getTime());
            ps.setDate(10, fecha);
            ps.setFloat(11, t.getSalario());
            ps.setString(12, t.getDni());
            ps.executeUpdate();
            GenericaBD.getCon().commit();
        } catch (SQLException ex) {
            System.out.println("Error al modificar los datos del trabajador" + ex.getMessage());
        }
    }

    public static void borrar(Trabajador t) {
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("DELETE FROM TRABAJADORES WHERE DNI = ?");
            ps.setString(1, t.getDni());
            ps.executeUpdate();
            GenericaBD.getCon().commit();
        } catch (SQLException ex) {
            System.out.println("Error al borrar el trabajador");
        }
    }
    
    public static boolean login(String pTrabajador,String pPassword)
    {
        try {
            PreparedStatement ps = GenericaBD.getCon().prepareStatement("select PASSWORD from USUARIOS where TRABAJADOR=?");
            ps.setString(1, pTrabajador);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                if(rs.getString("PASSWORD").equalsIgnoreCase(pPassword)){
                    return true;
                }else{
                    return false;
                }
            }else return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
