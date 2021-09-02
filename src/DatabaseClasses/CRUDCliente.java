package DatabaseClasses;

import Clases.*;
import java.io.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class CRUDCliente {    
    private String ruta, separador;
    private File archivo;
    private String nombre, genero, alergias;
    
    public CRUDCliente(String ruta){
        this.ruta = ruta;
        this.separador = ";";
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

    public String getAlergias() {
        return alergias;
    }
    
    
    private String informacion(Cliente cli){
        return  cli.getNombre()+ separador
             + cli.getId() + separador
             + cli.getGenero() + separador
             + cli.getAlergias() + separador
             + cli.getHemoglobina() + separador
             + cli.getPeso() + separador
             + cli.getAltura() + separador
             + cli.getGlucosa() + separador
             + cli.getIMC();
    }
    
    public void AgregarCliente(Cliente niño) throws IOException {
        archivo = new File(getRuta());
        BufferedWriter escribir;

        if (archivo.exists()) {
            escribir = new BufferedWriter(new FileWriter(archivo, true));
            escribir.write(this.informacion(niño));
            escribir.newLine();
        } 
        else {    
            escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write(this.informacion(niño));
            escribir.newLine();
        }
        escribir.close();
    }
    
    
    public ArrayList<Cliente> array() throws FileNotFoundException, IOException{
        //Generación de variables.
        String valor = "";
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente cliente;
        BufferedReader buffer = new BufferedReader(new FileReader(getRuta()));
        
        while ((valor = buffer.readLine()) != null) {
            
            StringTokenizer datos = new StringTokenizer(valor, this.separador);
            
            while (datos.hasMoreElements()) {
                
                cliente = new Cliente();
                cliente.setNombre(datos.nextElement().toString());
                cliente.setId(Long.parseLong(datos.nextElement().toString()));
                cliente.setGenero(datos.nextElement().toString());
                cliente.setAlergias(datos.nextElement().toString());
                cliente.setHemoglobina(Integer.parseInt(datos.nextElement().toString()));
                cliente.setPeso(Integer.parseInt(datos.nextElement().toString()));
                cliente.setAltura(Double.parseDouble(datos.nextElement().toString()));
                cliente.setHemoglobina(Integer.parseInt(datos.nextElement().toString()));
                cliente.setIMC(Double.parseDouble(datos.nextElement().toString()));
                clientes.add(cliente);
                
            }
        }
        buffer.close();
        return clientes;
    } 
    
    public boolean buscarCliente(long id) throws IOException, FileNotFoundException{
        boolean condicion = false;
        ArrayList<Cliente> busqueda = array();
        for (int i = 0; i < busqueda.size(); i++) {
            if (id == busqueda.get(i).getId()) {
                nombre = busqueda.get(i).getNombre();
                genero = busqueda.get(i).getGenero();
                alergias = busqueda.get(i).getAlergias();
                condicion = true;
                break;
            }
        }
        return condicion;
    }
    
    public ArrayList<Cliente> buscarHistorial(long id) throws IOException{
        ArrayList<Cliente> buscar = array(), aux = new ArrayList<>();
        for (Cliente persona : buscar) {
            if (persona.getId() == id) {
                aux.add(persona);
            }
        }
        return aux;
    }
}

 

