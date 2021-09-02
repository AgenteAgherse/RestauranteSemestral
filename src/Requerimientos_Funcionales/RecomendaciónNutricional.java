package Requerimientos_Funcionales;

import Clases.Cliente;
import DatabaseClasses.CRUDCliente;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import restaurante.CamposTexto;

public class RecomendaciónNutricional extends javax.swing.JPanel {

    private CamposTexto txt = new CamposTexto();
    private boolean actualizar = false;
    private String ruta = System.getProperty("user.dir") + "\\src\\DatabaseClasses\\Clientes.txt";
    private String usuario = "", contraseña = "";
    private CRUDCliente clientes = new CRUDCliente(ruta);
    private long id = 0;
    public RecomendaciónNutricional() {
        initComponents();
        jTextArea1.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoResto1 = new restaurante.FondoResto();
        identificacion = new javax.swing.JTextField();
        resultados = new javax.swing.JLabel();
        Buscar = new javax.swing.JLabel();
        smiley = new javax.swing.JLabel();
        neutral = new javax.swing.JLabel();
        bad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        identificacion.setBackground(new java.awt.Color(246, 246, 246));
        identificacion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        identificacion.setForeground(new java.awt.Color(51, 51, 51));
        identificacion.setText("Digite Identificación");
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

        resultados.setBackground(new java.awt.Color(0, 0, 0));
        resultados.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        resultados.setForeground(new java.awt.Color(51, 51, 51));
        resultados.setText("Informe de *Inserte Nombre del Usuario*");

        Buscar.setBackground(new java.awt.Color(0, 0, 0));
        Buscar.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(51, 51, 51));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/search_30px.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
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

        smiley.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/recommendation/smiling_90px.png"))); // NOI18N

        neutral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/recommendation/neutral_90px.png"))); // NOI18N

        bad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/recommendation/sad_90px.png"))); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(246, 246, 246));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 11)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Aquí se verá reflejado el texto de los resultados.");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout fondoResto1Layout = new javax.swing.GroupLayout(fondoResto1);
        fondoResto1.setLayout(fondoResto1Layout);
        fondoResto1Layout.setHorizontalGroup(
            fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoResto1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(bad)
                        .addGap(44, 44, 44)
                        .addComponent(neutral)
                        .addGap(41, 41, 41)
                        .addComponent(smiley))
                    .addComponent(resultados)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        fondoResto1Layout.setVerticalGroup(
            fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoResto1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar)
                    .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(smiley)
                    .addComponent(neutral)
                    .addComponent(bad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoResto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoResto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void identificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificacionMouseClicked
        identificacion.setText("");
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
        txt.entrarJLabel(Buscar);
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
        txt.salirJLabel(Buscar);
    }//GEN-LAST:event_BuscarMouseExited

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        long id = Long.parseLong(identificacion.getText());
        try {
            if (!clientes.buscarCliente(id)) {
                JOptionPane.showMessageDialog(null, "Persona sin agregar en la base");
                actualizar = false;
            }
            else{
                resultados.setText("Actualización de Datos de " + clientes.getNombre());
                actualizar = true;
                this.id = id;
                ArrayList<Cliente> cli = clientes.buscarHistorial(id);
                int puntuacion = comparar(cli);
                if (puntuacion == 0) {
                    neutral.setVisible(true);
                    bad.setVisible(false);
                    smiley.setVisible(false);
                }
                else if (puntuacion < 0) {
                    neutral.setVisible(false);
                    bad.setVisible(true);
                    smiley.setVisible(false);
                }
                else{
                    neutral.setVisible(false);
                    bad.setVisible(false);
                    smiley.setVisible(true);
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_BuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JLabel bad;
    private restaurante.FondoResto fondoResto1;
    private javax.swing.JTextField identificacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel neutral;
    private javax.swing.JLabel resultados;
    private javax.swing.JLabel smiley;
    // End of variables declaration//GEN-END:variables

    private int comparar(ArrayList<Cliente> cliente) {
        int tam = cliente.size();
        Cliente per = cliente.get(tam-1);
        String mensaje = "Estado de " + cliente.get(tam-1).getNombre() + "\n";
        int puntuacion = 0;
        if (per.getIMC() >= 18.5 && per.getIMC() < 24.9){
            mensaje += "Peso ideal! \n";
            puntuacion++;
        }
        else if (cliente.get(tam-1).getIMC() < 18.5) {
            puntuacion--;
            mensaje += "Tienes peso por debajo de lo ideal. \n";
        }
        else{
            puntuacion--;
            mensaje += "Tienes peso por encima de lo ideal. \n";
        }
        if (per.getGenero().equals("Másculino")) {
            if (per.getHemoglobina() >= 13.2 && per.getHemoglobina() <= 16.6) {
                puntuacion++;
                mensaje += "Hemoglobina a niveles normales! \n";
            }
            else{
                puntuacion--;
                mensaje += "Hemoglobina a niveles fuera de lo normal \n";
            }
        }
        else{
            if (per.getHemoglobina() >= 13.2 && per.getHemoglobina() <= 15) {
                puntuacion--;
                mensaje += "Hemoglobina a niveles normales! \n";
            }
            else{
                puntuacion--;
                mensaje += "Hemoglobina a niveles fuera de lo normal \n";
            }
        }
        if (per.getGlucosa() < 70) {
            mensaje += "Tiene hipoglucemia. Debe ir al médico!\n";
            puntuacion--;
        }
        else if (per.getGlucosa() >= 70 && per.getGlucosa() < 80) {
            mensaje += "Tiene altas probabilidades de tener \nhipoglucemia. Debe ir al médico!\n";
            puntuacion--;
        }
        else if (per.getGlucosa() >= 80 && per.getGlucosa() <= 115) {
            mensaje += "Tiene niveles normales de glucosa!\n";
            puntuacion++;
        }
        else if (per.getGlucosa() > 115 && per.getGlucosa() < 180) {
            mensaje += "Tiene prediabetes o diabetes mal tratada. Debe ir al médico para\nmás información.\n";
            puntuacion--;
        }
        else{
            mensaje += "Tiene diabetes!\n";
            puntuacion--;
        }
        jTextArea1.setText(mensaje);
        return puntuacion;
    }
}
