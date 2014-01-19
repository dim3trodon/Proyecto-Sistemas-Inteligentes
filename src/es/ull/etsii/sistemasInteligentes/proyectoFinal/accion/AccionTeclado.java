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

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class AccionTeclado implements Accion {
  
  private CombTeclas combTeclas;
  
  public AccionTeclado(CombTeclas combTeclas) {
    setCombTeclas(combTeclas);
  }

  @Override
  public void ejecutar() {
    try {
      Robot robot = new Robot();
      robot.delay(100);
      for(int i = 0; i < getNumKeyEvents(); i++) {
        robot.keyPress(getKeyEvent(i));
      }
      /*for(int i = getNumKeyEvents() - 1; i > 0;  i--) {
        robot.keyRelease(getKeyEvent(i));
      }*/
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyRelease(KeyEvent.VK_SHIFT);
      robot.keyRelease(KeyEvent.VK_ALT);
      robot.keyRelease(KeyEvent.VK_WINDOWS);
    } catch (AWTException e) {
      System.err.println("Error de Robot en AccionTeclado");
      e.printStackTrace();
    }
    
  }
  
  private int getNumKeyEvents() {
    return getCombTeclas().getNumKeyEvents();
  }
  
  private int getKeyEvent(int i) {
    return getCombTeclas().getKeyEvent(i);
  }

  private CombTeclas getCombTeclas() {
    return combTeclas;
  }

  private void setCombTeclas(CombTeclas combTeclas) {
    this.combTeclas = combTeclas;
  }

}
