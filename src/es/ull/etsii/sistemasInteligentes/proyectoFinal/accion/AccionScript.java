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

public class AccionScript implements Accion {
  
  private String nombreScript;
  
  public AccionScript(String nombreScript) {
    setNombreScript(nombreScript);
  }

  @Override
  public void ejecutar() {
    // TODO Auto-generated method stub
    try {
      String comando = "scripts/" + getNombreScript();
      System.out.println("En terminal " + comando);
      Runtime.getRuntime().exec(comando);
    } catch (IOException e) {
      System.err.println("Error al ejecutar \"" + getNombreScript()
          + "\" en AccionTerminal");
      e.printStackTrace();
    }
  }

  @Override
  public String toString() {
    return "AccionScript " + getNombreScript();
  }

  private String getNombreScript() {
    return nombreScript;
  }

  private void setNombreScript(String nombreScript) {
    this.nombreScript = nombreScript;
  }

}
