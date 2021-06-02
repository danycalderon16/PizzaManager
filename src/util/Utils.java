/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static conexion.Conexion.*;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author danyc
 */
public class Utils {
    public static final char CAJERO = 'c';
    public static final char COCINERO = 'o';
    public static final char REPARTIDOR = 'r';
    public static final char GERENTE = 'g';
    public static final char SUPER   = 's';
    public static String USUARIO_LOGEADO = "";
    public static void mostrarDatos(DefaultTableModel m, JTable tabla, Object[] identificadores, Object[] fila){
        m = (DefaultTableModel) tabla.getModel();
        m.setColumnIdentifiers(identificadores);
        ResultSet resultado = getDatos("SELECT * FROM USUARIOS");
        try{
            while(resultado.next())
                m.addRow(fila);
            tabla.setFont(new Font("Verdana",Font.BOLD,22));
            tabla.setRowHeight(26);
            tabla.setModel(m);
        }catch(SQLException sqle){
            showMessageDialog(null, "Error: "+sqle);
        }
    }
    
    public static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }
    
    public static boolean solicitarPass(){
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Ingrese la contraseña:");
        JPasswordField pass = new JPasswordField(14);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"OK", "Cancelar"};
        int option = JOptionPane.showOptionDialog(null, panel, "Administrador",
                                 JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                                 null, options, options[1]);
        if(option == 0) // pressing OK button
        {
            try {
                char[] password = pass.getPassword();
                //String pass = new String(password);
                ResultSet rs = getDatos("select * from usuarios where usu_pass ='" + new String(password) + "'");
                if (!rs.isBeforeFirst()) {
                    return false;
                }
                System.out.println("Your password is: " + new String(password));
            } catch (SQLException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }
    
    public static float entero(String numero){
        return Float.parseFloat(numero);
    }
}
