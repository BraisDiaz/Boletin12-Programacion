
package boletin12.programacionej1;

/**
 *
 * @author Brais Núñez
 */
public class Boletin12ProgramacionEj1 {

    public static void main(String[] args) {
        
        Coche coche1 = new Coche ("12345-A");
        Coche coche2 = new Coche ("54321-B");
        coche1.setTempo(3);
        coche2.setTempo(5);
        coche1.calcularPrezo();
        coche2.calcularPrezo();
       
    }
    
}
