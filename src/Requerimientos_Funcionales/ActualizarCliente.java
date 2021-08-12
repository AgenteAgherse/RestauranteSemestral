/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Requerimientos_Funcionales;

/**
 *
 * @author AGUSTIN HERNANDEZ
 */
public class ActualizarCliente extends javax.swing.JPanel {

    /**
     * Creates new form ActualizarCliente
     */
    public ActualizarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        identificacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Buscar = new javax.swing.JLabel();
        Altura = new javax.swing.JTextField();
        hemoglobina = new javax.swing.JTextField();
        glucosa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Alergias = new javax.swing.JTextField();
        Peso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        identificacion.setBackground(new java.awt.Color(0, 0, 0));
        identificacion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        identificacion.setForeground(new java.awt.Color(153, 153, 153));
        identificacion.setText("Digite Identificación");
        identificacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualización de Datos de *Inserte Nombre del Usuario*");

        Buscar.setBackground(new java.awt.Color(0, 0, 0));
        Buscar.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(204, 204, 204));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/search_30px.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarMouseExited(evt);
            }
        });

        Altura.setBackground(new java.awt.Color(0, 0, 0));
        Altura.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Altura.setForeground(new java.awt.Color(153, 153, 153));
        Altura.setText("Asignar Altura (cm)");
        Altura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
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

        hemoglobina.setBackground(new java.awt.Color(0, 0, 0));
        hemoglobina.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        hemoglobina.setForeground(new java.awt.Color(153, 153, 153));
        hemoglobina.setText("Niveles Hemoglobina");
        hemoglobina.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
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

        glucosa.setBackground(new java.awt.Color(0, 0, 0));
        glucosa.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        glucosa.setForeground(new java.awt.Color(153, 153, 153));
        glucosa.setText("Niveles Glucosa");
        glucosa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/add client/coughing_20px.png"))); // NOI18N

        Alergias.setBackground(new java.awt.Color(0, 0, 0));
        Alergias.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Alergias.setForeground(new java.awt.Color(153, 153, 153));
        Alergias.setText("Ingresar Alergias");
        Alergias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
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

        Peso.setBackground(new java.awt.Color(0, 0, 0));
        Peso.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        Peso.setForeground(new java.awt.Color(153, 153, 153));
        Peso.setText("Asignar Peso");
        Peso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/drop_of_blood_20px.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/add client/compare_heights_20px.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(glucosa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Buscar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hemoglobina, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Alergias, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar)
                    .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Alergias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hemoglobina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(glucosa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void identificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificacionMouseClicked
        identificacion.setText("");
    }//GEN-LAST:event_identificacionMouseClicked

    private void identificacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificacionMouseEntered
        identificacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 255, 51)));
    }//GEN-LAST:event_identificacionMouseEntered

    private void identificacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificacionMouseExited
        identificacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_identificacionMouseExited

    private void identificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identificacionKeyTyped
        if (identificacion.getText().equals("Usuario")) identificacion.setText(null);
    }//GEN-LAST:event_identificacionKeyTyped

    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
        Buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 255, 51)));
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
        Buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_BuscarMouseExited

    private void AlturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlturaMouseClicked
        Altura.setText("");
    }//GEN-LAST:event_AlturaMouseClicked

    private void AlturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlturaMouseEntered
        Altura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 255, 51)));
    }//GEN-LAST:event_AlturaMouseEntered

    private void AlturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlturaMouseExited
        Altura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_AlturaMouseExited

    private void AlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlturaKeyTyped
        if (Altura.getText().equals("Asignar Altura (cm)")) Altura.setText(null);
        if (!Character.isDigit(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_AlturaKeyTyped

    private void hemoglobinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hemoglobinaMouseClicked
        hemoglobina.setText("");
    }//GEN-LAST:event_hemoglobinaMouseClicked

    private void hemoglobinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hemoglobinaMouseEntered
        hemoglobina.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 255, 51)));
    }//GEN-LAST:event_hemoglobinaMouseEntered

    private void hemoglobinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hemoglobinaMouseExited
        hemoglobina.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_hemoglobinaMouseExited

    private void hemoglobinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hemoglobinaKeyTyped
        if (hemoglobina.getText().equals("Niveles Hemoglobina")) hemoglobina.setText(null);
    }//GEN-LAST:event_hemoglobinaKeyTyped

    private void glucosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glucosaMouseClicked
        glucosa.setText("");
    }//GEN-LAST:event_glucosaMouseClicked

    private void glucosaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glucosaMouseEntered
        glucosa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 255, 51)));
    }//GEN-LAST:event_glucosaMouseEntered

    private void glucosaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glucosaMouseExited
        glucosa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_glucosaMouseExited

    private void glucosaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_glucosaKeyTyped
        if (glucosa.getText().equals("Niveles Glucosa")) glucosa.setText(null);
    }//GEN-LAST:event_glucosaKeyTyped

    private void AlergiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlergiasMouseClicked
        Alergias.setText("");
    }//GEN-LAST:event_AlergiasMouseClicked

    private void AlergiasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlergiasMouseEntered
        Alergias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 255, 51)));
    }//GEN-LAST:event_AlergiasMouseEntered

    private void AlergiasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlergiasMouseExited
        Alergias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_AlergiasMouseExited

    private void AlergiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlergiasKeyTyped
        if (Alergias.getText().equals("Ingresar Alergias")) Alergias.setText(null);
    }//GEN-LAST:event_AlergiasKeyTyped

    private void PesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesoMouseClicked
        Peso.setText("");
    }//GEN-LAST:event_PesoMouseClicked

    private void PesoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesoMouseEntered
        Peso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 255, 51)));
    }//GEN-LAST:event_PesoMouseEntered

    private void PesoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesoMouseExited
        Peso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_PesoMouseExited

    private void PesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesoKeyTyped
        if (Peso.getText().equals("Asignar Peso")) Peso.setText(null);
        if (!Character.isDigit(evt.getKeyChar())) {evt.consume();}
    }//GEN-LAST:event_PesoKeyTyped

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_jLabel6MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alergias;
    private javax.swing.JTextField Altura;
    private javax.swing.JLabel Buscar;
    private javax.swing.JTextField Peso;
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
}
