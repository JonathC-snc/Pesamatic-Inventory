package Ventanas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

import Balanza.Balanza;
import Conexion.Conexion;
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
public class editcliente extends javax.swing.JFrame {

    public main principal;

    public Cliente materialacambiar;
    public int position;
    public boolean wasedited = false;

    /**
     * Creates new form Ventana
     */
    public editcliente() {
        initComponents();

        setSize(601, 420);
        setTitle("Pesamatic Inventary - Modificacion de Cliente");
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
        txt_p_servicios = new javax.swing.JTextField();
        txt_antiguedad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_prioridad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre_empresa = new javax.swing.JTextField();
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
        jLabel5.setText("Periodo de Servicios");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        txt_p_servicios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_p_serviciosKeyTyped(evt);
            }
        });
        jPanel2.add(txt_p_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 117, 30));
        jPanel2.add(txt_antiguedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Antiguedad");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 276, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Prioridad");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 70, -1));

        txt_prioridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_prioridadKeyTyped(evt);
            }
        });
        jPanel2.add(txt_prioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 117, 30));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setText("Dirección");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 126, 80, -1));

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        jPanel2.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 180, 50));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Nombre de Empresa");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txt_nombre_empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_empresaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_nombre_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 180, 30));

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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 610, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cliente_1.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

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
        String nombre_empresa, direccion, prioridad, antiguedad, servicios;

        nombre_empresa = txt_nombre_empresa.getText().trim();
        direccion = txt_direccion.getText().trim();
        prioridad = txt_prioridad.getText().trim();
        antiguedad = txt_antiguedad.getText().trim();
        servicios = txt_p_servicios.getText().trim();

        if (nombre_empresa.equals("")) {
            txt_nombre_empresa.setBackground(Color.red);
            validacion++;
        }
        if (direccion.equals("")) {
            txt_direccion.setBackground(Color.red);
            validacion++;
        }
        if (prioridad.equals("")) {
            txt_prioridad.setBackground(Color.red);
            validacion++;
        }
        if (antiguedad.equals("")) {
            txt_antiguedad.setBackground(Color.red);
            validacion++;
        }
        if (servicios.equals("")) {
            txt_p_servicios.setBackground(Color.red);
            validacion++;
        }

        if (validacion == 0) {

            try {
                String ID = txt_nombre_empresa.getText().toString().trim();

                Connection conectar = Conexion.conectar();
                PreparedStatement pst = conectar.prepareStatement(
                        "update clientes set nombre_empresa = ?, direccion = ?, prioridad = ?, antiguedad = ?, p_servicios = ? where nombre_empresa = '" + ID + "'");
                pst.setString(1, txt_nombre_empresa.getText().trim());
                pst.setString(2, txt_direccion.getText().trim());
                pst.setString(3, txt_prioridad.getText().trim());
                pst.setString(4, txt_antiguedad.getText().trim());
                pst.setString(5, txt_p_servicios.getText().trim());


                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
                this.save();
                this.dispose();

            } catch (SQLException e) {
                System.out.println("Error, no se pudo modificar " + e);
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe de llenar Todos los campos");
            txt_nombre_empresa.setBackground(Color.white);
            txt_direccion.setBackground(Color.white);
            txt_prioridad.setBackground(Color.white);
            txt_antiguedad.setBackground(Color.white);
            txt_p_servicios.setBackground(Color.white);

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_nombre_empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_empresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_empresaActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_p_serviciosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_p_serviciosKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') || (txt_p_servicios.getText().length() > 1)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }
    }//GEN-LAST:event_txt_p_serviciosKeyTyped

    private void txt_prioridadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_prioridadKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') || (txt_prioridad.getText().length() > 5)) {
            evt.consume();
            Toolkit.getDefaultToolkit();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_prioridadKeyTyped

    ////// FUNCIONES
    public void load(Cliente mimaterial) {

        this.materialacambiar = mimaterial;
        this.txt_nombre_empresa.setText(this.materialacambiar.getNombre_empresa());
        this.txt_direccion.setText(this.materialacambiar.getDireccion());
        this.txt_prioridad.setText(this.materialacambiar.getPrioridad());
        this.txt_antiguedad.setText(this.materialacambiar.getAntiguedad());
        this.txt_p_servicios.setText(this.materialacambiar.getP_servicios());
        

    }

    public void save() {
        this.wasedited = true;
        materialacambiar.setNombre_empresa(txt_nombre_empresa.getText());//esto es agarra el valor que ingresemos por pantalla
        materialacambiar.setDireccion(txt_direccion.getText());//esto es valor que ongrese por pantalla
        materialacambiar.setPrioridad(txt_prioridad.getText());
        materialacambiar.setAntiguedad(txt_prioridad.getText());
        materialacambiar.setP_servicios(txt_p_servicios.getText());
        

        principal.EditListCliente(materialacambiar, position);
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
    private javax.swing.JTextField txt_antiguedad;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre_empresa;
    private javax.swing.JTextField txt_p_servicios;
    private javax.swing.JTextField txt_prioridad;
    // End of variables declaration//GEN-END:variables
}
