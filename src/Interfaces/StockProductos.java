/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import dao.component.BDRelacionalProductoDAO;
import dao.to.ProductoTO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Orlando
 */
public class StockProductos extends javax.swing.JFrame {

    /**
     * Creates new form StockProductos
     */
    public StockProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        print2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonVolverLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "MENOR A 10", " ", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, 152, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Costo S/", "Cantidad"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jScrollPane3.setViewportView(jScrollPane4);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, 539, 165));

        print2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print.png"))); // NOI18N
        print2.setText("IMPRIMIR");
        print2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print2ActionPerformed(evt);
            }
        });
        getContentPane().add(print2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STOCK DE PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 39, -1, -1));

        jButtonVolverLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casa.png"))); // NOI18N
        jButtonVolverLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolverLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 375, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Carrito.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 74, -1, 42));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void print2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_print2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here
        if (jComboBox2.getSelectedItem().equals("TODOS")) {
            MostrarTodosProductos();
        } else if (jComboBox2.getSelectedItem().equals("MENOR A 10")) {
            MostrarProductosMenorDiez();
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButtonVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverLoginActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverLoginActionPerformed
    private void MostrarTodosProductos() {
        BDRelacionalProductoDAO dao = new BDRelacionalProductoDAO();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CODIGO");
        model.addColumn("NOMBRE");
        model.addColumn("DESCRIPCION");
        model.addColumn("COSTO S/.");
        model.addColumn("CANTIDAD");

        jTable2.setModel(model);
        List<ProductoTO> listaPro = dao.listarProducto();

        for (int i = 0; i < listaPro.size(); i++) {
            Object[] row = {listaPro.get(i).getCodigo(),
                listaPro.get(i).getNombre(), listaPro.get(i).getDescripción(),
                listaPro.get(i).getCosto(), listaPro.get(i).getCantidad()};
            model.addRow(row);
        }
    }

    private void MostrarProductosMenorDiez() {
        BDRelacionalProductoDAO dao = new BDRelacionalProductoDAO();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CODIGO");
        model.addColumn("NOMBRE");
        model.addColumn("DESCRIPCION");
        model.addColumn("COSTO S/.");
        model.addColumn("CANTIDAD");

        jTable2.setModel(model);
        List<ProductoTO> listaPro=dao.listarProductoMenorDiez();
            for (int i = 0; i < listaPro.size(); i++) {
            Object[] row = {listaPro.get(i).getCodigo(),
                listaPro.get(i).getNombre(), listaPro.get(i).getDescripción(),
                listaPro.get(i).getCosto(), listaPro.get(i).getCantidad()};
            model.addRow(row);
        }    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVolverLogin;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton print2;
    // End of variables declaration//GEN-END:variables

}
