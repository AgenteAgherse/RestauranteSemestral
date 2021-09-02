package Requerimientos_Funcionales;

import Clases.Cliente;
import DatabaseClasses.CRUDCliente;
import DatabaseClasses.Dishes;
import DatabaseClasses.Platillos;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import restaurante.CamposTexto;
import javax.swing.table.DefaultTableModel;

public class HistorialCliente extends javax.swing.JPanel {

    private CamposTexto txt = new CamposTexto();
    private Platillos p = new Platillos();
    private ArrayList<Dishes> platos = p.getPlatos();
    private String ruta = System.getProperty("user.dir") + "\\src\\DatabaseClasses\\Clientes.txt";
    private String usuario = "", contraseña = "";
    private CRUDCliente clientes = new CRUDCliente(ruta);
    private boolean actualizar = false;
    private long id = 0;
    private DefaultTableModel tabla, platillos;
    
    public HistorialCliente(String usuario, String contraseña) {
        initComponents();
        this.usuario = usuario;
        this.contraseña = contraseña;
        tabla = (DefaultTableModel) historial.getModel();
        platillos = (DefaultTableModel) Platillos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoResto1 = new restaurante.FondoResto();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        historial = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Platillos = new javax.swing.JTable();
        Buscar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jTextField2.setBackground(new java.awt.Color(246, 246, 246));
        jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setText("Digite Identificación");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField2MouseExited(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        historial.setBackground(new java.awt.Color(246, 246, 246));
        historial.setForeground(new java.awt.Color(51, 51, 51));
        historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Actualización", "Peso", "Altura", "IMC", "Hemoglobina", "Glucosa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(historial);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Historial de Cambios de *Inserte Nombre del Usuario*");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Platillos Recomendados");

        Platillos.setBackground(new java.awt.Color(246, 246, 246));
        Platillos.setForeground(new java.awt.Color(51, 51, 51));
        Platillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Ingredientes", "Calorias", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Platillos);

        Buscar.setBackground(new java.awt.Color(0, 0, 0));
        Buscar.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(51, 51, 51));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante/images/common/search_30px.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
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

        javax.swing.GroupLayout fondoResto1Layout = new javax.swing.GroupLayout(fondoResto1);
        fondoResto1.setLayout(fondoResto1Layout);
        fondoResto1Layout.setHorizontalGroup(
            fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoResto1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buscar))
                    .addComponent(jLabel2)
                    .addGroup(fondoResto1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        fondoResto1Layout.setVerticalGroup(
            fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoResto1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoResto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
        txt.entrarJLabel(Buscar);
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
        txt.salirJLabel(Buscar);
    }//GEN-LAST:event_BuscarMouseExited

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseEntered
        txt.entrarJTextField(jTextField2);
    }//GEN-LAST:event_jTextField2MouseEntered

    private void jTextField2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseExited
        txt.salirJTextField(jTextField2);
    }//GEN-LAST:event_jTextField2MouseExited

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if (jTextField2.getText().equals("Usuario")) jTextField2.setText(null);
    }//GEN-LAST:event_jTextField2KeyTyped

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
                long id = Long.parseLong(jTextField2.getText());
        try {
            if (!clientes.buscarCliente(id)) {
                JOptionPane.showMessageDialog(null, "Persona sin agregar en la base");
                actualizar = false;
            }
            else{
                jLabel1.setText("Actualización de Datos de " + clientes.getNombre());
                actualizar = true;
                this.id = id;
                ArrayList<Cliente> persona = clientes.buscarHistorial(id);
                double calorias = llenarTablaHistorial(persona);
                llenarTablaPlatillos(calorias/3);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_BuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JTable Platillos;
    private restaurante.FondoResto fondoResto1;
    private javax.swing.JTable historial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private double llenarTablaHistorial(ArrayList<Cliente> per){
        tabla.setRowCount(per.size());
        int i = 0;
        for (Cliente cliente : per) {
            historial.setValueAt((i+1) + " vez", i, 0);
            historial.setValueAt(cliente.getPeso(), i, 1);
            historial.setValueAt(cliente.getAltura(), i, 2);
            historial.setValueAt(cliente.getIMC(), i, 3);
            historial.setValueAt(cliente.getHemoglobina(), i, 4);
            historial.setValueAt(cliente.getGlucosa(), i, 5);
            i++;
        }
        int edad = 10;
        Cliente cli = per.get(i-1);
        return 370 + 21.6 * cli.getPeso();
    }
    
    private void llenarTablaPlatillos(double calorias){
        int i = 0;
        platillos.setRowCount(5);
        for (Dishes plato : platos) {
            if (calorias >= plato.getCalorias()) {
                Platillos.setValueAt(plato.getNombre(), i, 0);
                Platillos.setValueAt(plato.getIngredientes(), i, 1);
                Platillos.setValueAt(plato.getCalorias(), i, 2);
                Platillos.setValueAt(plato.getPrecio(), i, 3);
                i++;
            }
        }
    }
}
