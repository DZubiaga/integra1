/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1gprog12
 */
public class GenericaBD {
    
    private static Connection con;
    
    public static boolean abrirConexion(){
        
        con = null;
        try
        {
            //Class.forName("oracle.jdbc.OracleDriver");
            DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
            con = DriverManager.getConnection("jdbc:oracle:thin:@SrvOracle:1521:orcl","daw05","daw05");
                                                 // driver@machineName:port:SID ,  userid,  password
            return true;
        }
        catch(Exception e){
            System.out.println("Problemas" + e);
            return false;
        }
    }
    
    public static boolean cerrarConexion(){
        try {
            con.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Problemas" + ex);
            return false;
        }
    }
    
    public static Connection getCon(){
        return con;
    }
}
