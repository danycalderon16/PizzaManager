/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import forms.IngresarEntradaSalida;
import forms.PedidosEntrega;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author luiss
 */
public class InterfazRepartidor extends javax.swing.JFrame {

    /**
     * Creates new form InterfazRepartidor
     */
    public InterfazRepartidor() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Images/icon.png")));
        imgLogo.setIcon(resizeIcon( new ImageIcon(getClass().getResource("/Images/LOGO.png")), imgLogo.getWidth(), imgLogo.getHeight()));
        iconoSalir.setIcon(resizeIcon( new ImageIcon(getClass().getResource("/Images/logout.png")), iconoSalir.getWidth(), iconoSalir.getHeight()));
    }
    
    private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iconoSalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAsignarPedido = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnRegistrarEntradaSalida = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 583, Short.MAX_VALUE)
                .addComponent(iconoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        btnAsignarPedido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAsignarPedido.setForeground(new java.awt.Color(51, 51, 51));
        btnAsignarPedido.setText("Asignar pedido para entregar");
        btnAsignarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAsignarPedidoMouseClicked(evt);
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
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAsignarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAsignarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(btnRegistrarEntradaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 620));

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGO.png"))); // NOI18N
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 950, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAsignarPedidoMouseClicked
       
        PedidosEntrega  PE = null;
        PE = PedidosEntrega.obj.getObj();
        PE.setLocation(getLocation().x+300,getLocation().y+150);
        PE.setVisible(true);
    }//GEN-LAST:event_btnAsignarPedidoMouseClicked

    private void btnRegistrarEntradaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaSalidaMouseClicked
        IngresarEntradaSalida ies = null;
        ies = IngresarEntradaSalida.obj.getObj();
        ies.setLocation(getLocation().x+300,getLocation().y+150);
        ies.setVisible(true);
    }//GEN-LAST:event_btnRegistrarEntradaSalidaMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRepartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRepartidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAsignarPedido;
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
