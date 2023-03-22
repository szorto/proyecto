package proyecto;

import java.io.Serializable;

public class PtipoVerdaderoFalso extends Preguntas implements Serializable{
    private boolean ver;

    public PtipoVerdaderoFalso() {
        super();
    }

    public PtipoVerdaderoFalso(boolean ver, String pregunta, boolean respuesta) {
        super(pregunta, respuesta);
        this.ver = ver;
    }

    

    public boolean isVer() {
        return ver;
    }

    public void setVer(boolean ver) {
        this.ver = ver;
    }

    @Override
    public String toString() {
        return super.getPregunta();
    }
    
    
    
    
}
