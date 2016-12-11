
package boletin12.programacionej1;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class Garaje {
    protected int numeroCoches, capacidade = 5;

    public Garaje() {
    }
    
    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public void comprobarPlazas (){
        
        do {
        
        JOptionPane.showMessageDialog(null, "HAY " + (capacidade - numeroCoches)+ " PLAZAS DISPOÑIBLES");
        numeroCoches++;
        
        } while (numeroCoches < capacidade);
        
        JOptionPane.showMessageDialog(null, "PARKING COMPLETO");
    
}
}
    
    

