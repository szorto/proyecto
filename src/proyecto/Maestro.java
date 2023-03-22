package proyecto;

import java.util.ArrayList;

//ID, nombre, 
//Profesión,  sueldo,  usuario para ingresar al sistema, password para ingresar al sistema, 
//rol.

public class Maestro extends Usuario{
    private ArrayList<Clase> clase = new ArrayList();
    private int id;
    private String nombre;
    private int sueldo;
    private String rol;

    public Maestro() {
        super();
    }

    public Maestro(int id, String nombre, int sueldo, String rol, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.rol = rol;
    }

    public ArrayList<Clase> getClase() {
        return clase;
    }

    public void setClase(ArrayList<Clase> clase) {
        this.clase = clase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
