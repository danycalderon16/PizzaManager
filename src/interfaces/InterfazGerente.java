/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import data.DatosUsuarios;
import forms.AgregarVenta;
import forms.CancelarVentana;
import forms.ConsuInventario;
import forms.FormAgregarGastos;
import forms.FormAgregarUsuario;
import forms.FormDescuentos;
import forms.FormEditarPrecios;
import forms.FormHistoricoVentas;
import forms.FormIngresarCliente;
import forms.FormInventario;
import forms.FormPromociones;
import forms.IngresarEntradaSalida;
import forms.PedidoRepartidor;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import menus.MenuDescYProm;
import menus.MenuUsuarios;
import subInterfaz.GenerarCorteCaja;

/**
 *
 * @author danyc
 */
public class InterfazGerente extends javax.swing.JFrame {

    /**
     * Creates new form InterfazGerente
     */
    public InterfazGerente() {
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        iconoSalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGastos = new javax.swing.JLabel();
        btnAdministraProductos = new javax.swing.JLabel();
        btnAdministrarrUsuario = new javax.swing.JLabel();
        btnDescuentosPromociones = new javax.swing.JLabel();
        btnHacerCorteCaja = new javax.swing.JLabel();
        btnIngresarVentas = new javax.swing.JLabel();
        btnInventario = new javax.swing.JLabel();
        btnAgregarVenta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnRegistrarEntradaSalida = new javax.swing.JLabel();
        btnHV = new javax.swing.JLabel();
        btnIngresarVentas1 = new javax.swing.JLabel();
        btnPedidos = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gerente");

        iconoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        iconoSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 580, Short.MAX_VALUE)
                .addComponent(iconoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        btnGastos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGastos.setForeground(new java.awt.Color(51, 51, 51));
        btnGastos.setText("Registrar Gastos");
        btnGastos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGastosMouseClicked(evt);
            }
        });

        btnAdministraProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdministraProductos.setForeground(new java.awt.Color(51, 51, 51));
        btnAdministraProductos.setText("Administrar Productos");
        btnAdministraProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministraProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministraProductosMouseClicked(evt);
            }
        });

        btnAdministrarrUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdministrarrUsuario.setForeground(new java.awt.Color(51, 51, 51));
        btnAdministrarrUsuario.setText("Administrar Usuario");
        btnAdministrarrUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministrarrUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministrarrUsuarioMouseClicked(evt);
            }
        });

        btnDescuentosPromociones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDescuentosPromociones.setForeground(new java.awt.Color(51, 51, 51));
        btnDescuentosPromociones.setText("Descuentos Y Promociones");
        btnDescuentosPromociones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescuentosPromociones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDescuentosPromocionesMouseClicked(evt);
            }
        });

        btnHacerCorteCaja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHacerCorteCaja.setForeground(new java.awt.Color(51, 51, 51));
        btnHacerCorteCaja.setText("Hacer corte de caja");
        btnHacerCorteCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHacerCorteCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHacerCorteCajaMouseClicked(evt);
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

        btnInventario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(51, 51, 51));
        btnInventario.setText("Ver Inventario");
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
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

        btnHV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHV.setForeground(new java.awt.Color(51, 51, 51));
        btnHV.setText("Ver Historico de Ventas");
        btnHV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHVMouseClicked(evt);
            }
        });

        btnIngresarVentas1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIngresarVentas1.setForeground(new java.awt.Color(51, 51, 51));
        btnIngresarVentas1.setText("Cancelar Venta");
        btnIngresarVentas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarVentas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarVentas1MouseClicked(evt);
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 20, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDescuentosPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdministrarrUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdministraProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIngresarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIngresarVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrarEntradaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHacerCorteCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHV, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnAdministrarrUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnIngresarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnIngresarVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHacerCorteCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdministraProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDescuentosPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnRegistrarEntradaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 620));

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGO.png"))); // NOI18N
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 950, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministrarrUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrarrUsuarioMouseClicked
        // TODO add your handling code here:
        MenuUsuarios fau = null;
        fau = MenuUsuarios.getObj();
        fau.setLocation(getLocation().x+300,getLocation().y+150);
        fau.setVisible(true);
    }//GEN-LAST:event_btnAdministrarrUsuarioMouseClicked

    private void btnGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGastosMouseClicked
       // TODO add your handling code here:
        FormAgregarGastos fag = null;
        fag = FormAgregarGastos.getObj();
        fag.setLocation(getLocation().x+300,getLocation().y+150);
        fag.setVisible(true);
    }//GEN-LAST:event_btnGastosMouseClicked

    private void btnAdministraProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministraProductosMouseClicked
        FormEditarPrecios fep = null;
        fep = FormEditarPrecios.getObj();
        fep.setLocation(getLocation().x+300,getLocation().y+150);
        fep.setVisible(true);
    }//GEN-LAST:event_btnAdministraProductosMouseClicked

    private void btnHacerCorteCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHacerCorteCajaMouseClicked
        GenerarCorteCaja gcc = null;
        gcc = GenerarCorteCaja.obj.getObj();
        gcc.setLocation(getLocation().x+300,getLocation().y+150);
        gcc.setVisible(true);
    }//GEN-LAST:event_btnHacerCorteCajaMouseClicked

    private void btnIngresarVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarVentasMouseClicked
        // TODO add your handling code here:
        AgregarVenta  av = null;
        av = AgregarVenta.obj.getObj();
        av.setLocation(getLocation().x+300,getLocation().y+150);
        av.setVisible(true);
    }//GEN-LAST:event_btnIngresarVentasMouseClicked

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        // TODO add your handling code here:
        FormInventario ci = null;
        ci = FormInventario.obj.getObj();
        ci.setLocation(getLocation().x+300,getLocation().y+150);
        ci.setVisible(true);   
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnAgregarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarVentaMouseClicked
        FormIngresarCliente fic = null;
        fic = FormIngresarCliente.obj.getObj();
        fic.setLocation(getLocation().x+300,getLocation().y+150);
        fic.setVisible(true);               
    }//GEN-LAST:event_btnAgregarVentaMouseClicked

    private void btnRegistrarEntradaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaSalidaMouseClicked
        IngresarEntradaSalida ies = null;
        ies = IngresarEntradaSalida.obj.getObj();
        ies.setLocation(getLocation().x+300,getLocation().y+150);
        ies.setVisible(true);   
    }//GEN-LAST:event_btnRegistrarEntradaSalidaMouseClicked

    private void btnDescuentosPromocionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescuentosPromocionesMouseClicked
        MenuDescYProm mdp = null;
        mdp = MenuDescYProm.getObj();
        mdp.setLocation(getLocation().x+300,getLocation().y+150);
        mdp.setVisible(true);
    }//GEN-LAST:event_btnDescuentosPromocionesMouseClicked

    private void btnHVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHVMouseClicked
        FormHistoricoVentas fp = null;
        fp = FormHistoricoVentas.obj.getObj();
        fp.setLocation(getLocation().x+300,getLocation().y+150);
        fp.setVisible(true); 
    }//GEN-LAST:event_btnHVMouseClicked

    private void btnIngresarVentas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarVentas1MouseClicked
        // TODO add your handling code here:
        CancelarVentana fp = null;
        fp = CancelarVentana.obj.getObj();
        fp.setLocation(getLocation().x+300,getLocation().y+150);
        fp.setVisible(true); 
    }//GEN-LAST:event_btnIngresarVentas1MouseClicked

    private void btnPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidosMouseClicked
        PedidoRepartidor pr = null;
        pr = PedidoRepartidor.obj.getObj();
        pr.setLocation(getLocation().x+300,getLocation().y+150);
        pr.setVisible(true);
    }//GEN-LAST:event_btnPedidosMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdministraProductos;
    private javax.swing.JLabel btnAdministrarrUsuario;
    private javax.swing.JLabel btnAgregarVenta;
    private javax.swing.JLabel btnDescuentosPromociones;
    private javax.swing.JLabel btnGastos;
    private javax.swing.JLabel btnHV;
    private javax.swing.JLabel btnHacerCorteCaja;
    private javax.swing.JLabel btnIngresarVentas;
    private javax.swing.JLabel btnIngresarVentas1;
    private javax.swing.JLabel btnInventario;
    private javax.swing.JLabel btnPedidos;
    private javax.swing.JLabel btnRegistrarEntradaSalida;
    private javax.swing.JLabel iconoSalir;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
