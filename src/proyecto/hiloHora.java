package proyecto;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JLabel;

public class hiloHora extends Thread{
    private JLabel hora, hhora, hhhora;
    private int duracion;
    private boolean terminar;

    public hiloHora(JLabel hora, JLabel hhora, JLabel hhhora, int duracion, boolean terminar) {
        this.hora = hora;
        this.hhora = hhora;
        this.hhhora = hhhora;
        this.duracion = duracion;
        this.terminar = terminar;
    }

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }

    public JLabel getHhora() {
        return hhora;
    }

    public void setHhora(JLabel hhora) {
        this.hhora = hhora;
    }

    public JLabel getHhhora() {
        return hhhora;
    }

    public void setHhhora(JLabel hhhora) {
        this.hhhora = hhhora;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isTerminar() {
        return terminar;
    }

    public void setTerminar(boolean terminar) {
        this.terminar = terminar;
    }

    


    
    
    

    public void run() {
        int mama = duracion;
        DateFormat f=new SimpleDateFormat("hh:mm:ss");
        f.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        while(true){
            if(terminar){
                
            }
            
            Date h=new Date(mama);
            String ha = f.format(h);
            hora.setText(ha);
            hhora.setText(ha);
            hhhora.setText(ha);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
            mama -= 1000;
            if(mama <= 0){
                terminar = false;
            }
        }        
    }
}
