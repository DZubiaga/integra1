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
            Class.forName("oracle.jdbc.OracleDriver");
            
            String login="system";
            String password="oracle";
            
            String url = "jdbc:oracle:thin:@10.10.10.9:1521:db12102";
            con = DriverManager.getConnection(url,login,password);
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
