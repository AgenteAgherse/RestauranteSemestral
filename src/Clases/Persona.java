package Clases;

import java.util.Date;
public class Persona {
    protected String nombre;
    protected String genero;
    protected Date fechaCumpleaños;
    protected long id;
    
    public Persona(){
        nombre = "";
        genero = "";
        fechaCumpleaños = new Date();
        id = 0;
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

    public Date getFechaCumpleaños() {
        return fechaCumpleaños;
    }

    public void setFechaCumpleaños(Date fechaCumpleaños) {
        this.fechaCumpleaños = fechaCumpleaños;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    
    
}
