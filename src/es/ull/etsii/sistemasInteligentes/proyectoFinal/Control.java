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

public class Control {
  
  private Escucha escucha;
  
  public Control() {
    // Se le pasa a Escucha la referencia a Control para que Escucha pueda
    // llamar a Control
    setEscucha(new Escucha(this));
  }
  
  public void iniciarEscucha() {
    getEscucha().iniciar();
  }
  
  public void pararEscucha() {
    getEscucha().parar();
  }
  
  public void ejecutarComando(String comando) {
    // TODO
    // Llamar a la clase ListaComandos, donde se encuentran todos los comandos
    // que se pueden ejecutar en el programa, y ejecutar el método 
    // buscar(String): Accion, que recibe un comando y devuelve una
    // Accion que puede ser la ejecución de un comando en la terminal o 
    // de una combinación de teclas
    System.out.println("ejecutarComando " + comando);
  }
  
  private void setEscucha(Escucha escucha) {
    this.escucha = escucha;
  }

  private Escucha getEscucha() {
    return escucha;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Control control = new Control();
    control.iniciarEscucha();
    control.pararEscucha();
  }

}
