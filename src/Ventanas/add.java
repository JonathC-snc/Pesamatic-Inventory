/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Conexion.Conexion;
import java.util.ArrayList;

import Balanza.Balanza;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Julio Laya
 */
public class add extends javax.swing.JFrame {

    public main principal;

    /**
     * Creates new form Ventana
     */
    public add() {
        initComponents();
        setSize(593, 420);
        setTitle("Pesamatic Inventary - Registro de Articulo");
        setResizable(false);
        setLocationRelativeTo(null);
        //jLabel10.setVisible(false);
        //txt_observacion.setVisible(false);

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
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_stock_actual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_almacen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_referencia = new javax.swing.JTextField();
        txt_modelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_unidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_observacion = new javax.swing.JTextField();

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Agregar Producto");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar 32.png"))); // NOI18N
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
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel9.setText("Stock Actual");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 193, -1, -1));

        txt_stock_actual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_stock_actualKeyTyped(evt);
            }
        });
        jPanel2.add(txt_stock_actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 193, 117, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setText("Almacen");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 343, -1, -1));

        txt_almacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_almacenKeyTyped(evt);
            }
        });
        jPanel2.add(txt_almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 343, 117, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Referencia");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 303, -1, -1));
        jPanel2.add(txt_referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 303, 117, -1));
        jPanel2.add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 253, 117, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Modelo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 253, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Descripcion");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 183, -1, -1));
        jPanel2.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 183, 174, 43));
        jPanel2.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 123, 90, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setText("Codigo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 119, 60, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setText("Unidad");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 123, -1, -1));

        txt_unidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_unidadKeyTyped(evt);
            }
        });
        jPanel2.add(txt_unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 123, 117, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel10.setText("Observacion");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 253, -1, -1));
        jPanel2.add(txt_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 120, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
                Connection conectar2 = Conexion.conectar();
                Connection conectar3 = Conexion.conectar();
                PreparedStatement pst2 = conectar2.prepareStatement(
                        "select codigo from balanzas where codigo = '" + codigo + "'");
                PreparedStatement pst3 = conectar3.prepareStatement(
                        "select codigo from baldisponibles where codigo = '" + codigo + "'");
                ResultSet rs2 = pst2.executeQuery();
                ResultSet rs3 = pst3.executeQuery();

                if (rs2.next()) {
                    txt_codigo.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Codigo ya registrado");
                    txt_codigo.setText("");
                    txt_descripcion.setText("");
                    txt_modelo.setText("");
                    txt_referencia.setText("");
                    txt_almacen.setText("");
                    txt_stock_actual.setText("");
                    txt_unidad.setText("");
                    txt_observacion.setText("");
                } else {
                    conectar2.close();
                    conectar3.close();

                    Connection conectar = Conexion.conectar();
                    PreparedStatement pst = conectar.prepareStatement("insert into balanzas values(?,?,?,?,?,?,?,?,?)");
                    
                    PreparedStatement pst4 = conectar.prepareStatement("insert into baldisponibles values(?,?,?,?)");

                    pst.setString(1, "0");
                    pst.setString(2, codigo);
                    pst.setString(3, descripcion);
                    pst.setString(4, modelo);
                    pst.setString(5, referencia);
                    pst.setString(6, almacen);
                    pst.setString(7, stock_actual);
                    pst.setString(8, unidad);
                    pst.setString(9, observacion);
                    pst.executeUpdate();
                    pst4.setString(1, "0");
                    pst4.setString(2, codigo);
                    pst4.setString(3, modelo);
                    pst4.setString(4, stock_actual);
                    pst4.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    this.Save();

                }

            } catch (SQLException e) {
                System.err.println("Error en registrar" + e);
                JOptionPane.showMessageDialog(null, "Error al registrar !!");
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

    private void txt_almacenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_almacenKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') || (txt_almacen.getText().length() > 2)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }
    }//GEN-LAST:event_txt_almacenKeyTyped

    private void txt_stock_actualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stock_actualKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') || (txt_stock_actual.getText().length() > 2)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }
    }//GEN-LAST:event_txt_stock_actualKeyTyped

    private void txt_unidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unidadKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') || (txt_stock_actual.getText().length() > 2)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_unidadKeyTyped

    public void Save() {
        Balanza dato = new Balanza();
        dato.setCodigo(txt_codigo.getText());//esto es agarra el valor que ingresemos por pantalla
        dato.setDescripcion(txt_descripcion.getText());
        dato.setModelo(txt_modelo.getText());
        dato.setReferencia(txt_referencia.getText());
        dato.setalmacen(txt_almacen.getText());
        dato.setstockactual(txt_stock_actual.getText());
        dato.setunidad(txt_unidad.getText());
        dato.setobservacion(txt_observacion.getText());
        
        Balanza dato2 = new Balanza();
        dato.setCodigo(txt_codigo.getText());
        dato.setModelo(txt_modelo.getText());
        dato.setstockactual(txt_stock_actual.getText());
        
        principal.AddToArrayTable(dato);
        principal.AddToArrayTable(dato2);

        this.dispose();
    }

    public void guardar_bd() {

        String codigo, descripcion, modelo, referencia, almacen, stock_actual, unidad, observacion;

        codigo = txt_codigo.getText().trim();
        descripcion = txt_descripcion.getText().trim();
        modelo = txt_modelo.getText().trim();
        referencia = txt_referencia.getText().trim();
        almacen = txt_almacen.getText().trim();
        stock_actual = txt_stock_actual.getText().trim();
        unidad = txt_unidad.getText().trim();
        observacion = txt_observacion.getText().trim();

        try {
            Connection conectar2 = Conexion.conectar();
            PreparedStatement pst2 = conectar2.prepareStatement(
                    "select codigo from balanzas where codigo = '" + codigo + "'");
            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {
                txt_codigo.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Codigo ya registrado");
                txt_codigo.setText("");
                txt_descripcion.setText("");
                txt_modelo.setText("");
                txt_referencia.setText("");
                txt_almacen.setText("");
                txt_stock_actual.setText("");
                txt_unidad.setText("");
                txt_observacion.setText("");
            } else {
                conectar2.close();

                Connection conectar = Conexion.conectar();
                PreparedStatement pst = conectar.prepareStatement("insert into balanzas values(?,?,?,?,?,?,?,?,?)");

                pst.setString(1, "0");
                pst.setString(2, codigo);
                pst.setString(3, descripcion);
                pst.setString(4, modelo);
                pst.setString(5, referencia);
                pst.setString(6, almacen);
                pst.setString(7, stock_actual);
                pst.setString(8, unidad);
                pst.setString(9, observacion);
                pst.executeUpdate();
                //JOptionPane.showMessageDialog(null, "Registro exitoso");
                this.Save();

            }

        } catch (SQLException e) {
            System.err.println("Error en registrar" + e);
            JOptionPane.showMessageDialog(null, "Error al registrar !!");
        }

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
