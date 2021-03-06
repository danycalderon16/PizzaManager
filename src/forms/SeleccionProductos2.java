/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import static conexion.Conexion.getDatos;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Delph
 */
public class SeleccionProductos2 extends javax.swing.JFrame {

    public static Connection connection;
    public static DefaultTableModel m= new DefaultTableModel();

    /**
     * Creates new form FormAgregarProducto2
     */
    public SeleccionProductos2() {
        
        initComponents();
        llenarPizzas();
        llenarBebidas();
        m=(DefaultTableModel) tblPedido.getModel();
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
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelPizza = new javax.swing.JPanel();
        panelbebida = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );

        panelPizza.setLayout(new java.awt.GridLayout(9, 9, 20, 20));
        jTabbedPane1.addTab("Pizzas", panelPizza);

        panelbebida.setLayout(new java.awt.GridLayout(9, 9, 20, 20));
        jTabbedPane1.addTab("Bebidas", panelbebida);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPedido);
        if (tblPedido.getColumnModel().getColumnCount() > 0) {
            tblPedido.getColumnModel().getColumn(0).setResizable(false);
            tblPedido.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tblPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPedidoMouseClicked
        System.out.println("");
        int i=tblPedido.getSelectedRow();
        int j=Integer.parseInt(m.getValueAt(i, 1)+"");
        if(j==1){
            m.removeRow(i);
        }else m.setValueAt(j-1, i, 1); 
    }//GEN-LAST:event_tblPedidoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int precio,cantidad,total=0;
      int rowCount = FormAgregarVenta.m.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            FormAgregarVenta.m.removeRow(i);
        }
    for (int i = 0; i < m.getRowCount(); i++) {
        
        FormAgregarVenta.m.addRow(new Object[]{m.getValueAt(i,0),//nombre
                                               precio=getPrecio(m.getValueAt(i,0)+""),//precio
                                               cantidad=Integer.parseInt(m.getValueAt(i,1)+""),//cantidad
                                               precio*cantidad});//subTotal
      
        total=total+(precio*cantidad);
    }
    
    FormAgregarVenta.txtTotal.setText(total+"");
    FormAgregarVenta.total = total;
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionProductos2().setVisible(true);
            }
        });
    }

    public void llenarPizzas() {

        try {

            ResultSet rs = getDatos("select count(pro_nombre) from productos where cat_id='p'"); //el numero de pizzas que hay

            rs.next();          
            JButton btnMenuPizzas[] = new JButton[rs.getInt(1)]; //arreglo de borones para c/u de las pizzas
            rs = getDatos("select pro_nombre from productos where cat_id='p'"); //la lista de pizzas
            int i = 0;
            while (rs.next()) {
                btnMenuPizzas[i] = new JButton(rs.getString(1));
                asignarFuncionalidad(btnMenuPizzas[i]);
                panelPizza.add(btnMenuPizzas[i]);

                i++;
            }
            
    
            
            /*ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Images/LOGO.png"));
            Image imgEscalada = imgIcon.getImage().getScaledInstance(btnMenuPizzas[0].getWidth(),
                    btnMenuPizzas[0].getHeight(), Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            
            for (int j = 0; j < btnMenuPizzas.length; j++) {
                btnMenuPizzas[j].setIcon(iconoEscalado);
            }*/
            }catch (SQLException ex) {
            Logger.getLogger(SeleccionProductos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    public void llenarBebidas() {

        try {

            ResultSet rs = getDatos("select count(pro_nombre) from productos where cat_id='b'"); //el numero de pizzas que hay

            rs.next();
            
         
            JButton btnMenubebidas[] = new JButton[rs.getInt(1)]; //arreglo de borones para c/u de las pizzas

            rs = getDatos("select pro_nombre from productos where cat_id='b'"); //la lista de pizzas
            int i = 0;
            while (rs.next()) {

                btnMenubebidas[i] = new JButton(rs.getString(1));
                asignarFuncionalidad(btnMenubebidas[i]);
                panelbebida.add(btnMenubebidas[i]);

                i++;
            }
            
    
            
            /*ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Images/LOGO.png"));
            Image imgEscalada = imgIcon.getImage().getScaledInstance(btnMenuPizzas[0].getWidth(),
                    btnMenuPizzas[0].getHeight(), Image.SCALE_SMOOTH);
            Icon iconoEscalado = new ImageIcon(imgEscalada);
            
            for (int j = 0; j < btnMenuPizzas.length; j++) {
                btnMenuPizzas[j].setIcon(iconoEscalado);
            }*/
            }catch (SQLException ex) {
            Logger.getLogger(SeleccionProductos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    public void asignarFuncionalidad(JButton btn) {
        
        
        
        btn.addActionListener((ActionEvent arg0) -> {
            
            for (int i = 0; i < m.getRowCount(); i++) {
                
               if(m.getValueAt(i, 0).toString().equalsIgnoreCase(btn.getText())){
                   m.setValueAt(Integer.parseInt(m.getValueAt(i, 1)+"")+1, i, 1);
                   return;
               }
            }
            m.addRow(new Object[]{btn.getText(),1});
        });
    }
    
    public int getPrecio(String nombreProducto){
        
        try {
            ResultSet precio= getDatos("Select pro_precio from productos where pro_nombre='"+nombreProducto+"';");
            
            precio.next();
            
            return Integer.parseInt(precio.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(SeleccionProductos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;
    }
    

    /*
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
     JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            String s=source.getModel().getValueAt(row, column)+"";

            JOptionPane.showMessageDialog(null, s);


} 
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelPizza;
    private javax.swing.JPanel panelbebida;
    private javax.swing.JTable tblPedido;
    // End of variables declaration//GEN-END:variables
}
