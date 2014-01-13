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

public class ConstructorListaComandosWindows {
  
  public static final String EXTENSION = ".bat";
  
  public static ListaComandos crearListaComandos() {
    ListaComandos listaComandos = new ListaComandos();
    // Acciones de terminal
    // Abrir Chrome
    AccionScript accionAbrirChrome = new AccionScript("chrome" + EXTENSION);
    listaComandos.addEntrada("abrir chrome", accionAbrirChrome);
    return listaComandos;
  }

}
