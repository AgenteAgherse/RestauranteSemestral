package Clases;

import java.util.Date;
public class Cliente extends Persona{
    private Date fecha;
    private String nombre;
    private int peso;
    private double altura;
    private double IMC;
    private int hemoglobina;
    private int glucosa;
    private Date fechaRegistro;
    private String alergias;
    
    public Cliente(){
        super();
        fecha = null;
        nombre = "";
        peso = 0;
        altura = 0;
        IMC = 0;
        hemoglobina = 0;
        glucosa = 0;
        alergias = "";
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public int getHemoglobina() {
        return hemoglobina;
    }

    public void setHemoglobina(int hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    public int getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(int glucosa) {
        this.glucosa = glucosa;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    
    
}
