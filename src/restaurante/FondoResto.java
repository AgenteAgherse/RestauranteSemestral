package restaurante;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class FondoResto extends javax.swing.JPanel {

    public FondoResto() {
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void paint(Graphics g){        
        Dimension dimension = this.getSize();
        ImageIcon fondo = new ImageIcon(getClass().getResource("/restaurante/images/Fondo.png"));
        g.drawImage(fondo.getImage(), 0, 0, dimension.width, dimension.height, this);
        this.setOpaque(false);
        super.paintChildren(g);
    }
}
