package proyecto;

import java.io.Serializable;


public class Preguntas implements Serializable{
    protected String pregunta;
    protected boolean respuesta;

    public Preguntas() {
    }

    public Preguntas(String pregunta, boolean respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    

    @Override
    public String toString() {
        return "Preguntas{" + "pregunta=" + pregunta + '}';
    }
    
    
}
