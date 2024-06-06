/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cajeroautomatico;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * La clase `Historial` representa un JFrame que muestra el historial de transacciones de una cuenta bancaria.
 * 
 * @author Grupo  
 */
public class Historial extends javax.swing.JFrame {

    private String ci;
    private String numeroCuenta;
    private String cuentaOr = "";
    private String cuentaDes = "";
    private DefaultListModel<String> modeloLista;
    private ResourceBundle recursos;
    String idioma;
    
    /**
     * Construye un nuevo objeto `Historial` con los parámetros dados.
     * 
     * @param ci            el número de identificación del cliente
     * @param numeroCuenta  el número de cuenta
     * @param idioma        el idioma de la interfaz de usuario
     */
    public Historial(String ci, String numeroCuenta, String idioma) {
        this.ci = ci;
        this.numeroCuenta = numeroCuenta;
        this.idioma = idioma;
        modeloLista = new DefaultListModel<>();
        Locale locale = new Locale(idioma);
        ResourceBundle recursos = ResourceBundle.getBundle("textos", locale);

        initComponents();
        leerTransferencias();
        consultaSaldo();

        lRetiros.setModel(modeloLista);

        this.setLocationRelativeTo(this);

        setImageButton(btnUno, "src/Imgenes/b1.png");
        btnUno.setOpaque(false);
        btnUno.setContentAreaFilled(false);
        btnUno.setBorderPainted(false);

        setImageButton(btnDos, "src/Imgenes/b1.png");
        btnDos.setOpaque(false);
        btnDos.setContentAreaFilled(false);
        btnDos.setBorderPainted(false);

        setImageButton(btnIniciarSesion, "src/Imgenes/b1.png");
        btnIniciarSesion.setOpaque(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setBorderPainted(false);

        setImageButton(btnRegistrase, "src/Imgenes/b1.png");
        btnRegistrase.setOpaque(false);
        btnRegistrase.setContentAreaFilled(false);
        btnRegistrase.setBorderPainted(false);

        setImageButton(btnAtras, "src/Imgenes/b1.png");
        btnAtras.setOpaque(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setBorderPainted(false);

        setImageButton(btnCuatro, "src/Imgenes/b1.png");
        btnCuatro.setOpaque(false);
        btnCuatro.setContentAreaFilled(false);
        btnCuatro.setBorderPainted(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDos = new javax.swing.JButton();
        btnRegistrase = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnUno = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        pMovimientos = new javax.swing.JTabbedPane();
        pRetiros = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lRetiros = new javax.swing.JList<>();
        lblAtras = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblSaldo = new javax.swing.JLabel();
        lblSaldo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        btnCuatro.setMaximumSize(new java.awt.Dimension(80, 80));
        btnCuatro.setMinimumSize(new java.awt.Dimension(80, 80));
        btnCuatro.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        btnUno.setMaximumSize(new java.awt.Dimension(80, 80));
        btnUno.setMinimumSize(new java.awt.Dimension(80, 80));
        btnUno.setOpaque(true);
        btnUno.setPreferredSize(new java.awt.Dimension(80, 80));

        btnIniciarSesion.setMaximumSize(new java.awt.Dimension(80, 80));
        btnIniciarSesion.setMinimumSize(new java.awt.Dimension(80, 80));
        btnIniciarSesion.setPreferredSize(new java.awt.Dimension(80, 80));

        btnAtras.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAtras.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAtras.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pMovimientos.setBackground(new java.awt.Color(255, 255, 255));

        pRetiros.setBackground(new java.awt.Color(255, 255, 255));

        lRetiros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lRetiros);

        lblAtras.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblAtras.setForeground(new java.awt.Color(0, 204, 51));
        lblAtras.setText("ATRAS");

        javax.swing.GroupLayout pRetirosLayout = new javax.swing.GroupLayout(pRetiros);
        pRetiros.setLayout(pRetirosLayout);
        pRetirosLayout.setHorizontalGroup(
            pRetirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRetirosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pRetirosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pRetirosLayout.setVerticalGroup(
            pRetirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRetirosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 90, Short.MAX_VALUE))
        );

        pMovimientos.addTab("Transacciones", pRetiros);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblSaldo.setText("TU SALDO ES :");

        lblSaldo2.setBackground(new java.awt.Color(255, 255, 255));
        lblSaldo2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblSaldo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        lblSaldo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lblSaldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSaldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pMovimientos)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String extraerValor(String linea) {
        return linea.substring(linea.indexOf(":") + 1).trim();
    }

 /**
 * Lee el historial de transacciones de un archivo y llena la lista de transacciones.
 */
 public void leerTransferencias() {
    try (BufferedReader br = new BufferedReader(new FileReader("src/Archivos/Movimientos.txt"))) {
        String linea;
        String fecha = null;
        String tipoMovimiento = null;
        String cantidad = null;
        String cuentaOri = null;
        String cuentaDestino = null;
        boolean cuentaOrigenEncontrada = false;
        boolean envia = false;

        while ((linea = br.readLine()) != null) {
            if (linea.startsWith("N° DE CUENTA ORIGEN:") || linea.startsWith("N° DE CUENTA:") || linea.startsWith("A N° DE CUENTA:")) {
                String cuentaOrigen = linea.substring(linea.indexOf(":") + 1).trim();
                cuentaOrigenEncontrada = cuentaOrigen.equals(numeroCuenta);
                envia = true;
            }
            if (linea.startsWith("N° DE CUENTA ORIGEN:")) {
                String cuenta = linea.substring(linea.indexOf(":") + 1).trim();
                if (cuenta.equals(numeroCuenta)) {
                    envia = false;
                }
            }

            if (cuentaOrigenEncontrada) {
                if (linea.startsWith("FECHA:")) {
                    fecha = linea.substring(linea.indexOf(":") + 1).trim();
                } else if (linea.startsWith("TIPO DE MOVIMIENTO:")) {
                    tipoMovimiento = linea.substring(linea.indexOf(":") + 1).trim();
                } else if (linea.startsWith("CANTIDAD:")) {
                    cantidad = linea.substring(linea.indexOf(":") + 1).trim();
                } else if (linea.startsWith("RECIBE DE N° DE CUENTA:")) {
                    cuentaOri = linea.substring(linea.indexOf(":") + 1).trim();
                } else if (linea.startsWith("N° DE CUENTA DESTINO:")) {
                    cuentaDestino = linea.substring(linea.indexOf(":") + 1).trim();
                }

                if (fecha != null && tipoMovimiento != null && cantidad != null) {
                    if (tipoMovimiento.equals("DEPOSITO") || tipoMovimiento.equals("RETIRO") || tipoMovimiento.equals("TRANSFERENCIA")) {
                        String transferencia = String.format("Fecha: %s, Movimiento: %s, Cantidad: %s", fecha, tipoMovimiento, cantidad);
                        if (tipoMovimiento.equals("TRANSFERENCIA")) {
                            if (!envia) { // Si la cuenta no es la cuenta de origen, agrega información de la cuenta destino
                                transferencia = String.format("%s, Destino: %s", transferencia, cuentaDestino);
                            } else {
                                transferencia = String.format("%s, Recibe de: %s", transferencia, cuentaOri);
                            }
                        }
                        modeloLista.addElement(transferencia);
                    }
                    // Reset variables after processing each transaction
                    fecha = null;
                    tipoMovimiento = null;
                    cantidad = null;
                    cuentaOri = null;
                    cuentaDestino = null;
                }
            }
        }
        
        // Procesar y agregar la última transacción si es necesario
        if (fecha != null && tipoMovimiento != null && cantidad != null) {
            String transferencia = String.format("Fecha: %s, Movimiento: %s, Cantidad: %s", fecha, tipoMovimiento, cantidad);
            if (tipoMovimiento.equals("TRANSFERENCIA")) {
                if (!envia) { // Si la cuenta no es la cuenta de origen, agrega información de la cuenta destino
                    transferencia = String.format("%s, Destino: %s", transferencia, cuentaDestino);
                } else {
                    transferencia = String.format("%s, Recibe de: %s", transferencia, cuentaOri);
                }
            }
            modeloLista.addElement(transferencia);
        }

        br.close();
        
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    /**
     * Recupera el saldo de la cuenta y lo muestra en el JFrame.
     */
    private void consultaSaldo() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Archivos/Saldo.txt"))) {
            String linea;
            double nCantidad;
            double saldo;
            String str;
            String saldoGuardado = null;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("N° DE CUENTA:") && extraerValor(linea).equals(numeroCuenta)) {
                    while ((linea = br.readLine()) != null) {
                        if (linea.startsWith("SALDO:")) {
                            saldoGuardado = extraerValor(linea);
                            break;
                        }
                    }
                    break;
                }
            }

            //jLabel2.setText(saldoGuardado != null ? saldoGuardado : "Saldo no disponible");
            saldo = Double.parseDouble(saldoGuardado);
            BigDecimal bd = new BigDecimal(saldo).setScale(2, RoundingMode.HALF_UP);
            nCantidad = bd.doubleValue();
            str = Double.toString(nCantidad);
            lblSaldo2.setText(str);
            br.close();
        } catch (IOException ex) {

        }
    }
    
    /**
    * Cambia el idioma de la interfaz de usuario según el código de idioma proporcionado.
    * 
    * @param idioma el código de idioma (p. ej., "en", "es", "fr")
    */
    
    public void cambiarIdioma(String idioma) {
        Locale locale = new Locale(idioma);
        recursos = ResourceBundle.getBundle("textos", locale);
        
        lblSaldo.setText(recursos.getString("etiqueta.saldo"));
        lblAtras.setText(recursos.getString("etiqueta.atras"));
    }
    
    /**
     * Maneja el evento  cuando se presiona atras
     */
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       Sesion sesion = new Sesion(ci, numeroCuenta, idioma);
       sesion.cambiarIdioma(idioma);
       sesion.setVisible(true);
       dispose();
     
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });

    }
    /**
     * stablece la imagen en JLabel  deeterminado
     */
    private void setImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    /**
     * establece la imagen en JButtone determinado 
     */
    private void setImageButton(JButton buttonName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(buttonName.getWidth(), buttonName.getHeight(), Image.SCALE_DEFAULT));
        buttonName.setIcon(icon);
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrase;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lRetiros;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldo2;
    private javax.swing.JTabbedPane pMovimientos;
    private javax.swing.JPanel pRetiros;
    // End of variables declaration//GEN-END:variables
}
