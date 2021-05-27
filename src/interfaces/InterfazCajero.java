/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controladores.ControladorApertura;
import data.DatosUsuarios;
import forms.FormAgregarVenta;
import forms.CancelarVentana;
import data.DatosInventario;
import forms.FormAgregarGastos;
import forms.FormAgregarUsuario;
import forms.FormAperturaCaja;
import forms.FormEditarPrecios;
import forms.FormAgregarCliente;
import forms.RegistrararEntradaSalida;
import forms.PedidoRepartidor;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.*;
import modelos.ModeloApertura;
import subInterfaz.GenerarCorteCaja;

/**
 *
 * @author danyc
 */
public class InterfazCajero extends javax.swing.JFrame {

    /**
     * Creates new form InterfazGerente
     */
    
    public static boolean abir = false;
    
    public InterfazCajero() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Images/icon.png")));
        imgLogo.setIcon(resizeIcon( new ImageIcon(getClass().getResource("/Images/LOGO.png")), imgLogo.getWidth(), imgLogo.getHeight()));
        iconoSalir.setIcon(resizeIcon( new ImageIcon(getClass().getResource("/Images/logout.png")), iconoSalir.getWidth(), iconoSalir.getHeight()));
        this.setResizable(false);
    }

     private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iconoSalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnApertura = new javax.swing.JLabel();
        btnIngresarVentas = new javax.swing.JLabel();
        btnAgregarVenta = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnRegistrarEntradaSalida = new javax.swing.JLabel();
        btnCancelarVenta = new javax.swing.JLabel();
        btnHacerCorteCaja1 = new javax.swing.JLabel();
        btnPedidos = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cajero");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cajero");

        iconoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        iconoSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 573, Short.MAX_VALUE)
                .addComponent(iconoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(iconoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        btnApertura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnApertura.setForeground(new java.awt.Color(51, 51, 51));
        btnApertura.setText("Apertura de caja");
        btnApertura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApertura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAperturaMouseClicked(evt);
            }
        });

        btnIngresarVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIngresarVentas.setForeground(new java.awt.Color(51, 51, 51));
        btnIngresarVentas.setText("Ingresar Venta");
        btnIngresarVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarVentasMouseClicked(evt);
            }
        });

        btnAgregarVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregarVenta.setForeground(new java.awt.Color(51, 51, 51));
        btnAgregarVenta.setText("Agregar Cliente");
        btnAgregarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarVentaMouseClicked(evt);
            }
        });

        btnRegistrarEntradaSalida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistrarEntradaSalida.setForeground(new java.awt.Color(51, 51, 51));
        btnRegistrarEntradaSalida.setText("Registrar Entrada/Salida");
        btnRegistrarEntradaSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarEntradaSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarEntradaSalidaMouseClicked(evt);
            }
        });

        btnCancelarVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarVenta.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelarVenta.setText("Cancelar Venta");
        btnCancelarVenta.setToolTipText("");
        btnCancelarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarVentaMouseClicked(evt);
            }
        });

        btnHacerCorteCaja1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHacerCorteCaja1.setForeground(new java.awt.Color(51, 51, 51));
        btnHacerCorteCaja1.setText("Hacer corte de caja");
        btnHacerCorteCaja1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHacerCorteCaja1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHacerCorteCaja1MouseClicked(evt);
            }
        });

        btnPedidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPedidos.setForeground(new java.awt.Color(51, 51, 51));
        btnPedidos.setText("Pedidos");
        btnPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPedidosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(btnRegistrarEntradaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnIngresarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHacerCorteCaja1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnIngresarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnHacerCorteCaja1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                .addComponent(btnRegistrarEntradaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, 620));

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGO.png"))); // NOI18N
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 950, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAperturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAperturaMouseClicked
//        FormAperturaCaja fac = null;
//        fac = FormAperturaCaja.obj.getObj();
//        fac.setLocation(getLocation().x+300,getLocation().y+150);
//        fac.setVisible(true);
        ModeloApertura modelo = new ModeloApertura();
        FormAperturaCaja vista = new FormAperturaCaja();
        ControladorApertura control = new ControladorApertura(vista, modelo);
        control.iniciar();
        vista.setLocation(getLocation().x+300,getLocation().y+150);
        vista.setVisible(true);
    }//GEN-LAST:event_btnAperturaMouseClicked

    private void btnIngresarVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarVentasMouseClicked
        // TODO add your handling code here:
        if(!abir){
            showMessageDialog(null, "Aperture la caja primero");
            return;
        }
        FormAgregarVenta  av = null;
        av = FormAgregarVenta.obj.getObj();
        av.setLocation(getLocation().x+300,getLocation().y+150);
        av.setVisible(true);
    }//GEN-LAST:event_btnIngresarVentasMouseClicked

    private void btnAgregarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarVentaMouseClicked
        if(!abir){
            showMessageDialog(null, "Aperture la caja primero");
            return;
        }
        FormAgregarCliente fic = null;
        fic = FormAgregarCliente.obj.getObj();
        fic.setLocation(getLocation().x+300,getLocation().y+150);
        fic.setVisible(true);               
    }//GEN-LAST:event_btnAgregarVentaMouseClicked

    private void btnRegistrarEntradaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaSalidaMouseClicked
        if(!abir){
            showMessageDialog(null, "Aperture la caja primero");
            return;
        }
        RegistrararEntradaSalida ies = null;
        ies = RegistrararEntradaSalida.obj.getObj();
        ies.setLocation(getLocation().x+300,getLocation().y+150);
        ies.setVisible(true);   
    }//GEN-LAST:event_btnRegistrarEntradaSalidaMouseClicked

    private void btnCancelarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarVentaMouseClicked
        // TODO add your handling code here:
        if(!abir){
            showMessageDialog(null, "Aperture la caja primero");
            return;
        }
        CancelarVentana cv = null;
        cv = CancelarVentana.obj.getObj();
        cv.setLocation(getLocation().x+300,getLocation().y+150);
        cv.setVisible(true);   
    }//GEN-LAST:event_btnCancelarVentaMouseClicked

    private void btnHacerCorteCaja1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHacerCorteCaja1MouseClicked
        // TODO add your handling code here:
        if(!abir){
            showMessageDialog(null, "Aperture la caja primero");
            return;
        }
        GenerarCorteCaja gcc = null;
        gcc = GenerarCorteCaja.obj.getObj();
        gcc.setLocation(getLocation().x+300,getLocation().y+150);
        gcc.setVisible(true);
    }//GEN-LAST:event_btnHacerCorteCaja1MouseClicked

    private void btnPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidosMouseClicked
        PedidoRepartidor pr = null;
        pr = PedidoRepartidor.obj.getObj();
        pr.setLocation(getLocation().x+300,getLocation().y+150);
        pr.setVisible(true);
    }//GEN-LAST:event_btnPedidosMouseClicked

    private void iconoSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoSalirMouseClicked
       int i = showConfirmDialog(null, "¿Desea cerrar sesión?",
                "Sesión", OK_CANCEL_OPTION,
                INFORMATION_MESSAGE);
        if(i==0){
            this.dispose();
            Login login = new Login();
            login.setVisible(true);
        }
            
    }//GEN-LAST:event_iconoSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregarVenta;
    private javax.swing.JLabel btnApertura;
    private javax.swing.JLabel btnCancelarVenta;
    private javax.swing.JLabel btnHacerCorteCaja1;
    private javax.swing.JLabel btnIngresarVentas;
    private javax.swing.JLabel btnPedidos;
    private javax.swing.JLabel btnRegistrarEntradaSalida;
    private javax.swing.JLabel iconoSalir;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
