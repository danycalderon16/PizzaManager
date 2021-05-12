/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author danyc
 */
public class Conexion {

    public static Connection connection;
    public static Statement consulta;
    public static boolean valido;

    public static void conectarBaseDatos(String host, String port, String database, String user, String password) {
        String url = "";

        try {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el drivernde PostgreSQL: " + ex.getMessage());
            }

            connection = null;
            url = "jdbc:postgresql://" + host + ":" + port + "/" + database;
            //Conectar base de datos
            connection = DriverManager.getConnection(
                    url,
                    user,
                    password);
            valido = connection.isValid(50000);
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error al conectar con la base de datoa de PostgreSQL (" + url + "):" + sqle.toString());
        }
    }

    public static void insertarUsuario(String nombre, String apellido, String pass, char cargo) {
        String query = "INSERT INTO usuarios (usu_nombre, usu_apellido, usu_pass, usu_rol) \n" +
                        "VALUES ('"+nombre+"','"+apellido+"','"+pass+"','"+cargo+"')";
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                showMessageDialog(null, "Se ha insertado Correctamente el usuario");
            }            
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al <INSERTAR> usuario " + ex);
        }
    }
    
    public static boolean eliminarFila(String consulta){
        Statement sentencia;
        System.out.println(consulta);
        if(valido){
            try{
                sentencia = connection.createStatement();                
                PreparedStatement st = connection.prepareStatement(consulta);
                st.executeUpdate(); 
            }catch(SQLException sql){
                showMessageDialog(null,"Error en la consulta: "+ sql.toString());
                return false;
            }        
        }else{
             showMessageDialog(null, "Se ha perdido la conexion. Verifique con el administrador");
             return false;
        }
        return true;
    }
    
    public static ResultSet getDatos(String consulta){    
        Statement sentencia;
        ResultSet datos = null;
        if(valido){
            try{
                sentencia = connection.createStatement();
                datos = sentencia.executeQuery(consulta);
            }catch(SQLException sql){
                showMessageDialog(null,"Error en la consulta: "+ sql.toString());
            }        
        }else
             showMessageDialog(null, "Se ha perdido la conexion. Verifique con el administrador");
        return datos;
    }
    
}
