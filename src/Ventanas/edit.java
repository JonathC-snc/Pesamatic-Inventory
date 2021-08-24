package Ventanas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

import Balanza.Balanza;
import Conexion.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.WindowConstants;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio Laya
 */
//material es 
//material cambiar es 
//mi mateerial es 
public class edit extends javax.swing.JFrame {

    public main principal;

    public Balanza materialacambiar;
    public int position;
    public boolean wasedited = false;

    /**
     * Creates new form Ventana
     */
    public edit() {
        initComponents();

        setSize(601, 420);
        setTitle("Pesamatic Inventary - Modificacion de Articulo");
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Iconos/icono.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_stock_actual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_almacen = new javax.swing.JTextField();
        txt_referencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_unidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_observacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jLabel7.setText("Cantidad");

        jTextField11.setText("jTextField11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setIconImage(getIconImage());

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_stock_actual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stock_actualKeyTyped(evt);
            }
        });
        jPanel2.add(txt_stock_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 96, 117, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setText("Almacen");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 326, -1, -1));

        txt_almacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_almacenKeyTyped(evt);
            }
        });
        jPanel2.add(txt_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 326, 117, -1));
        jPanel2.add(txt_referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 276, 117, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Referencia");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 276, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Modelo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 206, -1, -1));
        jPanel2.add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 206, 117, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setText("Descripcion");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 126, -1, -1));

        txt_descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionActionPerformed(evt);
            }
        });
        jPanel2.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 122, 180, 50));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Codigo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 76, -1, -1));

        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 76, 117, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setText("Unidad");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 166, -1, -1));
        jPanel2.add(txt_unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 166, 117, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setText("Stock Actual");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 86, 80, 30));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Modicacion de Producto");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar 32.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 600, -1));
        jPanel2.add(txt_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 120, 100));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel10.setText("Observacion");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int validacion = 0;
        String codigo, descripcion, modelo, referencia, almacen, stock_actual, unidad, observacion;

        codigo = txt_codigo.getText().trim();
        descripcion = txt_descripcion.getText().trim();
        modelo = txt_modelo.getText().trim();
        referencia = txt_referencia.getText().trim();
        almacen = txt_almacen.getText().trim();
        stock_actual = txt_stock_actual.getText().trim();
        unidad = txt_unidad.getText().trim();
        observacion = txt_observacion.getText().trim();

        if (codigo.equals("")) {
            txt_codigo.setBackground(Color.red);
            validacion++;
        }
        if (descripcion.equals("")) {
            txt_descripcion.setBackground(Color.red);
            validacion++;
        }
        if (modelo.equals("")) {
            txt_modelo.setBackground(Color.red);
            validacion++;
        }
        if (referencia.equals("")) {
            txt_referencia.setBackground(Color.red);
            validacion++;
        }
        if (almacen.equals("")) {
            txt_almacen.setBackground(Color.red);
            validacion++;
        }
        if (stock_actual.equals("")) {
            txt_stock_actual.setBackground(Color.red);
            validacion++;
        }
        if (unidad.equals("")) {
            txt_unidad.setBackground(Color.red);
            validacion++;
        }
        if (observacion.equals("")) {
            txt_observacion.setBackground(Color.red);
            validacion++;
        }

        if (validacion == 0) {

            try {
                String ID = txt_codigo.getText().toString().trim();

                Connection conectar = Conexion.conectar();
                PreparedStatement pst = conectar.prepareStatement(
                        "update balanzas set codigo = ?, descripcion = ?, modelo = ?, referencia = ?, almacen = ?, stock_actual = ?, unidad = ?, observacion = ? where codigo = '" + ID + "'");
                pst.setString(1, txt_codigo.getText().trim());
                pst.setString(2, txt_descripcion.getText().trim());
                pst.setString(3, txt_modelo.getText().trim());
                pst.setString(4, txt_referencia.getText().trim());
                pst.setString(5, txt_almacen.getText().trim());
                pst.setString(6, txt_stock_actual.getText().trim());
                pst.setString(7, txt_unidad.getText().trim());
                pst.setString(8, txt_observacion.getText().trim());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
                this.save();

            } catch (SQLException e) {
                System.out.println("Error, no se pudo modificar " + e);
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe de llenar Todos los campos");
            txt_codigo.setBackground(Color.white);
            txt_descripcion.setBackground(Color.white);
            txt_modelo.setBackground(Color.white);
            txt_referencia.setBackground(Color.white);
            txt_almacen.setBackground(Color.white);
            txt_stock_actual.setBackground(Color.white);
            txt_unidad.setBackground(Color.white);
            txt_observacion.setBackground(Color.white);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionActionPerformed

    private void txt_stock_actualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_actualKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') || (txt_stock_actual.getText().length() > 2)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }
    }//GEN-LAST:event_txt_stock_actualKeyTyped

    private void txt_almacenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_almacenKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') || (txt_almacen.getText().length() > 2)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }
    }//GEN-LAST:event_txt_almacenKeyTyped

    ////// FUNCIONES
    public void load(Balanza mimaterial) {

        this.materialacambiar = mimaterial;
        this.txt_codigo.setText(this.materialacambiar.getCodigo());
        this.txt_descripcion.setText(this.materialacambiar.getDescripcion());
        this.txt_modelo.setText(this.materialacambiar.getModelo());
        this.txt_referencia.setText(this.materialacambiar.getReferencia());
        this.txt_almacen.setText(this.materialacambiar.getalmacen());
        this.txt_stock_actual.setText(this.materialacambiar.getstockactual());
        this.txt_unidad.setText(this.materialacambiar.getunidad());
        this.txt_observacion.setText(this.materialacambiar.getobservacion());

    }

    public void save() {
        this.wasedited = true;
        materialacambiar.setCodigo(txt_codigo.getText());//esto es agarra el valor que ingresemos por pantalla
        materialacambiar.setDescripcion(txt_descripcion.getText());//esto es valor que ongrese por pantalla
        materialacambiar.setReferencia(txt_modelo.getText());
        materialacambiar.setModelo(txt_modelo.getText());
        materialacambiar.setalmacen(txt_almacen.getText());
        materialacambiar.setstockactual(txt_stock_actual.getText());
        materialacambiar.setunidad(txt_unidad.getText());
        materialacambiar.setobservacion(txt_observacion.getText());

        principal.EditList(materialacambiar, position);
        this.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField txt_almacen;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_observacion;
    private javax.swing.JTextField txt_referencia;
    private javax.swing.JTextField txt_stock_actual;
    private javax.swing.JTextField txt_unidad;
    // End of variables declaration//GEN-END:variables
}
