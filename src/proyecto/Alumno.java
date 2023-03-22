package proyecto;
//Los alumnos constan de una cuenta, 
//nombre, carrera, clases cursadas, usuario para ingresar al sistema, password para ingesar 

import java.util.ArrayList;

//al sistema y un rol.
public class Alumno extends Usuario{
    private int cuenta;
    private String nombre, carrera;
    private ArrayList<Clase> clases = new ArrayList();
    private String rol;

    public Alumno() {
        super();
    }

    public Alumno(int cuenta, String nombre, String carrera, String rol, String usuario, String password) {
        super(usuario, password);
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
        this.rol = rol;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
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
