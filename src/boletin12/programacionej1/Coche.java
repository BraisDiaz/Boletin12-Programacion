
package boletin12.programacionej1;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class Coche extends Garaje{
    
  protected float prezo1, prezo2;  
  protected String matricula;
  protected int tempo;

  public Coche(String matricula){

    this.matricula=matricula;
    numeroCoches++;

    }
  public Coche(){
    numeroCoches++;
    }
  public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
  public void setTempo(int tempo) {
        this.tempo = tempo;
    }
  public int getTempo() {
        return tempo;
    }
  public String getMatricula() {
        return matricula;
    }
  public void calcularPrezo(){

   if (tempo<3){ 

     JOptionPane.showMessageDialog(null,"O vehículo de matrícula " + matricula + " debe aboar " + (0.50 * tempo)+ " €, xa que estivo " + tempo + " horas no parking.");

     prezo1 = Float.parseFloat (JOptionPane.showInputDialog(" Introducir o importe debido ")); 

     JOptionPane.showMessageDialog(null,"O seu cambio é de " + (prezo1 - (0.50 * tempo)) + " , grazas pola súa visita ");

     }   else {      

     JOptionPane.showMessageDialog(null,"O vehículo de matrícula " + matricula + " debe aboar " + (1.5) + ((0.20) * (tempo)) + " €, xa que estivo " + tempo + " horas no parking.");

     prezo2 = Float.parseFloat (JOptionPane.showInputDialog(" Introducir o importe debido "));

     JOptionPane.showMessageDialog(null, "O seu cambio é de " + (prezo2 - (1.5 + (0.20 * tempo))) + " , grazas pola súa visita ");

    }
  }
}

