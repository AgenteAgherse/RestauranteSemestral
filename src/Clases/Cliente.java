package Clases;

import java.util.Date;
public class Cliente extends Persona{
    private Date fecha;
    private String nombre;
    private double peso;
    private double altura;
    private double IMC;
    private int hemoglobina;
    private int glucosa;
    
    public Cliente(){
        super();
        fecha = null;
        nombre = "";
        peso = 0;
        altura = 0;
        IMC = 0;
        hemoglobina = 0;
        glucosa = 0;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
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
    
}
