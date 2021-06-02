/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import conexion.Conexion;
import static conexion.Conexion.getDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import util.ActualizarTiempo;
import static util.Utils.*;

/**
 *
 * @author danyc
 */
public class FormAgregarVenta extends javax.swing.JFrame {

    public static DefaultTableModel m = new DefaultTableModel();
    public static FormAgregarVenta obj;
    private Thread changeTime;

    private int cli_id;

    public static FormAgregarVenta getObj() {
        if (obj == null) {
            obj = new FormAgregarVenta();
        }
        return obj;
    }

    public FormAgregarVenta() {
        initComponents();
        TraerDescuentos();
        TraerPromociones();
        m = (DefaultTableModel) jTableProductos.getModel();
        changeTime = new Thread(new ActualizarTiempo(lbHora));
        changeTime.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtcel = new javax.swing.JTextField();
        txtdire = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        cmbDesc = new javax.swing.JComboBox<>();
        cmbProm = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lbHora = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Venta");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Agregar Venta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(0).setResizable(false);
            jTableProductos.getColumnModel().getColumn(1).setResizable(false);
            jTableProductos.getColumnModel().getColumn(2).setResizable(false);
            jTableProductos.getColumnModel().getColumn(2).setPreferredWidth(3);
            jTableProductos.getColumnModel().getColumn(3).setResizable(false);
            jTableProductos.getColumnModel().getColumn(3).setPreferredWidth(3);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 267, 635, 189));

        jButton1.setText("Seleccionar Producto");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 210, -1, 31));

        jLabel6.setText("Datos del Cliente");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 15, -1, 25));

        jButton2.setText("Buscar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 58, 117, 30));

        txtnombre.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txtnombre.setToolTipText("Nombre");
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 58, 234, 30));

        txtcel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txtcel.setToolTipText("Telefono");
        txtcel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcelKeyReleased(evt);
            }
        });
        jPanel2.add(txtcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 58, 145, 30));

        txtdire.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txtdire.setToolTipText("Dirección");
        jPanel2.add(txtdire, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 121, 397, -1));

        jCheckBox1.setText("Guardar");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 84, -1));

        cmbDesc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descuento", "0%", "10%", "30%", "50%", "100%" }));
        cmbDesc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDescItemStateChanged(evt);
            }
        });
        cmbDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescActionPerformed(evt);
            }
        });
        jPanel2.add(cmbDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 183, 31));

        cmbProm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Promociones", "2x1", "Refresco Gratis" }));
        cmbProm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPromActionPerformed(evt);
            }
        });
        jPanel2.add(cmbProm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 192, 31));

        jButton3.setText("Cancelar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 575, 95, 39));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 575, 201, 39));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 25, 534, -1));

        jLabel7.setText("Datos de Venta");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 167, -1, 25));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 177, 544, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pago ($ M.X.)");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 529, 75, 25));

        txtPago.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        txtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoActionPerformed(evt);
            }
        });
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPagoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoKeyTyped(evt);
            }
        });
        jPanel2.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 527, 118, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cambio");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 582, 75, 25));

        txtCambio.setEditable(false);
        txtCambio.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        txtCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCambioActionPerformed(evt);
            }
        });
        jPanel2.add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 580, 118, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Total");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 476, 75, 25));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 474, 118, 30));

        lbHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHora.setText("-- : --");
        jPanel2.add(lbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 670, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*SeleccionProductos  sp = null;
        sp = SeleccionProductos.obj.getObj();
        sp.setLocation(getLocation().x+100,getLocation().y+150);
        sp.setVisible(true);
         */

        SeleccionProductos2 ap = new SeleccionProductos2();
        ap.setLocationRelativeTo(null);
        ap.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.print("select cli_nombre from clientes where cli_celular = " + "'" + txtcel.getText() + "'");
        BuscarCliente();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbPromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPromActionPerformed
        //Aquí va el código
        int desc = 0;
        int totemp = 0;
        int totro = 0;
        if (m.getRowCount() != 0) {
            if (cmbProm.getSelectedIndex() != 0) {
                cmbDesc.disable();
                //showMessageDialog(null,"Se Cambio el elemento seleccionado");

                try {
                    ResultSet rs = getDatos("select prod_cantidad from promociones where prom_promocion = '" + cmbProm.getSelectedItem().toString() + "'"); //La lista de Promociones
                    rs.next();
                    desc = rs.getInt(1);
                    for (int i = 0; i < m.getRowCount(); i++) {
                        if (m.getValueAt(i, 0).toString().matches("Pizza.*")) {
                            totemp += (int) m.getValueAt(i, 3);
                        } else {
                            totro += (int) m.getValueAt(i, 3);
                        }
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(SeleccionProductos2.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

                System.out.println("El total antes del descuento es " + totemp);
                float tot = (totemp * (100 - desc)) / 100;
                tot += totro;
                System.out.println("Ahora es de " + tot);
                txtTotal.setText(tot + "");

            } else {
                cmbDesc.enable();
                txtTotal.setText(total + "");
            }
        }
    }//GEN-LAST:event_cmbPromActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoActionPerformed

    private void txtCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCambioActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (jTableProductos.getRowCount() != 0) {
            switch (JOptionPane.showConfirmDialog(this, "Hay cambios sin guardar \n ¿Desea Cancelar?", "Cancelar Venta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE)) {

                case (0):
                    limpiarCampos();
                    this.dispose();
                    break;

                case (1):
                    break;

                default:
            }
        } else {
            limpiarCampos();
            this.dispose();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyTyped

    }//GEN-LAST:event_txtPagoKeyTyped

    private void txtPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyReleased
        int total, pago;
        total = Integer.parseInt(txtTotal.getText());
        pago = Integer.parseInt(txtPago.getText());
        pago = pago - total;
        txtCambio.setText(pago + "");
        if (evt.getKeyCode() == 10)
            btnConfirmar.doClick();
    }//GEN-LAST:event_txtPagoKeyReleased

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if(cli_id == 0){
            ResultSet rs = getDatos("select cli_id from clientes where cli_nombre = 'Mostrador'");
            try {
                rs.next();
                cli_id = Integer.parseInt(rs.getString(1));
            } catch (SQLException ex) {
                Logger.getLogger(FormAgregarVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }           
        
        int importe = entero(txtTotal.getText());
        String descripcion = traerDescipcion();
        String promocion = "null";
        String descuento = "null";
        String hora = lbHora.getText().toString();
        int cashin = entero(txtPago.getText());
        int cashout = entero(txtCambio.getText());

        if (cashout < 0) {
            showMessageDialog(null, "El pago es menor que el total");
            return;
        }
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        conexion.Conexion.insertarVenta(importe, descripcion, cantidadProductos(),
                promocion, descuento, Conexion.getUsuarioID(),cli_id, cashin, cashout, hora, dateFormat.format(date)
        );
        if(!txtdire.getText().isEmpty())
            insertarPedido();
        limpiarCampos();

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cmbDescItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDescItemStateChanged
        // showMessageDialog(null,"Se Cambio el elemento seleccionado");
    }//GEN-LAST:event_cmbDescItemStateChanged

    private void cmbDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescActionPerformed
        int desc = 0;
        if (m.getRowCount() != 0) {
            //showMessageDialog(null,"Se Cambio el elemento seleccionado");
            if (cmbDesc.getSelectedIndex() != 0) {
                cmbProm.disable();

                try {
                    ResultSet rs = getDatos("select des_cantidad from descuentos where des_descuentos = '" + cmbDesc.getSelectedItem().toString() + "'"); //La lista de descuentos
                    rs.next();
                    desc = rs.getInt(1);
                } catch (SQLException ex) {
                    Logger.getLogger(SeleccionProductos2.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

                //System.out.println("El total antes del descuento es "+total);
                float tot = (total * (100 - desc)) / 100;
                //System.out.println("Ahora es de "+tot);
                txtTotal.setText(tot + "");
            } else {
                cmbProm.enable();
                txtTotal.setText(total + "");
            }
        }
    }//GEN-LAST:event_cmbDescActionPerformed

    private void txtcelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10)
            jButton2.doClick();
    }//GEN-LAST:event_txtcelKeyReleased

    public void BuscarCliente() {
        try {
            ResultSet rs = getDatos("select cli_nombre, cli_id from clientes where cli_celular = " + "'" + txtcel.getText() + "'"); //Buscamos al cliente en la BD
            if (!rs.isBeforeFirst()) {
                showMessageDialog(null, "No exsite un cliene asociado a ese \nnúmero télefonico");
                return;
            }
            rs.next();
            cli_id = Integer.parseInt(rs.getString(2));
            txtnombre.setText(rs.getString(1)); //Recuperamos el nombre
            System.out.print(cli_id+"");
            rs = getDatos("select cli_direccion from clientes where cli_celular = " + "'" + txtcel.getText() + "'"); //Buscamos la dirección
            rs.next();
            txtdire.setText(rs.getString(1)); //Recuperamos la direccion
            System.out.print(rs);
        } catch (SQLException ex) {
            Logger.getLogger(SeleccionProductos2.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void TraerDescuentos() {
        cmbDesc.removeAllItems();
        cmbDesc.addItem("Seleccionar");
        try {
            ResultSet rs = getDatos("select des_descuentos from descuentos"); //La lista de descuentos
            while (rs.next()) {
                cmbDesc.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SeleccionProductos2.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void TraerPromociones() {
        cmbProm.removeAllItems();
        cmbProm.addItem("Seleccionar");
        try {
            ResultSet rs = getDatos("select prom_promocion from promociones"); //La lista de descuentos
            while (rs.next()) {
                cmbProm.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SeleccionProductos2.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void limpiarCampos() {

        int rowCount = m.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            m.removeRow(i);
        }
        txtTotal.setText("");
        this.txtPago.setText("");
        this.txtCambio.setText("");
        this.txtnombre.setText("");
        this.txtcel.setText("");
        this.txtdire.setText("");
    }

    public int cantidadProductos() {

        int cantidad = 0;
        for (int i = 0; i < m.getRowCount(); i++) {

            cantidad = cantidad + Integer.parseInt(m.getValueAt(i, 2) + "");

        }
        return cantidad;
    }

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
            java.util.logging.Logger.getLogger(FormAgregarVenta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgregarVenta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgregarVenta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgregarVenta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAgregarVenta().setVisible(true);
            }
        });
    }

    private String traerDescipcion() {
        String desc = "";
        int filas = m.getRowCount();
        for (int i = 0; i < filas; i++) {
            desc += m.getValueAt(i, 0).toString();
            if (i == (filas - 1)) {
                continue;
            }
            desc += ", ";
        }
        return desc;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cmbDesc;
    private javax.swing.JComboBox<String> cmbProm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTableProductos;
    public static javax.swing.JLabel lbHora;
    public static javax.swing.JTextField txtCambio;
    public static javax.swing.JTextField txtPago;
    public static javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtcel;
    private javax.swing.JTextField txtdire;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
    public static float total;

    private void insertarPedido() {
        ResultSet rs = getDatos("select ven_id from ventas\n"
                + "ORDER BY ven_id DESC LIMIT 1;");
        int id_venta = 0;
        try {
            rs.next();
            id_venta = Integer.parseInt(rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(FormAgregarVenta.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        int rowCount = m.getRowCount();
        String desc = "";
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            desc += m.getValueAt(i, 0).toString() + "\n";
        }

        String query = "INSERT INTO public.pedido(\n"
                + "cli_id, ped_importe, ped_estado, ven_id, usu_id, hora_salida, ped_descripcion)\n"
                + "	VALUES (" + cli_id + ", '" + txtTotal.getText() + "','s'," + id_venta + "," + Conexion.getUsuarioID() + ",'" + lbHora.getText() + "', '" + desc + "');";
        Conexion.insertar(query,0,0);
        limpiarCampos();

    }
}
