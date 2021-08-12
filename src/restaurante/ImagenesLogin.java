package restaurante;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Random;

public class ImagenesLogin extends javax.swing.JPanel {
    ArrayList<String> rutas = new ArrayList<>();
    public ImagenesLogin() {
        initComponents();
        rutas.add("/Imágenes_Login/EnsaladaLogin.jpg");
        rutas.add("/Imágenes_Login/EnsaladaNuevaLogin.jpg");
        rutas.add("/Imágenes_Login/ArrozPollo.jpg");
        rutas.add("/Imágenes_Login/EnsaladaTomate.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void paint(Graphics g){
        Random r = new Random();
        int pos = r.nextInt(4);
        String ruta = rutas.get(pos);
        
        Dimension dimension = this.getSize();
        ImageIcon fondo = new ImageIcon(getClass().getResource(ruta));
        g.drawImage(fondo.getImage(), 0, 0, dimension.width, dimension.height, this);
        this.setOpaque(false);
        super.paintChildren(g);
    }
}
