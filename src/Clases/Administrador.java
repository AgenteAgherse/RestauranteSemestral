package Clases;

public class Administrador extends Persona{
    private String usuario;
    private String contraseña;
    private String cargo;
    
    public Administrador(){
        super();
        usuario = "";
        contraseña = "";
        cargo = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
