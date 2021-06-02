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
    public static String usuario;

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

    public static boolean insertar(String queryI) {
        String query = queryI;
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                showMessageDialog(null, "Se ha hecho la inserción correctamente");
                return true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al insertar" + ex);
        }
        return false;
    }  
     public static boolean insertar(String queryI,String mensaje) {
        String query = queryI;
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                showMessageDialog(null,mensaje);
                return true;
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al insertar" + ex);
        }
        return false;
    }  
    public static boolean insertar(String queryI, int i,int j) {
        String query = queryI;
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                //showMessageDialog(null, "Se ha hecho la inserción correctamente");
                return true;
            }
        } catch (SQLException ex) {
            //showMessageDialog(null, "Error al insertar" + ex);
        }
        return false;
    }

      public static void insertarUsuario(String nombre, String apellido, String pass, char cargo) {
        String query = "INSERT INTO usuarios (usu_nombre, usu_apellido, usu_pass, usu_rol) \n"
                + "VALUES ('" + nombre + "','" + apellido + "','" + pass + "','" + cargo + "')";
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

    public static void insertarCliente(String nombre, String apellido, String telefono, String direccion) {
        String query = "INSERT INTO clientes ( cli_nombre, cli_apellido, cli_celular, cli_direccion) \n"
                + "VALUES ('" + nombre + "','" + apellido + "','" + telefono + "','" + direccion + "')";
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                showMessageDialog(null, "Se ha insertado Correctamente el cliente " + nombre);
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al <INSERTAR> cliente " + ex);
        }
    }

    public static void insertarProducto(String nombre, String descripcion, int precio) {
        String query = "INSERT INTO productos (pro_nombre, pro_descripcion, pro_precio) \n"
                + "VALUES ('" + nombre + "','" + descripcion + "'," + precio + ")";
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                showMessageDialog(null, "Se ha insertado Correctamente el producto");
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al <INSERTAR> producto " + ex);
        }
    }

    public static boolean eliminarFila(String consulta) {
        Statement sentencia;
        System.out.println(consulta);
        if (valido) {
            try {
                sentencia = connection.createStatement();
                PreparedStatement st = connection.prepareStatement(consulta);
                st.executeUpdate();
            } catch (SQLException sql) {
                showMessageDialog(null, "Error en la consulta: " + sql.toString());
                return false;
            }
        } else {
            showMessageDialog(null, "Se ha perdido la conexion. Verifique con el administrador");
            return false;
        }
        return true;
    }
    
    public static boolean eliminarFila(String consulta,String msj) {
        Statement sentencia;
        System.out.println(consulta);
        if (valido) {
            try {
                sentencia = connection.createStatement();
                PreparedStatement st = connection.prepareStatement(consulta);
                st.executeUpdate();
            } catch (SQLException sql) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public static ResultSet getDatos(String consulta) {
        Statement sentencia;
        ResultSet datos = null;
        if (valido) {
            try {
                sentencia = connection.createStatement();
                datos = sentencia.executeQuery(consulta);
            } catch (SQLException sql) {
                showMessageDialog(null, "Error en la consulta: " + sql.toString());
            }
        } else {
            showMessageDialog(null, "Se ha perdido la conexion. Verifique con el administrador");
        }
        return datos;
    }

    public static int actualizarRegistro(String consulta) {
        String query = consulta;
        int affectedrows = 0;      
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(query);
            affectedrows = pstmt.executeUpdate();
            if(affectedrows>0)
                showMessageDialog(null,"Se ha actualizado el registro correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            showMessageDialog(null,"Verifique los datos");
        }
        return affectedrows;
    }

    public static void insertarEntradaSalida(int usuId, String fecha, char tipo, String hora) {
        String query = "INSERT INTO entradasalida ( usu_id, es_tipo, es_fecha, es_hora) \n"
                + "VALUES ('" + usuId + "','" + tipo + "','" + fecha + "','"+hora+"')";
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                showMessageDialog(null, "Registro Correcto");
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al registrar " + ex);
        }
    }

    //con todos los campos posibles
    public static void insertarVenta(int ven_importe, String ven_descripcion, 
            int ven_num_produc, String prom_id, String desc_id, int usu_id, 
            int cli_id, int ven_cash_in, int ven_cash_out, String ven_hora, String ven_fecha) {
        String query = "INSERT INTO public.ventas (ven_importe, "
                                                + "ven_descripcion, "
                                                + "ven_num_produc, "
                                                + "prom_id, "
                                                + "desc_id,"
                                                + " usu_id, "
                                                + "cli_id, "
                                                + "ven_cash_in, "
                                                + "ven_cash_out, "
                                                + "ven_hora, ven_fecha) "
                                                + "VALUES ("+ ven_importe + ",'" 
                                                            + ven_descripcion + "'," 
                                                            + ven_num_produc + "," 
                                                            + prom_id + "," 
                                                            + desc_id + "," 
                                                            + usu_id + "," 
                                                            + cli_id + "," 
                                                            + ven_cash_in + "," 
                                                            + ven_cash_out + ", '"  
                                                            + ven_hora +"','"
                                                            + ven_fecha+"' );";
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                showMessageDialog(null, "Se ha insertado Correctamente la venta ");
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al <INSERTAR> cliente " + ex);
        }
    }
    
    
    //fuera de uso. fué usado para pruebas
    public static void insertarVenta(int ven_importe, String ven_descripcion, 
            int ven_num_produc, String usu_id, int ven_cash_in, int ven_cash_out, String ven_hora) {
        String query = "INSERT INTO public.ventas(ven_importe, ven_descripcion, ven_num_produc, usu_id, ven_cash_in, ven_cash_out, ven_hora) \n"
                + "VALUES (" + ven_importe + ",'" + ven_descripcion + "'," 
                + ven_num_produc + "," + usu_id + "," + ven_cash_in + "," 
                + ven_cash_out  + ", '"  
                + ven_hora +"' );"
                + ");";
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                showMessageDialog(null, "Se ha insertado Correctamente la venta ");
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al <INSERTAR> cliente " + ex);
        }
    }
    
    public static String getUsuario(){
        
        return usuario;
    }
    
    public static int getUsuarioID(){
        
        try {
            ResultSet rs= getDatos("select usu_id from usuarios where usu_nombre='"+usuario+"';");
            rs.next();
            return rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    
    public static void setUsuario(String usuario){
        
        Conexion.usuario=usuario;
    }
    
    public static void agregarInventario(String nombre, Double cantidad){

        String query = "INSERT INTO public.inventario(inv_nombre, inv_cantidad)\n" +
        "VALUES ('"+nombre+"',"+cantidad+" );";
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                showMessageDialog(null, "Se ha insertado Correctamente el Inventario");
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al <INSERTAR> Inventario " + ex);
        }

    }
     public static void borrarInventario(String Nombre){

        String query = "DELETE FROM public.inventario WHERE inv_nombre='"+Nombre+"';";
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                showMessageDialog(null, "Se ha eliminado Correctamente el Inventario");
            }
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al <Eliminar> Inventario " + ex);
        }
    }
   
}