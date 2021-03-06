package restaurante;

import Clases.Administrador;
import DatabaseClasses.CRUDAdministrador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Crear extends javax.swing.JDialog {

    private CamposTexto txt = new CamposTexto();
    private java.awt.Frame padre;
    private CRUDAdministrador admin;
    public Crear(java.awt.Frame parent, boolean modal, CRUDAdministrador admins) {
        super(parent, modal);
        initComponents();
        padre = parent;
        setLocationRelativeTo(null);
        admin = admins;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        fondoResto1 = new restaurante.FondoResto();
        jComboBox1 = new javax.swing.JComboBox<>();
        Hombre = new javax.swing.JRadioButton();
        Mujer = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JTextField();
        NombreUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        otro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jComboBox1.setBackground(new java.awt.Color(246, 246, 246));
        jComboBox1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Mesero", "Cajero", "Gerente" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBox1MouseExited(evt);
            }
        });

        Hombre.setBackground(new java.awt.Color(246, 246, 246));
        Hombre.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 10)); // NOI18N
        Hombre.setForeground(new java.awt.Color(51, 51, 51));
        Hombre.setSelected(true);
        Hombre.setText("Másculino");
        Hombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HombreActionPerformed(evt);
            }
        });

        Mujer.setBackground(new java.awt.Color(246, 246, 246));
        Mujer.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 10)); // NOI18N
        Mujer.setForeground(new java.awt.Color(51, 51, 51));
        Mujer.setText("Femenino");
        Mujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MujerActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/create user/password_20px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/user_20px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/drag_gender_neutral_20px.png"))); // NOI18N
        jLabel6.setText("Genero");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/start/chain_end_30px.png"))); // NOI18N
        jLabel1.setText("Cancelar");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/create user/work_20px.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/create user/add_30px.png"))); // NOI18N
        jLabel2.setText("Agregar");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/identification_documents_20px.png"))); // NOI18N

        Usuario.setBackground(new java.awt.Color(246, 246, 246));
        Usuario.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(51, 51, 51));
        Usuario.setText("Nombre Usuario");
        Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsuarioMouseExited(evt);
            }
        });
        Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsuarioKeyTyped(evt);
            }
        });

        Contraseña.setBackground(new java.awt.Color(246, 246, 246));
        Contraseña.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(51, 51, 51));
        Contraseña.setText("Asignar Contraseña");
        Contraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContraseñaMouseExited(evt);
            }
        });
        Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContraseñaKeyTyped(evt);
            }
        });

        NombreUsuario.setBackground(new java.awt.Color(246, 246, 246));
        NombreUsuario.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        NombreUsuario.setForeground(new java.awt.Color(51, 51, 51));
        NombreUsuario.setText("Asignar Nombre");
        NombreUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        NombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NombreUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NombreUsuarioMouseExited(evt);
            }
        });
        NombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreUsuarioKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Otro:");

        otro.setBackground(new java.awt.Color(246, 246, 246));
        otro.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        otro.setForeground(new java.awt.Color(51, 51, 51));
        otro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        otro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                otroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                otroMouseExited(evt);
            }
        });
        otro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                otroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout fondoResto1Layout = new javax.swing.GroupLayout(fondoResto1);
        fondoResto1.setLayout(fondoResto1Layout);
        fondoResto1Layout.setHorizontalGroup(
            fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoResto1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(Mujer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hombre))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2)
                        .addComponent(otro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
            .addGroup(fondoResto1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fondoResto1Layout.setVerticalGroup(
            fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoResto1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondoResto1Layout.createSequentialGroup()
                                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(Mujer)
                                    .addComponent(Hombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(otro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(3, 3, 3)
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoResto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoResto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreUsuarioKeyTyped
        if (NombreUsuario.getText().equals("Asignar Nombre")) NombreUsuario.setText("");
    }//GEN-LAST:event_NombreUsuarioKeyTyped

    private void NombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreUsuarioMouseClicked
        NombreUsuario.setText("");
    }//GEN-LAST:event_NombreUsuarioMouseClicked

    private void ContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaKeyTyped
        if (Contraseña.getText().equals("Asignar Contraseña")) Contraseña.setText("");
    }//GEN-LAST:event_ContraseñaKeyTyped

    private void ContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMouseExited
        txt.salirJTextField(Contraseña);
    }//GEN-LAST:event_ContraseñaMouseExited

    private void ContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMouseClicked
        Contraseña.setText("");
    }//GEN-LAST:event_ContraseñaMouseClicked

    private void UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuarioKeyTyped
        if (Usuario.getText().equals("Nombre Usuario")) Usuario.setText("");
    }//GEN-LAST:event_UsuarioKeyTyped

    private void UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioMouseClicked
        Usuario.setText("");
    }//GEN-LAST:event_UsuarioMouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        txt.salirJLabel(jLabel2);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        txt.entrarJLabel(jLabel2);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
            Administrador ad;
            String us = JOptionPane.showInputDialog("Ingrese el usuario del administrador.");
            String pass = JOptionPane.showInputDialog("Ingrese la contraseña del administrador.");
            if (admin.buscarAdministrador(us, pass)) {
                ad = new Administrador();
                llenarInfo(ad);
                admin.AgregarAdministrador(ad);
                JOptionPane.showMessageDialog(null, "Usuario creado con éxito.");
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        txt.salirJLabel(jLabel1);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        txt.entrarJLabel(jLabel1);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void MujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MujerActionPerformed
        if(Hombre.isSelected()) {
            Hombre.setSelected(false);
        }
        else if(!Mujer.isSelected()) Hombre.setSelected(true);
        otro.setText("");
    }//GEN-LAST:event_MujerActionPerformed

    private void HombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HombreActionPerformed
        if(Mujer.isSelected()) {
            Mujer.setSelected(false);
        }
        else if(!Hombre.isSelected()) Mujer.setSelected(true);
        otro.setText("");
    }//GEN-LAST:event_HombreActionPerformed

    private void jComboBox1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseExited
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_jComboBox1MouseExited

    private void jComboBox1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseEntered
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(91, 193, 215)));
    }//GEN-LAST:event_jComboBox1MouseEntered

    private void otroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_otroMouseClicked

    private void otroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otroKeyTyped
        Hombre.setSelected(false);
        Mujer.setSelected(false);
    }//GEN-LAST:event_otroKeyTyped

    private void NombreUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreUsuarioMouseEntered
        txt.entrarJTextField(NombreUsuario);
    }//GEN-LAST:event_NombreUsuarioMouseEntered

    private void UsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioMouseEntered
        txt.entrarJTextField(Usuario);
    }//GEN-LAST:event_UsuarioMouseEntered

    private void ContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMouseEntered
        txt.entrarJTextField(Contraseña);
    }//GEN-LAST:event_ContraseñaMouseEntered

    private void otroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otroMouseEntered
        txt.entrarJTextField(otro);
    }//GEN-LAST:event_otroMouseEntered

    private void otroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otroMouseExited
        txt.salirJTextField(otro);
    }//GEN-LAST:event_otroMouseExited

    private void UsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioMouseExited
        txt.salirJTextField(Usuario);
    }//GEN-LAST:event_UsuarioMouseExited

    private void NombreUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreUsuarioMouseExited
        txt.salirJTextField(NombreUsuario);
    }//GEN-LAST:event_NombreUsuarioMouseExited

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
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Crear dialog = new Crear(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contraseña;
    private javax.swing.JRadioButton Hombre;
    private javax.swing.JRadioButton Mujer;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JTextField Usuario;
    private restaurante.FondoResto fondoResto1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField otro;
    // End of variables declaration//GEN-END:variables

    private void llenarInfo(Administrador admin){
        admin.setNombre(NombreUsuario.getText());
        admin.setUsuario(Usuario.getText());
        admin.setContraseña(Contraseña.getText());
        if (Mujer.isSelected()) admin.setGenero(Mujer.getText());
        else if (Hombre.isSelected()) admin.setGenero(Hombre.getText());
        else admin.setGenero(otro.getText());
        admin.setCargo((String) jComboBox1.getSelectedItem());
        
    }
}
