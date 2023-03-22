package proyecto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;



//Las clases constan de un ID, nombre de la 
//clase, hora, unidades valorativas, semestre, periodo, año
public class Clase implements Serializable{
    ArrayList<Alumno> alu = new ArrayList();
    private int id;
    private String nombre, uv, semestre, periodo, anio;
    private Date hora;
    ArrayList<Examen> examen = new ArrayList();
    
    private static final long SerialVersionUID=776L;

    public Clase() {
    }

    public Clase(int id, String nombre, Date hora, String uv, String semestre, String periodo, String anio) {
        this.id = id;
        this.nombre = nombre;
        this.hora = hora;
        this.uv = uv;
        this.semestre = semestre;
        this.periodo = periodo;
        this.anio = anio;
    }

    public ArrayList<Alumno> getAlu() {
        return alu;
    }

    public void setAlu(ArrayList<Alumno> alu) {
        this.alu = alu;
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

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public ArrayList<Examen> getExamen() {
        return examen;
    }

    public void setExamen(ArrayList<Examen> examen) {
        this.examen = examen;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
}
