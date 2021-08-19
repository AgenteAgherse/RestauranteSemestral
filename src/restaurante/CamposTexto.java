package restaurante;

public class CamposTexto {
    
    public CamposTexto(){}
    
    
    /*
        91,193,215 Azúl
        0,0,0 Negro
        255,255,255 Blanco
    */
    
    public void entrarJTextField(javax.swing.JTextField textField){
        textField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(91, 193, 215)));
    }
    
    public void salirJTextField(javax.swing.JTextField textField){
        textField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0,0,0)));
    }
    
    public void salirJLabel(javax.swing.JLabel label){
        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
    }
    
    public void entrarJLabel(javax.swing.JLabel label){
        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
    }
    
}
