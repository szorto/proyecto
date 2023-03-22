package proyecto;

import java.io.Serializable;

public class PseleccionMultiple extends Preguntas implements Serializable{
    private boolean preg1, preg2, preg3, preg4;
    private String pregg1, pregg2, pregg3, pregg4;

    public PseleccionMultiple() {
        super();
    }

    public PseleccionMultiple(boolean preg1, boolean preg2, boolean preg3, boolean preg4, String pregg1, String pregg2, String pregg3, String pregg4, String pregunta, boolean respuesta) {
        super(pregunta, respuesta);
        this.preg1 = preg1;
        this.preg2 = preg2;
        this.preg3 = preg3;
        this.preg4 = preg4;
        this.pregg1 = pregg1;
        this.pregg2 = pregg2;
        this.pregg3 = pregg3;
        this.pregg4 = pregg4;
    }

    

    

    public boolean isPreg1() {
        return preg1;
    }

    public void setPreg1(boolean preg1) {
        this.preg1 = preg1;
    }

    public boolean isPreg2() {
        return preg2;
    }

    public void setPreg2(boolean preg2) {
        this.preg2 = preg2;
    }

    public boolean isPreg3() {
        return preg3;
    }

    public void setPreg3(boolean preg3) {
        this.preg3 = preg3;
    }

    public boolean isPreg4() {
        return preg4;
    }

    public void setPreg4(boolean preg4) {
        this.preg4 = preg4;
    }

    public String getPregg1() {
        return pregg1;
    }

    public void setPregg1(String pregg1) {
        this.pregg1 = pregg1;
    }

    public String getPregg2() {
        return pregg2;
    }

    public void setPregg2(String pregg2) {
        this.pregg2 = pregg2;
    }

    public String getPregg3() {
        return pregg3;
    }

    public void setPregg3(String pregg3) {
        this.pregg3 = pregg3;
    }

    public String getPregg4() {
        return pregg4;
    }

    public void setPregg4(String pregg4) {
        this.pregg4 = pregg4;
    }
    
    

    @Override
    public String toString() {
        return super.getPregunta();
    }
    
    
}
