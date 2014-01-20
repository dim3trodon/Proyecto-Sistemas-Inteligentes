package es.ull.etsii.sistemasInteligentes.proyectoFinal.accion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import es.ull.etsii.sistemasInteligentes.proyectoFinal.MetodosKeyEvent;

public class AccionEscribir implements Accion {
  
  private CombTeclas teclas;
  
  public AccionEscribir(String palabra) {
    setTeclas(new CombTeclas(MetodosKeyEvent.stringToVectorKeyEvent(palabra)));
    getTeclas().addKeyEvent(KeyEvent.VK_CONTROL);
    getTeclas().addKeyEvent(KeyEvent.VK_ENTER);
  }

  @Override
  public void ejecutar() {
    Robot robot;
    try {
      robot = new Robot();
      robot.delay(100);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyRelease(KeyEvent.VK_SHIFT);
      robot.keyRelease(KeyEvent.VK_ALT);
      robot.keyRelease(KeyEvent.VK_WINDOWS);
      for(int i = 0; i < getNumeroTeclas(); i++)
        robot.keyPress(getTecla(i));
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyRelease(KeyEvent.VK_SHIFT);
      robot.keyRelease(KeyEvent.VK_ALT);
      robot.keyRelease(KeyEvent.VK_WINDOWS);
    } catch (AWTException e) {
      System.err.println("Error en robot de AccionEscribir");
      e.printStackTrace();
    }
  }
  
  private int getTecla(int i) {
    return getTeclas().getKeyEvent(i);
  }
  
  private int getNumeroTeclas() {
    return getTeclas().getNumKeyEvents();
  }

  private CombTeclas getTeclas() {
    return teclas;
  }

  private void setTeclas(CombTeclas teclas) {
    this.teclas = teclas;
  }

}
