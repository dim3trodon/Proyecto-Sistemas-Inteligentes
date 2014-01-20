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

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class Control {
  
  private Escucha escucha;
  private ListaComandos listaComandos;
  private boolean chromeAbierto;
  private int numeroVentanasAbiertas;
  private int numeroTabsAbiertos;
  public static Interfaz interfaz;
  
  public Control(Interfaz interfaz) {
    // Se le pasa a Escucha la referencia a Control para que Escucha pueda
    // llamar a Control
    setEscucha(new Escucha(this));
    setListaComandos(ConstructorListaComandos.crearListaComandos());
    setNumeroVentanasAbiertas(0);
    setNumeroTabsAbiertos(0);
    setChromeAbierto(false);
    Control.interfaz = interfaz;
  }
  
  public void iniciarEscucha() {
    getEscucha().iniciar();
  }
  
  public void pararEscucha() {
    getEscucha().parar();
  }
  
  public void ejecutarComando(String comando) {
    // Llamar a la clase ListaComandos, donde se encuentran todos los comandos
    // que se pueden ejecutar en el programa, y ejecutar el método
    // buscar(String): Accion, que recibe un comando y devuelve una
    // Accion que puede ser la ejecución de un script o
    // de una combinación de teclas
    System.out.println("> " + comando);
    interfaz.actualizarTexto(comando);
    if (comando.matches("\\s*abrir\\s*chrome\\s*")) {
      if(!isChromeAbierto()) {
        setChromeAbierto(true);
        aumentarNumeroVentanasAbiertas();
        getListaComandos().buscar(comando).ejecutar();
      } else {
        System.out.println("Chrome ya está abierto");
      }
    } else if (isChromeAbierto()) {
      if (comando.matches("\\s*nueva\\s*ventana\\s*")) {
        aumentarNumeroVentanasAbiertas();
        getListaComandos().buscar(comando).ejecutar();
        System.out.println(" > " + getNumeroVentanasAbiertas() + " ventanas");
      } else if (comando.matches("\\s*cerrar\\s*ventana\\s*")) {
        reducirNumeroVentanasAbiertas();
        if (getNumeroVentanasAbiertas() <= 0)
          setChromeAbierto(false);
        getListaComandos().buscar(comando).ejecutar();
        System.out.println(" > " + getNumeroVentanasAbiertas() + " ventanas");
      } else if (comando.matches("\\s*nuevo\\s*tab\\s*")) {
        aumentarNumeroTabsAbiertos();
        getListaComandos().buscar(comando).ejecutar();
        System.out.println(" > " + getNumeroTabsAbiertos() + " tabs");
      } else if (comando.matches("\\s*cerrar\\s*tab\\s*")) {
        reducirNumeroTabsAbiertos();
        // TODO Mirar número de tabs abiertos en cada ventana
        //if (getNumeroTabsAbiertos() <= 0)
          //setChromeAbierto(false);
        getListaComandos().buscar(comando).ejecutar();
        System.out.println(" > " + getNumeroTabsAbiertos() + " tabs");
      } else if (comando.matches("\\s*entrar\\s*a\\s+.+")) {
        String[] palabras = comando.split("\\s+");
        getListaComandos().buscar("entrar a").ejecutar();
        ejecutarComando(palabras[palabras.length - 1]);
      } else if (comando.matches("\\s*marcador\\s*\\d")) {
        String[] palabras = comando.split("\\s+");
        System.err.println("Marcador");
        int numMarcador = Integer.parseInt(palabras[palabras.length - 1]) - 1;
        getListaComandos().buscar("marcador").ejecutar();
        Robot robot;
        try {
          robot = new Robot();
          robot.delay(100);
          for (int i = 0; i < numMarcador; i++) {
            robot.keyPress(KeyEvent.VK_RIGHT);
          }
          robot.keyPress(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
          e.printStackTrace();
        }
      } else {
        getListaComandos().buscar(comando).ejecutar();
      }
    } else {
      if (!comando.matches("\\s*terminar\\s*programa\\s*"))
        System.err.println("Chrome no está abierto");
      else {
        System.out.println("Adiós");
        getListaComandos().buscar(comando).ejecutar();
      }
    }
  }
  
  private void setEscucha(Escucha escucha) {
    this.escucha = escucha;
  }

  private Escucha getEscucha() {
    return escucha;
  }

  private ListaComandos getListaComandos() {
    return listaComandos;
  }

  private void setListaComandos(ListaComandos listaComandos) {
    this.listaComandos = listaComandos;
  }

  private boolean isChromeAbierto() {
    return chromeAbierto;
  }

  private void setChromeAbierto(boolean chromeAbierto) {
    this.chromeAbierto = chromeAbierto;
  }

  private void aumentarNumeroVentanasAbiertas() {
    setNumeroVentanasAbiertas(getNumeroVentanasAbiertas() + 1);
  }
  
  private void reducirNumeroVentanasAbiertas() {
    setNumeroVentanasAbiertas(getNumeroVentanasAbiertas() - 1);
  }

  private int getNumeroVentanasAbiertas() {
    return numeroVentanasAbiertas;
  }

  private void setNumeroVentanasAbiertas(int numeroVentanasAbiertas) {
    this.numeroVentanasAbiertas = numeroVentanasAbiertas;
  }
  
  private void aumentarNumeroTabsAbiertos() {
    setNumeroTabsAbiertos(getNumeroTabsAbiertos() + 1);
  }
  
  private void reducirNumeroTabsAbiertos() {
    setNumeroTabsAbiertos(getNumeroTabsAbiertos() - 1);
  }

  private int getNumeroTabsAbiertos() {
    return numeroTabsAbiertos;
  }

  private void setNumeroTabsAbiertos(int numeroTabsAbiertos) {
    this.numeroTabsAbiertos = numeroTabsAbiertos;
  }

}
