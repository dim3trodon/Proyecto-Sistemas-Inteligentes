/**
 * @author Fran Dioniz
 * @author Rodrigo Valladares Santana
 * 
 * @version 1.0
 *
 * Proyecto de Sistemas Inteligentes 2013/14
 * 
 * Almacena un vector de KeyEvent (Integer) que representan pulsaciones del
 * teclado.
 * 
 */
package es.ull.etsii.sistemasInteligentes.proyectoFinal;

import java.util.Vector;

public class CombTeclas {
  private Vector<Integer> keyEvents;
  
  public CombTeclas() {
    setKeyEvents(new Vector<Integer>());
  }
  
  public CombTeclas(Vector<Integer> keyEvents) {
    setKeyEvents(keyEvents);
  }
  
  public int getNumKeyEvents() {
    return getKeyEvents().size();
  }
  
  public int getKeyEvent(int i) {
    return getKeyEvents().get(i);
  }
  
  public void addKeyEvent(int keyEvent) {
    getKeyEvents().add(keyEvent);
  }
  
  private Vector<Integer> getKeyEvents() {
    return keyEvents;
  }

  private void setKeyEvents(Vector<Integer> keyEvents) {
    this.keyEvents = keyEvents;
  }

}
