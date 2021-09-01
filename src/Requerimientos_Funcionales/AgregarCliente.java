package Requerimientos_Funcionales;

import Clases.Cliente;
import DatabaseClasses.CRUDCliente;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.JOptionPane;
import restaurante.CamposTexto;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgregarCliente extends javax.swing.JPanel {

    String ruta = System.getProperty("user.dir") + "\\src\\DatabaseClasses\\Clientes.txt";
    
    String usuario = "", contraseña = "";
    
    CRUDCliente opc = new CRUDCliente(ruta);
    private CamposTexto txt = new CamposTexto();
    public AgregarCliente(String usuario, String contraseña) {
        initComponents();
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoResto1 = new restaurante.FondoResto();
        jLabel8 = new javax.swing.JLabel();
        Identificación = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Alergias = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hemoglobina = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        glucosa = new javax.swing.JTextField();
        Peso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Altura = new javax.swing.JTextField();
        Hombre = new javax.swing.JRadioButton();
        nombre = new javax.swing.JTextField();
        Mujer = new javax.swing.JRadioButton();
        fNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        otro = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/create user/add_30px.png"))); // NOI18N
        jLabel8.setText("Agregar");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        Identificación.setBackground(new java.awt.Color(246, 246, 246));
        Identificación.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Identificación.setForeground(new java.awt.Color(51, 51, 51));
        Identificación.setText("Asignar Identificación");
        Identificación.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Identificación.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IdentificaciónMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IdentificaciónMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IdentificaciónMouseExited(evt);
            }
        });
        Identificación.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdentificaciónKeyTyped(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/drag_gender_neutral_20px.png"))); // NOI18N

        Alergias.setBackground(new java.awt.Color(246, 246, 246));
        Alergias.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Alergias.setForeground(new java.awt.Color(51, 51, 51));
        Alergias.setText("Ingresar Alergias");
        Alergias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Alergias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlergiasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AlergiasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AlergiasMouseExited(evt);
            }
        });
        Alergias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AlergiasKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/user_20px.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/identification_documents_20px.png"))); // NOI18N

        hemoglobina.setBackground(new java.awt.Color(246, 246, 246));
        hemoglobina.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        hemoglobina.setForeground(new java.awt.Color(51, 51, 51));
        hemoglobina.setText("Niveles Hemoglobina");
        hemoglobina.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        hemoglobina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hemoglobinaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hemoglobinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hemoglobinaMouseExited(evt);
            }
        });
        hemoglobina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hemoglobinaKeyTyped(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/add client/birthday_20px.png"))); // NOI18N

        glucosa.setBackground(new java.awt.Color(246, 246, 246));
        glucosa.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        glucosa.setForeground(new java.awt.Color(51, 51, 51));
        glucosa.setText("Niveles Glucosa");
        glucosa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        glucosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                glucosaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                glucosaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                glucosaMouseExited(evt);
            }
        });
        glucosa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                glucosaKeyTyped(evt);
            }
        });

        Peso.setBackground(new java.awt.Color(246, 246, 246));
        Peso.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Peso.setForeground(new java.awt.Color(51, 51, 51));
        Peso.setText("Asignar Peso");
        Peso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        Peso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PesoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PesoMouseExited(evt);
            }
        });
        Peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PesoKeyTyped(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/glucometer_20px.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/add client/scale_20px.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/drop_of_blood_20px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/add client/compare_heights_20px.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/add client/microorganisms_20px.png"))); // NOI18N

        Altura.setBackground(new java.awt.Color(246, 246, 246));
        Altura.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Altura.setForeground(new java.awt.Color(51, 51, 51));
        Altura.setText("Asignar Altura (cm)");
        Altura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        Altura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlturaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AlturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AlturaMouseExited(evt);
            }
        });
        Altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AlturaKeyTyped(evt);
            }
        });

        Hombre.setBackground(new java.awt.Color(246, 246, 246));
        Hombre.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 10)); // NOI18N
        Hombre.setForeground(new java.awt.Color(51, 51, 51));
        Hombre.setSelected(true);
        Hombre.setText("Hombre");
        Hombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HombreActionPerformed(evt);
            }
        });

        nombre.setBackground(new java.awt.Color(246, 246, 246));
        nombre.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(51, 51, 51));
        nombre.setText("Asignar Nombre");
        nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nombreMouseExited(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        Mujer.setBackground(new java.awt.Color(246, 246, 246));
        Mujer.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 10)); // NOI18N
        Mujer.setForeground(new java.awt.Color(51, 51, 51));
        Mujer.setText("Mujer");
        Mujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MujerActionPerformed(evt);
            }
        });

        fNacimiento.setBackground(new java.awt.Color(246, 246, 246));
        fNacimiento.setForeground(new java.awt.Color(51, 51, 51));

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Otro:");

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
                .addContainerGap()
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Identificación)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Mujer))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(2, 2, 2)
                        .addComponent(otro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hemoglobina, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Alergias, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Peso, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(fNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(glucosa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        fondoResto1Layout.setVerticalGroup(
            fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoResto1Layout.createSequentialGroup()
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(fNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(glucosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Identificación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Hombre)
                                .addComponent(Mujer))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(otro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Alergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(31, 31, 31)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hemoglobina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoResto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoResto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
        nombre.setText("");
    }//GEN-LAST:event_nombreMouseClicked

    private void nombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseEntered
        txt.entrarJTextField(nombre);
    }//GEN-LAST:event_nombreMouseEntered

    private void nombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseExited
        txt.salirJTextField(nombre);
    }//GEN-LAST:event_nombreMouseExited

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        if (nombre.getText().equals("Asginar Nombre")) nombre.setText(null);
    }//GEN-LAST:event_nombreKeyTyped

    private void IdentificaciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdentificaciónMouseClicked
        Identificación.setText("");
    }//GEN-LAST:event_IdentificaciónMouseClicked

    private void IdentificaciónMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdentificaciónMouseEntered
        txt.entrarJTextField(Identificación);
    }//GEN-LAST:event_IdentificaciónMouseEntered

    private void IdentificaciónMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdentificaciónMouseExited
        txt.salirJTextField(Identificación);
    }//GEN-LAST:event_IdentificaciónMouseExited

    private void IdentificaciónKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdentificaciónKeyTyped
        if (Identificación.getText().equals("Asignar Identificación")) Identificación.setText(null);
    }//GEN-LAST:event_IdentificaciónKeyTyped

    private void PesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesoMouseClicked
        Peso.setText("");
    }//GEN-LAST:event_PesoMouseClicked

    private void PesoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesoMouseEntered
        txt.entrarJTextField(Peso);
    }//GEN-LAST:event_PesoMouseEntered

    private void PesoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesoMouseExited
        txt.salirJTextField(Peso);
    }//GEN-LAST:event_PesoMouseExited

    private void PesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesoKeyTyped
        if (Peso.getText().equals("Asignar Peso")) Peso.setText(null);
        if (!Character.isDigit(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_PesoKeyTyped

    private void AlturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlturaMouseClicked
        Altura.setText("");
    }//GEN-LAST:event_AlturaMouseClicked

    private void AlturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlturaMouseEntered
        txt.entrarJTextField(Altura);
    }//GEN-LAST:event_AlturaMouseEntered

    private void AlturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlturaMouseExited
        txt.salirJTextField(Altura);
    }//GEN-LAST:event_AlturaMouseExited

    private void AlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlturaKeyTyped
        if (Altura.getText().equals("Asignar Altura (cm)")) Altura.setText(null);
        if (!Character.isDigit(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_AlturaKeyTyped

    private void HombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HombreActionPerformed
        if(Mujer.isSelected()) Mujer.setSelected(false);
        else if(!Hombre.isSelected()) Mujer.setSelected(true);
        otro.setText("");
    }//GEN-LAST:event_HombreActionPerformed

    private void MujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MujerActionPerformed
        if(Hombre.isSelected()) Hombre.setSelected(false);
        else if(!Mujer.isSelected()) Hombre.setSelected(true);
        otro.setText("");
    }//GEN-LAST:event_MujerActionPerformed

    private void AlergiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlergiasMouseClicked
        Alergias.setText("");
    }//GEN-LAST:event_AlergiasMouseClicked

    private void AlergiasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlergiasMouseEntered
        txt.entrarJTextField(Alergias);
    }//GEN-LAST:event_AlergiasMouseEntered

    private void AlergiasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlergiasMouseExited
        txt.salirJTextField(Alergias);
    }//GEN-LAST:event_AlergiasMouseExited

    private void AlergiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlergiasKeyTyped
        if (Alergias.getText().equals("Ingresar Alergias")) Alergias.setText(null);
    }//GEN-LAST:event_AlergiasKeyTyped

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Cliente cli;
            cli = new Cliente();
        try {
            llenarInfo(cli);
        } catch (ParseException ex) {
            Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
            String us = JOptionPane.showInputDialog("Ingrese el usuario del administrador.");
            String pass = JOptionPane.showInputDialog("Ingrese la contraseña del administrador.");
            if (us.equals(usuario) && pass.equals(contraseña)) {
                try {
                    if (opc.buscarCliente(Long.parseLong(Identificación.getText()))) JOptionPane.showMessageDialog(null, "Persona registrada con anterioridad.");
                    else{
                        opc.AgregarCliente(cli);
                        JOptionPane.showMessageDialog(null, "Usuario creado con éxito.");
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e.getCause());
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
            }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        txt.entrarJLabel(jLabel8);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        txt.salirJLabel(jLabel8);
    }//GEN-LAST:event_jLabel8MouseExited

    private void hemoglobinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hemoglobinaMouseClicked
        hemoglobina.setText("");
    }//GEN-LAST:event_hemoglobinaMouseClicked

    private void hemoglobinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hemoglobinaMouseEntered
        txt.entrarJTextField(hemoglobina);
    }//GEN-LAST:event_hemoglobinaMouseEntered

    private void hemoglobinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hemoglobinaMouseExited
        txt.salirJTextField(hemoglobina);
    }//GEN-LAST:event_hemoglobinaMouseExited

    private void hemoglobinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hemoglobinaKeyTyped
        if (hemoglobina.getText().equals("Niveles Hemoglobina")) hemoglobina.setText(null);
    }//GEN-LAST:event_hemoglobinaKeyTyped

    private void glucosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glucosaMouseClicked
        glucosa.setText("");
    }//GEN-LAST:event_glucosaMouseClicked

    private void glucosaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glucosaMouseEntered
        txt.entrarJTextField(glucosa);
    }//GEN-LAST:event_glucosaMouseEntered

    private void glucosaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glucosaMouseExited
        txt.salirJTextField(glucosa);
    }//GEN-LAST:event_glucosaMouseExited

    private void glucosaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_glucosaKeyTyped
        if (hemoglobina.getText().equals("Niveles Glucosa")) hemoglobina.setText(null);
    }//GEN-LAST:event_glucosaKeyTyped

    private void otroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_otroMouseClicked

    private void otroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otroMouseEntered
        txt.entrarJTextField(otro);
    }//GEN-LAST:event_otroMouseEntered

    private void otroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otroMouseExited
        txt.salirJTextField(otro);
    }//GEN-LAST:event_otroMouseExited

    private void otroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otroKeyTyped
        Hombre.setSelected(false);
        Mujer.setSelected(false);
    }//GEN-LAST:event_otroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alergias;
    private javax.swing.JTextField Altura;
    private javax.swing.JRadioButton Hombre;
    private javax.swing.JTextField Identificación;
    private javax.swing.JRadioButton Mujer;
    private javax.swing.JTextField Peso;
    private com.toedter.calendar.JDateChooser fNacimiento;
    private restaurante.FondoResto fondoResto1;
    private javax.swing.JTextField glucosa;
    private javax.swing.JTextField hemoglobina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField otro;
    // End of variables declaration//GEN-END:variables

    private void llenarInfo(Cliente cli) throws ParseException{
        cli.setNombre(this.nombre.getText());
        cli.setId(Long.parseLong(Identificación.getText()));
        if (Hombre.isSelected()) { cli.setGenero(Hombre.getText());}
        else if (Mujer.isSelected()) { cli.setGenero(Mujer.getText());}
        else{ cli.setGenero(otro.getText());}
        cli.setAlergias(Alergias.getText());
        cli.setHemoglobina(Integer.parseInt(this.hemoglobina.getText()));
        cli.setFechaCumpleaños(fNacimiento.getDate());
        cli.setPeso(Integer.parseInt(this.Peso.getText()));
        cli.setAltura(Double.parseDouble(this.Altura.getText()) / 100);
        cli.setGlucosa(Integer.parseInt(this.glucosa.getText()));
        cli.setIMC(cli.getPeso()/(cli.getAltura() * cli.getAltura()));
    }
    
}
