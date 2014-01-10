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

public class ListaComandos {
  private HashMap<String, CombTeclas> hashComandos;
  
  public CombTeclas buscar(String comando) {
    // TODO
    // Busca el comando en el hash y devuelve la combinación de teclas 
    // asociada
    return null;
  }

  private HashMap<String, CombTeclas> getHashComandos() {
    return hashComandos;
  }

  private void setHashComandos(HashMap<String, CombTeclas> hashComandos) {
    this.hashComandos = hashComandos;
  }
}
