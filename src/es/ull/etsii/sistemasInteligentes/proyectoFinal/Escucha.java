/**
 * @author Fran Dioniz
 * @author Rodrigo Valladares Santana
 * 
 * @version 1.0
 *
 * Proyecto de Sistemas Inteligentes 2013/14
 * 
 */
package es.ull.etsii.sistemasInteligentes.proyectoFinal;

import javax.speech.recognition.ResultAdapter;
import javax.speech.recognition.ResultEvent;

public class Escucha extends ResultAdapter {
  
  public Escucha() {
    super();
    // TODO Poner aquí el main del ejemplo de JSapi
  }
  
  public String escuchar() {
    // TODO
    // Este método llama a resultAccepted y devuelve la palabra reconocida
    // como un String
    return null;
  }
  
  @Override
  /**
   * No llamar a este método directamente
   */
  public void resultAccepted(ResultEvent re) {
    // TODO
  }

}
