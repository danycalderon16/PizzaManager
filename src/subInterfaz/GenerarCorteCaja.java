/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subInterfaz;

import conexion.Conexion;
import static conexion.Conexion.getDatos;
import controladores.ControladorContarDinero;
import forms.FormContarDinero;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelos.ContarDinero;
import util.ActualizarTiempo;
import static util.Utils.*;

/**
 *
 * @author danyc
 */
public class GenerarCorteCaja extends javax.swing.JFrame {

    public static GenerarCorteCaja obj;
    Date date = new Date();
    private Thread changeTime;
    public static DefaultTableModel m = new DefaultTableModel();
    private int filas = 0;

    public static GenerarCorteCaja getObj() {
        if (obj == null) {
            obj = new GenerarCorteCaja();
        }
        return obj;
    }

    public GenerarCorteCaja() {
        initComponents();
        lbUser.setText(USUARIO_LOGEADO);
        changeTime = new Thread(new ActualizarTiempo(lbHora));
        m = (DefaultTableModel) jTable1.getModel();
        changeTime.start();
    }

    private void mostrarDatos() {
        Conexion.eliminarFila("delete from corte", "");
        int rowCount = m.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            m.removeRow(i);
        }
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        ResultSet resultado = getDatos("select * from gastos where gas_fecha = '"+dateFormat.format(date)+"'");
        try {
            while (resultado.next()) {
                String query = "INSERT INTO public.corte (tipo, \"desc\", importe, hora)"
                        + "VALUES ('Gasto','" + resultado.getString(2)
                        + "', " + resultado.getString(3) + ",'" + resultado.getString(4) + "');";
                Conexion.insertar(query,0,0);
            }
            //jTableUsuarios.setFont(new Font("Verdana",Font.PLAIN,18));
            jTable1.setRowHeight(18);
            jTable1.setModel(m);
        } catch (SQLException sqle) {
            showMessageDialog(null, "Error: " + sqle);
        }
        try {
            resultado.close();
        } catch (SQLException ex) {
            Logger.getLogger(GenerarCorteCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        resultado = getDatos("select ven_descripcion, ven_importe, ven_hora from ventas "
                + "where ven_fecha = '"+dateFormat.format(date)+"' and usu_id ="+Conexion.getUsuarioID());
        try {
            while (resultado.next()) {
                String importe = resultado.getString(2).replace("$", "");
                String nuevo_importe[] = importe.split("[.]");

                String query = "INSERT INTO public.corte (tipo, \"desc\", importe, hora)"
                        + "VALUES ('Venta'"
                        + ",'" + resultado.getString(1)
                        + "'," + nuevo_importe[0]
                        + ",'" + resultado.getString(3) + "')";
                Conexion.insertar(query,0,0);
            }
            //jTableUsuarios.setFont(new Font("Verdana",Font.PLAIN,18));
            jTable1.setRowHeight(18);
            jTable1.setModel(m);
        } catch (SQLException sqle) {
            showMessageDialog(null, "Error: " + sqle);
        }
        try {
            resultado.close();
        } catch (SQLException ex) {
            Logger.getLogger(GenerarCorteCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        resultado = getDatos("select * from corte order by hora");
        try {
            while (resultado.next()) {
                String tipo = resultado.getString(1);
                m.addRow(new Object[]{
                    tipo,
                    resultado.getString(2),
                    "$" + resultado.getString(3),
                    resultado.getString(4)
                });
            }
            jTable1.setRowHeight(18);
            jTable1.setModel(m);
        } catch (SQLException sqle) {
            showMessageDialog(null, "Error: " + sqle);
        }
        btnGuardar.setEnabled(true);
        btnImprimir.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbContado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbCalculado = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbDiferencia = new javax.swing.JLabel();
        lbDinero = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Corte de Caja");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Corte de caja");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Descripción", "Importe", "Hora"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 102));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar Corte de Caja");
        btnGuardar.setToolTipText("");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(255, 255, 102));
        btnImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.setEnabled(false);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Usuario: ");

        lbUser.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbUser.setText("Tipo Usuario");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Hora inicio: ");

        lbHora.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbHora.setText("--:--:--");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Dinero en caja: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Inicial");

        lbContado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbContado.setText("$--------");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Calculado");

        lbCalculado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbCalculado.setText("$--------");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Diferencia");

        lbDiferencia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbDiferencia.setText("$--------");

        lbDinero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDinero.setText("$ -------");
        lbDinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDineroMouseClicked(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbContado))
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbCalculado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbDiferencia))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbUser)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbDinero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbDiferencia))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCalculado))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbContado)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Date date = new Date();
        
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        String query = "INSERT INTO public.\"cortesDeCaja\"(\n"
                + "usu_id, cc_inicial, cc_contado, cc_calculado, cc_diferencia, cc_hora, cc_fecha)\n"
                + "VALUES (" + Conexion.getUsuarioID() + ","+apertura+","
                +contado+","+calculado+","+diferencia+",'"+hourFormat.format(date)+"','"+dateFormat.format(date)+"');";
        
        Conexion.insertar(query);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        if (lbDinero.getText().equals("$ -------")) {
            showMessageDialog(null, "Ingrese el dinero en caja");
            return;
        }
        mostrarDatos();
        calcularValores();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void lbDineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDineroMouseClicked
        // TODO add your handling code here:
        ContarDinero modelo = new ContarDinero();
        FormContarDinero vista = new FormContarDinero();
        ControladorContarDinero control = new ControladorContarDinero(vista, modelo);
        control.iniciar();
        vista.setLocation(getLocation().x, getLocation().y);
        vista.setVisible(true);

    }//GEN-LAST:event_lbDineroMouseClicked

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        filas = jTable1.getRowCount();
        ImprimirTicket it = new ImprimirTicket(filas);
        it.setVisible(true);
               
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.dispose();
       
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(GenerarCorteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarCorteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarCorteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarCorteCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarCorteCaja().setVisible(true);
            }
        });
    }
    float apertura = 0;
    float contado = 0;
    float calculado = 0;
    float diferencia = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JLabel lbCalculado;
    public static javax.swing.JLabel lbContado;
    public static javax.swing.JLabel lbDiferencia;
    public static javax.swing.JLabel lbDinero;
    public javax.swing.JLabel lbHora;
    public static javax.swing.JLabel lbUser;
    // End of variables declaration//GEN-END:variables

    private void calcularValores() {
        int suma = 0;
        int j = m.getRowCount();
        for (int i = 0; i < j; i++) {
            int importe = Integer.parseInt(m.getValueAt(i, 2).toString().substring(1));
            String tipo = m.getValueAt(i, 0).toString();
            if (tipo.equals("Gasto")) {
                suma -= importe;
            }
            if (tipo.equals("Venta")) {
                suma += importe;
            }
            System.out.println(suma+"");
        }

        ResultSet rs = getDatos("select \"MONTO\" from apertura");
        try {
            while (rs.next()) {
                apertura = Float.parseFloat(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(GenerarCorteCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        calculado = apertura + suma;
        System.out.println("apertura "+apertura+" Calculado "+calculado);
        contado = Float.parseFloat(lbDinero.getText().substring(1));
        diferencia = contado - calculado;

        lbContado.setText("$" + apertura);
        lbCalculado.setText("$" + calculado);
        lbDiferencia.setText("$" + diferencia);
        if (diferencia > 0) {
            lbDiferencia.setForeground(Color.GREEN);
        }
        if (diferencia < 0) {
            lbDiferencia.setForeground(Color.red);
        }
    }
}
