
package interfaces;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import static conexion.Conexion.*;

/**
 *
 * @author Delph
 */
public class Login extends javax.swing.JFrame {

   

    public Login() {
        initComponents();
        ajustarImagen(lblLogo);
        setLocationRelativeTo(null);
        conectarBaseDatos("localhost", "5432", "pizzamanager", "postgres", "1234");
    }

     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMain = new javax.swing.JPanel();
        PanelHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        PanelBody = new javax.swing.JPanel();
        labelContrasena = new javax.swing.JLabel();
        labelIcono = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        labelUsuario = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        labelIcono1 = new javax.swing.JLabel();
        labelIcono2 = new javax.swing.JLabel();
        labelIcono3 = new javax.swing.JLabel();
        labelIcono4 = new javax.swing.JLabel();
        labelIcono5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelHeader.setBackground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout PanelHeaderLayout = new javax.swing.GroupLayout(PanelHeader);
        PanelHeader.setLayout(PanelHeaderLayout);
        PanelHeaderLayout.setHorizontalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHeaderLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        PanelHeaderLayout.setVerticalGroup(
            PanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMain.add(PanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        PanelBody.setBackground(new java.awt.Color(255, 255, 153));
        PanelBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 6));
        PanelBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelContrasena.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelContrasena.setForeground(new java.awt.Color(255, 51, 51));
        labelContrasena.setText("Contraseña");
        PanelBody.add(labelContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 130, 40));

        labelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon.png"))); // NOI18N
        PanelBody.add(labelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 200, 250));

        txtUsuario.setBackground(new java.awt.Color(51, 0, 0));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 51, 51));
        PanelBody.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 160, 30));

        btnIngresar.setBackground(new java.awt.Color(51, 0, 0));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 51, 51));
        btnIngresar.setText("Ingresar");
        btnIngresar.setFocusable(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        PanelBody.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 160, 50));

        labelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 51, 51));
        labelUsuario.setText("Usuario");
        labelUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                labelUsuarioKeyPressed(evt);
            }
        });
        PanelBody.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 90, 40));

        txtContrasena.setBackground(new java.awt.Color(51, 0, 0));
        txtContrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(255, 51, 51));
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        PanelBody.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 160, 30));

        labelIcono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon.png"))); // NOI18N
        PanelBody.add(labelIcono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, -90, 200, 250));

        labelIcono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon.png"))); // NOI18N
        PanelBody.add(labelIcono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 210, 200, 250));

        labelIcono3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon.png"))); // NOI18N
        PanelBody.add(labelIcono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 200, 250));

        labelIcono4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon.png"))); // NOI18N
        PanelBody.add(labelIcono4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -120, 200, 250));

        labelIcono5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon.png"))); // NOI18N
        PanelBody.add(labelIcono5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -170, 200, 250));

        PanelMain.add(PanelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 650, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        InterfazGerente ig = new InterfazGerente();
        ig.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void labelUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelUsuarioKeyPressed
        
    }//GEN-LAST:event_labelUsuarioKeyPressed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    public void ajustarImagen(JLabel etiqueta){
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Images/LOGO.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(etiqueta.getWidth(),
                etiqueta.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        etiqueta.setIcon(iconoEscalado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBody;
    private javax.swing.JPanel PanelHeader;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel labelContrasena;
    private javax.swing.JLabel labelIcono;
    private javax.swing.JLabel labelIcono1;
    private javax.swing.JLabel labelIcono2;
    private javax.swing.JLabel labelIcono3;
    private javax.swing.JLabel labelIcono4;
    private javax.swing.JLabel labelIcono5;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
