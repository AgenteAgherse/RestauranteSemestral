package Requerimientos_Funcionales;

import Clases.Cliente;
import DatabaseClasses.CRUDCliente;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante.CamposTexto;

public class ActualizarCliente extends javax.swing.JPanel {

    private String ruta = System.getProperty("user.dir") + "\\src\\DatabaseClasses\\Clientes.txt";
    private String usuario = "", contraseña = "";
    private CRUDCliente clientes = new CRUDCliente(ruta);
    private CamposTexto txt = new CamposTexto();
    private boolean actualizar = false;
    
    private long id;
    public ActualizarCliente(String usuario, String contraseña) {
        initComponents();
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoResto1 = new restaurante.FondoResto();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        hemoglobina = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Alergias = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Altura = new javax.swing.JTextField();
        glucosa = new javax.swing.JTextField();
        Peso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Buscar = new javax.swing.JLabel();
        identificacion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/refresh_30px.png"))); // NOI18N
        jLabel6.setText("Actualizar");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Actualización de Datos de *Inserte Nombre del Usuario*");

        hemoglobina.setBackground(new java.awt.Color(246, 246, 246));
        hemoglobina.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        hemoglobina.setForeground(new java.awt.Color(51, 51, 51));
        hemoglobina.setText("Niveles Hemoglobina");
        hemoglobina.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/drop_of_blood_20px.png"))); // NOI18N

        Alergias.setBackground(new java.awt.Color(246, 246, 246));
        Alergias.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Alergias.setForeground(new java.awt.Color(51, 51, 51));
        Alergias.setText("Ingresar Alergias");
        Alergias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/add client/microorganisms_20px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/add client/compare_heights_20px.png"))); // NOI18N

        Altura.setBackground(new java.awt.Color(246, 246, 246));
        Altura.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Altura.setForeground(new java.awt.Color(51, 51, 51));
        Altura.setText("Asignar Altura (cm)");
        Altura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
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
        Peso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/add client/scale_20px.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/glucometer_20px.png"))); // NOI18N

        Buscar.setBackground(new java.awt.Color(0, 0, 0));
        Buscar.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(51, 51, 51));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/search_30px.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarMouseExited(evt);
            }
        });

        identificacion.setBackground(new java.awt.Color(246, 246, 246));
        identificacion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        identificacion.setForeground(new java.awt.Color(51, 51, 51));
        identificacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        identificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                identificacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                identificacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                identificacionMouseExited(evt);
            }
        });
        identificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                identificacionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout fondoResto1Layout = new javax.swing.GroupLayout(fondoResto1);
        fondoResto1.setLayout(fondoResto1Layout);
        fondoResto1Layout.setHorizontalGroup(
            fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoResto1Layout.createSequentialGroup()
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel6))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoResto1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(glucosa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoResto1Layout.createSequentialGroup()
                                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fondoResto1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fondoResto1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fondoResto1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hemoglobina, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fondoResto1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Alergias, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buscar))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        fondoResto1Layout.setVerticalGroup(
            fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoResto1Layout.createSequentialGroup()
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buscar)
                            .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hemoglobina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Alergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(glucosa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(141, 141, 141)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoResto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoResto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void identificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificacionMouseClicked
        if (identificacion.equals("Digite Identificación")) identificacion.setText("");
    }//GEN-LAST:event_identificacionMouseClicked

    private void identificacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificacionMouseEntered
        txt.entrarJTextField(identificacion);
    }//GEN-LAST:event_identificacionMouseEntered

    private void identificacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificacionMouseExited
        txt.salirJTextField(identificacion);
    }//GEN-LAST:event_identificacionMouseExited

    private void identificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identificacionKeyTyped
        if (identificacion.getText().equals("Usuario")) identificacion.setText(null);
    }//GEN-LAST:event_identificacionKeyTyped

    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
        txt.salirJLabel(Buscar);
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
        txt.salirJLabel(Buscar);
    }//GEN-LAST:event_BuscarMouseExited

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
        if (glucosa.getText().equals("Niveles Glucosa")) glucosa.setText(null);
    }//GEN-LAST:event_glucosaKeyTyped

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

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Cliente cliente;
        if (actualizar) {
            cliente = new Cliente();
            llenarInformacion(cliente);
            String usuario = JOptionPane.showInputDialog(null, "Ingrese el usuario para confirmar");
            String contraseña = JOptionPane.showInputDialog(null, "Ingrese el usuario para confirmar");
            if (this.usuario.equals(usuario) && this.contraseña.equals(contraseña)) {
                try {
                    clientes.AgregarCliente(cliente);
                    JOptionPane.showMessageDialog(null, "Datos del cliente actualizados!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "No se puede actualizar. No pertenece al restaurante.");
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        txt.entrarJLabel(jLabel6);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        txt.salirJLabel(jLabel6);
    }//GEN-LAST:event_jLabel6MouseExited

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        long id = Long.parseLong(identificacion.getText());
        try {
            if (!clientes.buscarCliente(id)) {
                JOptionPane.showMessageDialog(null, "Persona sin agregar en la base");
                actualizar = false;
            }
            else{
                jLabel1.setText("Actualización de Datos de " + clientes.getNombre());
                actualizar = true;
                this.id = id;
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_BuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alergias;
    private javax.swing.JTextField Altura;
    private javax.swing.JLabel Buscar;
    private javax.swing.JTextField Peso;
    private restaurante.FondoResto fondoResto1;
    private javax.swing.JTextField glucosa;
    private javax.swing.JTextField hemoglobina;
    private javax.swing.JTextField identificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void llenarInformacion(Cliente cliente){
        cliente.setNombre(clientes.getNombre());
        cliente.setId(id);
        cliente.setGenero(clientes.getGenero());
        cliente.setAlergias(clientes.getAlergias());
        cliente.setHemoglobina(Integer.parseInt(hemoglobina.getText()));
        cliente.setPeso(Integer.parseInt(Peso.getText()));
        cliente.setAltura(Double.parseDouble(Altura.getText())/100);
        cliente.setGlucosa(Integer.parseInt(glucosa.getText()));
        cliente.setIMC(cliente.getPeso()/(Math.pow(cliente.getAltura(), 2)));
    }
}
