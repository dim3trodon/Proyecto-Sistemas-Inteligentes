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

import es.ull.etsii.sistemasInteligentes.proyectoFinal.accion.AccionScript;

public class Control {
  
  private Escucha escucha;
  private ListaComandos listaComandos;
  
  public Control() {
    // Se le pasa a Escucha la referencia a Control para que Escucha pueda
    // llamar a Control
    setEscucha(new Escucha(this));
    setListaComandos(ConstructorListaComandosWindows.crearListaComandos());
    
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
    // Accion que puede ser la ejecución de un script o 
    // de una combinación de teclas
    System.out.println("Ejecutar comando " + comando);
    getListaComandos().buscar(comando).ejecutar();
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

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Control control = new Control();
    control.iniciarEscucha();
  }

}
