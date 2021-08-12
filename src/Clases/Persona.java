package Clases;

public class Persona {
    private String nombre;
    private String genero;
    
    public Persona(){
        nombre = "";
        genero = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
