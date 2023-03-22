package proyecto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Examen implements Serializable{
    private Date fecha, hora;
    private int duracion;
    private ArrayList<Preguntas> listaPreguntas = new ArrayList();
    
//    i lo desea pueda modificar, la fecha, hora, duración, o cualquiera de las preguntas del
//examen.

    public Examen() {
    }

    public Examen(Date fecha, Date hora, int duracion) {
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Preguntas> getListaPreguntas() {
        return listaPreguntas;
    }

    public void setListaPreguntas(Preguntas e) {
        listaPreguntas.add(e);
    }

    @Override
    public String toString() {
        
        return "Examen - Duracion " + duracion;
    }
    
    
}
