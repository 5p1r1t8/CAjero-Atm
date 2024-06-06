/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cajeroautomatico;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * La clase `Propias` representa un JFrame que permite a los usuarios administrar sus propias cuentas.
 * Lee la información de la cuenta de un archivo, llena un JComboBox con las cuentas disponibles y 
 * proporciona funcionalidad para navegar entre diferentes paneles dentro de la aplicación.
 * 
 * @author Grupo 

 */

public class Propias extends javax.swing.JFrame {

    private String ci;
    private String cuenta;
    private ResourceBundle recursos;
    String idioma;
    
     /**
     * Construye una nueva instancia de `Propias` con el CI, número de cuenta e idioma especificados del usuario.
     * 
     * @param ci      el CI (Cédula de Identidad) del usuario
     * @param cuenta  el número de cuenta del usuario
     * @param idioma  el idioma que se utilizará para la aplicación
     */
    
    public Propias(String ci, String cuenta, String idioma) {
        this.ci = ci;
        this.cuenta = cuenta;
        this.idioma = idioma;
        Locale locale = new Locale(idioma);
        ResourceBundle recursos = ResourceBundle.getBundle("textos", locale);
        initComponents();
        leerCuenta();

        this.setLocationRelativeTo(this);

        setImageButton(btnUno, "src/Imgenes/b1.png");
        btnUno.setOpaque(false);
        btnUno.setContentAreaFilled(false);
        btnUno.setBorderPainted(false);

        setImageButton(btnDos, "src/Imgenes/b1.png");
        btnDos.setOpaque(false);
        btnDos.setContentAreaFilled(false);
        btnDos.setBorderPainted(false);

        setImageButton(btnSiguiente, "src/Imgenes/b1.png");
        btnSiguiente.setOpaque(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setBorderPainted(false);

        setImageButton(btnRegistrase, "src/Imgenes/b1.png");
        btnRegistrase.setOpaque(false);
        btnRegistrase.setContentAreaFilled(false);
        btnRegistrase.setBorderPainted(false);

        setImageButton(btnConfirmar, "src/Imgenes/b1.png");
        btnConfirmar.setOpaque(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setBorderPainted(false);

        setImageButton(btnAtras, "src/Imgenes/b1.png");
        btnAtras.setOpaque(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setBorderPainted(false);

    }
    /**
     * Lee la información de la cuenta del usuario desde un archivo y llena el JComboBox con las cuentas disponibles.
     */
    public void leerCuenta() {
    try (BufferedReader br = new BufferedReader(new FileReader("src/Archivos/Datos.txt"))) {
        String linea;

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        boolean skip = false; // Bandera para saltar la lectura de cuentas si coinciden con el carnet y la cuenta

        while ((linea = br.readLine()) != null) {
            if (linea.startsWith("CI:") && linea.substring(linea.indexOf(":") + 1).trim().equals(ci)) {
                String cuentaGuardada = null;
                String tipoGuardado = null;
                
            
                while ((linea = br.readLine()) != null) {
                    if (linea.startsWith("N° DE CUENTA:") && linea.substring(linea.indexOf(":") + 1).trim().equals(cuenta)) {
                        // Si la cuenta coincide, activamos la bandera de salto
                        skip = true;
                    } else if (linea.startsWith("TIPO DE CUENTA:")) {
                        tipoGuardado = linea.substring(linea.indexOf(":") + 1).trim();
                    } else if (linea.startsWith("N° DE CUENTA:") && !skip) {
                        // Si no estamos saltando, agregamos la cuenta al modelo
                        cuentaGuardada = linea.substring(linea.indexOf(":") + 1).trim();
                        model.addElement(cuentaGuardada + " - " + tipoGuardado);
                    } else if (linea.startsWith("-")) {
                        // Restablecemos la bandera de salto
                        skip = false;
                        break;
                    }
                }
            }
        }

        jComboBox1.setModel(model);

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(jComboBox1, "Error al leer el archivo de cuentas.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    /**
     * Cambia el idioma de la aplicación según el idioma seleccionado.
     * 
     * @param idioma el idioma que se utilizará para la aplicación
     */
    public void cambiarIdioma(String idioma) {
        Locale locale = new Locale(idioma);
        recursos = ResourceBundle.getBundle("textos", locale);
        lblTitulo.setText(recursos.getString("etiqueta.tituloTP"));
        lblAtras.setText(recursos.getString("etiqueta.atras"));
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
        btnDos = new javax.swing.JButton();
        btnRegistrase = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnUno = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblAtras = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));

        btnDos.setMaximumSize(new java.awt.Dimension(80, 80));
        btnDos.setMinimumSize(new java.awt.Dimension(80, 80));
        btnDos.setPreferredSize(new java.awt.Dimension(80, 80));

        btnRegistrase.setMaximumSize(new java.awt.Dimension(80, 80));
        btnRegistrase.setMinimumSize(new java.awt.Dimension(80, 80));
        btnRegistrase.setPreferredSize(new java.awt.Dimension(80, 80));

        btnAtras.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAtras.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAtras.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnRegistrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        btnUno.setMaximumSize(new java.awt.Dimension(80, 80));
        btnUno.setMinimumSize(new java.awt.Dimension(80, 80));
        btnUno.setOpaque(true);
        btnUno.setPreferredSize(new java.awt.Dimension(80, 80));

        btnSiguiente.setMaximumSize(new java.awt.Dimension(80, 80));
        btnSiguiente.setMinimumSize(new java.awt.Dimension(80, 80));
        btnSiguiente.setPreferredSize(new java.awt.Dimension(80, 80));

        btnConfirmar.setMaximumSize(new java.awt.Dimension(80, 80));
        btnConfirmar.setMinimumSize(new java.awt.Dimension(80, 80));
        btnConfirmar.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(504, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(504, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(504, 600));

        lblAtras.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblAtras.setForeground(new java.awt.Color(0, 204, 51));
        lblAtras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAtras.setText("ATRAS");

        jComboBox1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 0));
        lblTitulo.setText("ELIGA LA CUENTA QUE DESEA REALIZAR LA TRANSACCION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAtras)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Crea una nueva instancia de `ElegirT`, la configura y la muestra,
     * cerrando la ventana actual
     */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ElegirT elegir = new ElegirT(ci , cuenta, idioma);
        elegir.cambiarIdioma(idioma);
        elegir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String cuentaSeleccionada = (String) jComboBox1.getSelectedItem();
        String numeroCuenta = cuentaSeleccionada.split(" - ")[0];    
        Transferir trans = new Transferir(ci, cuenta, numeroCuenta, idioma);
        trans.cambiarIdioma(idioma);
        trans.setVisible(true);
        dispose();
              
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Propias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Propias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Propias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Propias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Propias pro = new Propias("8987888", "268967092");
                //pro.setVisible(true);

            }
        });

    }
    
    
    private void setImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    private void setImageButton(JButton buttonName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(buttonName.getWidth(), buttonName.getHeight(), Image.SCALE_DEFAULT));
        buttonName.setIcon(icon);
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnRegistrase;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUno;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
