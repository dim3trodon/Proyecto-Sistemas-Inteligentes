/**
 * @author Fran Dioniz
 * @author Rodrigo Valladares Santana
 * 
 * @version 1.0
 *
 * Proyecto de Sistemas Inteligentes 2013/14
 * 
 */
package es.ull.etsii.sistemasInteligentes.proyectoFinal.accion;

import java.io.IOException;

public class AccionTerminal implements Accion {
  
  private String comandoTerminal;
  
  public AccionTerminal(String comandoTerminal) {
    setComandoTerminal(comandoTerminal);
  }

  @Override
  public void ejecutar() {
    // TODO Auto-generated method stub
    try {
      Runtime.getRuntime().exec(getComandoTerminal());
    } catch (IOException e) {
      System.err.println("Error al ejecutar " + getComandoTerminal());
    }
  }

  private String getComandoTerminal() {
    return comandoTerminal;
  }

  private void setComandoTerminal(String comandoTerminal) {
    this.comandoTerminal = comandoTerminal;
  }

}
