package Ventanas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

import Balanza.Balanza;
import Conexion.Conexion;
import Empleado.Empleado;
import Cliente.Cliente;
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
public class editempleado extends javax.swing.JFrame {

    public main principal;

    public Empleado materialacambiar;
    public int position;
    public boolean wasedited = false;

    /**
     * Creates new form Ventana
     */
    public editempleado() {
        initComponents();

        setSize(601, 420);
        setTitle("Pesamatic Inventary - Modificacion de Empleado");
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
        jLabel5 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_cargo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_edad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

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

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 80, -1));

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 180, 30));
        jPanel2.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 180, 50));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Direcci??n");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Cargo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 70, -1));

        txt_cargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cargoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 180, 30));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setText("Edad");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 126, 80, -1));

        txt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edadActionPerformed(evt);
            }
        });
        txt_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_edadKeyTyped(evt);
            }
        });
        jPanel2.add(txt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 40, 30));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 70, -1));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 180, 30));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Modicacion de Empleado");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 610, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/empleado.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

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
                String ID = txt_nombre.getText().toString().trim();

                Connection conectar = Conexion.conectar();
                PreparedStatement pst = conectar.prepareStatement(
                        "update empleados set nombre = ?, edad = ?, cargo = ?, direccion = ?, telefono = ? where nombre = '" + ID + "'");
                pst.setString(1, txt_nombre.getText().trim());
                pst.setString(2, txt_edad.getText().trim());
                pst.setString(3, txt_cargo.getText().trim());
                pst.setString(4, txt_direccion.getText().trim());
                pst.setString(5, txt_telefono.getText().trim());


                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
                this.save();

            } catch (SQLException e) {
                System.out.println("Error, no se pudo modificar " + e);
                JOptionPane.showMessageDialog(null, "Error al modificar");
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

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edadActionPerformed

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') || (txt_telefono.getText().length() > 10)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void txt_cargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cargoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') || (txt_cargo.getText().length() > 10)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_cargoKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') || (txt_nombre.getText().length() > 11)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edadKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') || (txt_edad.getText().length() > 1)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_edadKeyTyped

    ////// FUNCIONES
    public void load(Empleado mimaterial) {

        this.materialacambiar = mimaterial;
        this.txt_nombre.setText(this.materialacambiar.getNombre());
        this.txt_edad.setText(this.materialacambiar.getEdad());
        this.txt_cargo.setText(this.materialacambiar.getCargo());
        this.txt_direccion.setText(this.materialacambiar.getDireccion());
        this.txt_telefono.setText(this.materialacambiar.getTelefono());
        

    }

    public void save() {
        this.wasedited = true;
        materialacambiar.setNombre(txt_nombre.getText());//esto es agarra el valor que ingresemos por pantalla
        materialacambiar.setEdad(txt_edad.getText());//esto es valor que ongrese por pantalla
        materialacambiar.setCargo(txt_cargo.getText());
        materialacambiar.setDireccion(txt_cargo.getText());
        materialacambiar.setTelefono(txt_telefono.getText());
        

        principal.EditListEmpleado(materialacambiar, position);
        this.dispose();
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
    private javax.swing.JLabel jLabel9;
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
}
