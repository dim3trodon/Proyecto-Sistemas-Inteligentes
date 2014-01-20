package es.ull.etsii.sistemasInteligentes.proyectoFinal;

import java.awt.event.KeyEvent;

import es.ull.etsii.sistemasInteligentes.proyectoFinal.accion.AccionEscribir;
import es.ull.etsii.sistemasInteligentes.proyectoFinal.accion.AccionTeclado;
import es.ull.etsii.sistemasInteligentes.proyectoFinal.accion.CombTeclas;


public class ConstructorListaComandosEscribir {
  
  public static ListaComandos crearListaComandos() {
    
    ListaComandos lista = new ListaComandos();
    
    // Buscar (termina la búsqueda)
    CombTeclas buscar = new CombTeclas();
    buscar.addKeyEvent(KeyEvent.VK_ENTER);
    lista.addEntrada("buscar", new AccionTeclado(buscar));
    
    return lista;
  }
  
  private static void addALista(String palabra, ListaComandos lista) {
    lista.addEntrada(palabra, new AccionEscribir(palabra));
  }

}
