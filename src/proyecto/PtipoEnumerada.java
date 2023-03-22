package proyecto;

import java.io.Serializable;
import java.util.ArrayList;

public class PtipoEnumerada extends Preguntas implements Serializable{
    ArrayList<String> respuestas = new ArrayList();

    public PtipoEnumerada() {
        super();
    }

    public PtipoEnumerada(String pregunta, boolean respuesta) {
        super(pregunta, respuesta);
    }

    

    public ArrayList<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<String> respuestas) {
        this.respuestas = respuestas;
    }

    @Override
    public String toString() {
        return super.getPregunta();
    }
    
    
}
