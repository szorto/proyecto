package proyecto;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminClase {
    private ArrayList<Clase> clase = new ArrayList();
    private File archivo = null;

    public AdminClase() {
    }
    
    public AdminClase(String path) {
        archivo = new File(path);
    }

    public ArrayList<Clase> getClase() {
        return clase;
    }

    public void setClase(ArrayList<Clase> clase) {
        this.clase = clase;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setClases(Clase a){
        clase.add(a);
    }

    @Override
    public String toString() {
        return "AdminClase{" + "clase=" + clase + ", archivo=" + archivo + '}';
    }
    
    public void cargarArchivo() {
        try {            
            clase = new ArrayList();
            Clase temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto  = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Clase) objeto.readObject()) != null) {
                        clase.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Clase t : clase) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
