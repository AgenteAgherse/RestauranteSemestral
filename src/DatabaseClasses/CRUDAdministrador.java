package DatabaseClasses;

import Clases.Administrador;
import Clases.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CRUDAdministrador {
    
    private String ruta, separador, nombre, genero;
    private File archivo;
    public CRUDAdministrador(String ruta){
        this.ruta = ruta;
        this.separador = ";";
        this.nombre = "";
        this.genero = "";
    }
    
    public String getRuta(){
        return ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
    
    private String informacion(Administrador admin){
        return admin.getUsuario() + separador
             + admin.getNombre() + separador
             + admin.getContraseña() + separador
             + admin.getGenero() + separador
             + admin.getCargo();
    }
    
    public void AgregarAdministrador(Administrador administrado) throws IOException {
        archivo = new File(getRuta());
        BufferedWriter escribir;

        if (archivo.exists()) {
            escribir = new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(this.informacion(administrado));
            escribir.newLine();
        } 
        else {    
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(this.informacion(administrado));
            escribir.newLine();
        }
        escribir.close();
    }
    
    
    public ArrayList<Administrador> array() throws FileNotFoundException, IOException{
        //Generación de variables.
        String valor = "";
        ArrayList<Administrador> administradores = new ArrayList<>();
        Administrador administrador;
        BufferedReader buffer = new BufferedReader(new FileReader(getRuta()));
        
        while ((valor = buffer.readLine()) != null) {
            
            StringTokenizer datos = new StringTokenizer(valor, this.separador);
            
            while (datos.hasMoreElements()) {
                
                administrador = new Administrador();
                administrador.setUsuario(datos.nextElement().toString());
                administrador.setNombre(datos.nextElement().toString());
                administrador.setContraseña(datos.nextElement().toString());
                administrador.setGenero(datos.nextElement().toString());
                administrador.setCargo(datos.nextElement().toString());
                administradores.add(administrador);
            }
        }
        buffer.close();
        return administradores;
    } 
    
    public boolean buscarAdministrador(String usu, String contra) throws IOException, FileNotFoundException{
        boolean condicion = false;
        ArrayList<Administrador> busqueda = array();
        for (int i = 0; i < busqueda.size(); i++) {
            if (busqueda.get(i).getUsuario().equals(usu) && busqueda.get(i).getContraseña().equals(contra)) {
                condicion = true;
                nombre = busqueda.get(i).getNombre();
                genero = busqueda.get(i).getGenero();
                break;
            }
        }
        return condicion;
    }
    
}
