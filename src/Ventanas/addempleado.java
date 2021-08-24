/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Conexion.Conexion;
import java.util.ArrayList;
import Ventanas.vistacliente;
import Cliente.Cliente;
import Empleado.Empleado;
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
public class addempleado extends javax.swing.JFrame {

    public main cliente;

    /**
     * Creates new form Ventana
     */
    public addempleado() {
        initComponents();
        setSize(593, 420);
        setTitle("Pesamatic Inventary - Registro de Empleado");
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
        jLabel5 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_cargo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_edad = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelclienteimagen = new javax.swing.JLabel();

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
        jLabel6.setText("Agregar Empleado");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 343, -1, -1));

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 117, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Direccion");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        jPanel2.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 190, 50));

        txt_cargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cargoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 117, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Cargo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Edad");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txt_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadKeyTyped(evt);
            }
        });
        jPanel2.add(txt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 40, 30));

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 150, 30));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 110, 30));

        jLabelclienteimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/empleado.png"))); // NOI18N
        jPanel2.add(jLabelclienteimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

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
        String nombre, edad, cargo, direccion, telefono;

        nombre = txt_nombre.getText().trim();
        edad = txt_edad.getText().trim();
        cargo = txt_cargo.getText().trim();
        direccion = txt_direccion.getText().trim();
        telefono = txt_telefono.getText().trim();

        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (edad.equals("")) {
            txt_edad.setBackground(Color.red);
            validacion++;
        }
        if (cargo.equals("")) {
            txt_cargo.setBackground(Color.red);
            validacion++;
        }
        if (direccion.equals("")) {
            txt_direccion.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);
            validacion++;
        }

        if (validacion == 0) {

            try {
                Connection conectar2 = Conexion.conectar();
                Connection conectar3 = Conexion.conectar();
                PreparedStatement pst2 = conectar2.prepareStatement(
                        "select nombre from empleados where nombre = '" + nombre + "'");

                ResultSet rs2 = pst2.executeQuery();


                if (rs2.next()) {
                    txt_nombre.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre del empleado ya registrado");
                    txt_nombre.setText("");
                    txt_edad.setText("");
                    txt_cargo.setText("");
                    txt_direccion.setText("");
                    txt_telefono.setText("");
                } else {
                    conectar2.close();
                    conectar3.close();

                    Connection conectar = Conexion.conectar();
                    PreparedStatement pst = conectar.prepareStatement("insert into empleados values(?,?,?,?,?,?)");

                    pst.setString(1, "0");
                    pst.setString(2, nombre);
                    pst.setString(3, edad);
                    pst.setString(4, cargo);
                    pst.setString(5, direccion);
                    pst.setString(6, telefono);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    this.Save();
                    dispose();

                }

            } catch (SQLException e) {
                System.err.println("Error en registrar" + e);
                JOptionPane.showMessageDialog(null, "Error al registrar !!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe de llenar Todos los campos");
            txt_nombre.setBackground(Color.white);
            txt_edad.setBackground(Color.white);
            txt_cargo.setBackground(Color.white);
            txt_direccion.setBackground(Color.white);
            txt_telefono.setBackground(Color.white);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') || (txt_telefono.getText().length() > 10)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') || (txt_edad.getText().length() > 1)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_edadKeyTyped

    private void txt_cargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cargoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') || (txt_cargo.getText().length() > 10)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_cargoKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') || (txt_nombre.getText().length() > 10)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreKeyTyped

    public void Save() {
        Empleado dato = new Empleado();
        dato.setNombre(txt_nombre.getText());//esto es agarra el valor que ingresemos por pantalla
        dato.setEdad(txt_edad.getText());
        dato.setCargo(txt_cargo.getText());
        dato.setDireccion(txt_direccion.getText());
        dato.setTelefono(txt_telefono.getText());

        
        Empleado dato2 = new Empleado();
        dato.setNombre(txt_nombre.getText());
        dato.setCargo(txt_cargo.getText());
        
        cliente.AddToArrayTableEmpleado(dato);
        cliente.AddToArrayTableEmpleado(dato2);

        dispose();
    }

    public void guardar_bd() {

        String codigo, descripcion, modelo, referencia, almacen, stock_actual, unidad, observacion;

        codigo = txt_nombre.getText().trim();
        descripcion = txt_edad.getText().trim();
        modelo = txt_cargo.getText().trim();
        referencia = txt_direccion.getText().trim();
        almacen = txt_telefono.getText().trim();

        try {
            Connection conectar2 = Conexion.conectar();
            PreparedStatement pst2 = conectar2.prepareStatement(
                    "select codigo from balanzas where codigo = '" + codigo + "'");
            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {
                txt_nombre.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Codigo ya registrado");
                txt_nombre.setText("");
                txt_edad.setText("");
                txt_cargo.setText("");
                txt_direccion.setText("");
                txt_telefono.setText("");
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelclienteimagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    private static class cliente {

        public cliente() {
        }
    }

}
