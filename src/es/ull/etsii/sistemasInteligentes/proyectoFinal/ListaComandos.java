/**
 * @author Fran Dioniz
 * @author Rodrigo Valladares Santana
 * 
 * @version 1.0
 *
 * Proyecto de Sistemas Inteligentes 2013/14
 * 
 * Hash en el que se guardan pares de comandos (String) y pulsaciones de teclado
 * (CombTeclas)
 * 
 */
package es.ull.etsii.sistemasInteligentes.proyectoFinal;

import java.util.HashMap;

import es.ull.etsii.sistemasInteligentes.proyectoFinal.accion.Accion;
import es.ull.etsii.sistemasInteligentes.proyectoFinal.accion.AccionScript;

public class ListaComandos {
  private HashMap<String, Accion> hashComandos;
  
  public ListaComandos() {
    setHashComandos(new HashMap<String, Accion>());
  }
  
  public Accion buscar(String comando) {
    if (getHashComandos().containsKey(comando)) {
      System.out.print("Contiene \"" + comando + "\" ");
      System.out.println(getHashComandos().get(comando).toString());
      return getHashComandos().get(comando);
    }
    else {
      System.err.println(comando + " no es un comando en ListaComandos");
      return new AccionScript("nada"
          + ConstructorListaComandos.EXTENSION);
    }
  }
  
  public void addEntrada(String comando, Accion accion) {
    getHashComandos().put(comando, accion);
  }

  private HashMap<String, Accion> getHashComandos() {
    return hashComandos;
  }

  private void setHashComandos(HashMap<String, Accion> hashComandos) {
    this.hashComandos = hashComandos;
  }
}
