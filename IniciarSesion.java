/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cajeroautomatico;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * La clase `IniciarSesion` representa una pantalla de inicio de sesión en un
 * cajero automatico. Tiene la funcionalidad  de iniciar sesion: donde pone su 
 * id de usuario y su clave para acceder
 * 
 * @author Grupo 
 */
public class IniciarSesion extends javax.swing.JFrame {
    /**
     * El número de identificación (CI) del usuario.
     */
    private String ci;
    /**
     * El número de cuenta del usuario.
     */
    private String cuenta;
    /**
     * La contraseña del usuario.
     */
    private String contraseña;
    /**
     * Seleccion de idioma del usuario.
     */
    String idioma;
     /**
     * El paquete de recursos para los recursos de texto de la aplicación.
     */
    private ResourceBundle recursos;
    /**
     * El algoritmo utilizado para el cifrado/descifrado.
     */
    private static final String ALGORITHM = "AES";
    /**
     * La clave secreta utilizada para el cifrado/descifrado.
     */
    private static final String KEY = "mysecretpassword"; // Clave secreta para el cifrado
    /**
     * La contraseña descifrada.
     */
    String contraseñaDesencriptada;
    
     /**
     * Se construye  un nuevo objeto `IniciarSesion` con el idioma seleccionado.
     *
     * @param idioma la preferencia de idioma del usuario
     */

    public IniciarSesion(String idioma) {
        this.idioma = idioma;
        Locale locale = new Locale(idioma);
        ResourceBundle recursos = ResourceBundle.getBundle("textos", locale);
        initComponents();
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

        setImageButton(btnConfirmar, "src/Imgenes/b1.png");
        btnConfirmar.setOpaque(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setBorderPainted(false);

        setImageButton(btnCuatro, "src/Imgenes/b1.png");
        btnCuatro.setOpaque(false);
        btnCuatro.setContentAreaFilled(false);
        btnCuatro.setBorderPainted(false);

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
        btnCuatro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnUno = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblCi = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        lblConfirmar = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        passwordCuenta = new javax.swing.JPasswordField();

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
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

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

        btnConfirmar.setMaximumSize(new java.awt.Dimension(80, 80));
        btnConfirmar.setMinimumSize(new java.awt.Dimension(80, 80));
        btnConfirmar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
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
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(504, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(504, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(504, 600));

        lblCi.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblCi.setForeground(new java.awt.Color(0, 204, 0));
        lblCi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCi.setText("INGRESE SU CI");

        lblConfirmar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblConfirmar.setForeground(new java.awt.Color(0, 204, 51));
        lblConfirmar.setText("CONFIRMAR");

        lblAtras.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        lblAtras.setForeground(new java.awt.Color(0, 204, 51));
        lblAtras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAtras.setText("ATRAS");

        lblContraseña.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 204, 0));
        lblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContraseña.setText("CONTRESEÑA");

        lblTitulo.setFont(new java.awt.Font("Myanmar Text", 1, 38)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("¡¡BIENVENIDO!!");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCi, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 130, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(lblCi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmar)
                    .addComponent(lblAtras))
                .addGap(57, 57, 57))
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
    * Obtiene los datos informacion en los camposde entrada.
    */
    private void obtenerDatos() {
        ci = txtCuenta.getText().trim();
        contraseña = new String(passwordCuenta.getPassword()); // Obtiene la contraseña ingresada
        leerCuenta();
    }
    
    /**
     * Lee la información de la cuenta del usuario de un archivo y valida las credenciales del usuario.
     * Si el usuario es válido abre la ventana de sesión. De lo contrario, muestra un mensaje de error
    */
    public void leerCuenta() {
        boolean usuarioValido = false;
        String ciIngresado = null;

        try (BufferedReader br = new BufferedReader(new FileReader("src/Archivos/DatosCuenta.txt"))) {
            String linea;
            String ciGuardado = null, cuentaGuardada = null, contraseñaGuardada = null;

            while ((linea = br.readLine()) != null) {
                System.out.println("Línea leída: " + linea); // Para depuración

                if (linea.startsWith("CI:")) {
                    ciGuardado = linea.substring(linea.indexOf(":") + 1).trim();
                } else if (linea.startsWith("N° DE CUENTA")) {
                    cuentaGuardada = linea.substring(linea.indexOf(":") + 1).trim();
                    cuenta = cuentaGuardada;
                } else if (linea.startsWith("CONTRASEÑA:")) {
                    contraseñaGuardada = linea.substring(linea.indexOf(":") + 1).trim();
                    contraseñaDesencriptada = desencriptarContraseña(contraseñaGuardada);
                    
                    if (ci.equals(ciGuardado) && contraseña.equals(contraseñaDesencriptada)) {
                        usuarioValido = true;
                        ciIngresado = ciGuardado;
                        break; // Si se encuentra un usuario válido, se detiene la búsqueda
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
         /**
         * Si el usuario es válido, crea una nueva sesión con los datos del usuario y la muestra. Si no, muestra un mensaje de error.
        */
        if (usuarioValido) {
           // Cuentas cuentas = new Cuentas(ciIngresado, idioma);
            //cuentas.cambiarIdioma(idioma);
            //cuentas.setVisible(true);
            Sesion sesion = new Sesion(ci, cuenta, idioma);
            sesion.cambiarIdioma(idioma);
            sesion.setVisible(true);
            dispose();
        } else {
            // Si el usuario no es válido, se muestra un mensaje de error

            JOptionPane optionPane = new JOptionPane("Usuario o contraseña incorrectos.", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
            JDialog dialog = optionPane.createDialog("Mensaje");
            Timer timer = new Timer(4000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                }
            });
            timer.setRepeats(false); // Para que se ejecute solo una vez
            timer.start();
            dialog.setVisible(true);
            txtCuenta.setText("");
            passwordCuenta.setText("");
        }
    }
    
    /**
    *  Desencripta a contraseña 
    * 
    * @param encryptedPassword La contraseña cifrada que se desea desencriptar.
    * @return La contraseña desencriptada o null en caso de error.
    */
    
     public static String desencriptarContraseña(String encryptedPassword) {
        try {
            SecretKeySpec secretKey = new SecretKeySpec(KEY.getBytes(StandardCharsets.UTF_8), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedPassword);
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
     
    /**
    *  Cambia el idioma de la interfaz de usuario de la aplicación.
    * @param idioma El idioma al que se desea cambiar la interfaz.
    */

     
    public void cambiarIdioma(String idioma) {
        Locale locale = new Locale(idioma);
        recursos = ResourceBundle.getBundle("textos", locale);
        lblTitulo.setText(recursos.getString("etiqueta.bienvenido"));
        lblCi.setText(recursos.getString("etiqueta.ingrese_ci"));
        lblContraseña.setText(recursos.getString("etiqueta.contraseña"));
        lblAtras.setText(recursos.getString("etiqueta.atras"));
        lblConfirmar.setText(recursos.getString("etiqueta.confirmar"));
    }
    /**
     * Mnneja el evento  al hacer clic en el botn confirmar
     *
     */
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        obtenerDatos();

    }//GEN-LAST:event_btnConfirmarActionPerformed
    /**
     * Maneja el evento que se hace clic en el boton'cuatro'
     
     */
    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        Pantalla1 p1 = new Pantalla1(idioma);
        p1.cambiarIdioma(idioma);
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCuatroActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new IniciarSesion().setVisible(true);
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
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrase;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JLabel lblCi;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField passwordCuenta;
    private javax.swing.JTextField txtCuenta;
    // End of variables declaration//GEN-END:variables
}
