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

import java.awt.event.KeyEvent;

import es.ull.etsii.sistemasInteligentes.proyectoFinal.accion.AccionEscribir;
import es.ull.etsii.sistemasInteligentes.proyectoFinal.accion.AccionScript;
import es.ull.etsii.sistemasInteligentes.proyectoFinal.accion.AccionTeclado;
import es.ull.etsii.sistemasInteligentes.proyectoFinal.accion.AccionTerminarPrograma;
import es.ull.etsii.sistemasInteligentes.proyectoFinal.accion.CombTeclas;

public class ConstructorListaComandos {

  public static final String EXTENSION = ".bat";

  public static ListaComandos crearListaComandos() {
    ListaComandos lista = new ListaComandos();
    /*
     * Acciones de terminal
     */
    // Abrir Chrome
    AccionScript abrirChrome = new AccionScript("chrome" + EXTENSION);
    lista.addEntrada("abrir chrome", abrirChrome);

    /*
     * Acciones de teclado
     */
    // Nueva ventana
    CombTeclas teclasNuevaVentana = new CombTeclas();
    teclasNuevaVentana.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasNuevaVentana.addKeyEvent(KeyEvent.VK_N);
    addALista("abrir nueva ventana", teclasNuevaVentana, lista);

    // Nueva pestaña
    CombTeclas teclasNuevaPestanna = new CombTeclas();
    teclasNuevaPestanna.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasNuevaPestanna.addKeyEvent(KeyEvent.VK_T);
    addALista("nuevo tab", teclasNuevaPestanna, lista);

    // Nueva ventana incógnito
    CombTeclas teclasNuevaVentanaIncognito = new CombTeclas();
    teclasNuevaVentanaIncognito.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasNuevaVentanaIncognito.addKeyEvent(KeyEvent.VK_SHIFT);
    teclasNuevaVentanaIncognito.addKeyEvent(KeyEvent.VK_N);
    addALista("nueva ventana incognito", teclasNuevaVentanaIncognito, lista);

    // Ultimo tab cerrado
    CombTeclas teclasUltimoTabCerrado = new CombTeclas();
    teclasUltimoTabCerrado.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasUltimoTabCerrado.addKeyEvent(KeyEvent.VK_SHIFT);
    teclasUltimoTabCerrado.addKeyEvent(KeyEvent.VK_T);
    addALista("abrir ultimo tab cerrado", teclasUltimoTabCerrado, lista);

    // Ir al tab 1
    CombTeclas teclasIrAlTab1 = new CombTeclas();
    teclasIrAlTab1.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasIrAlTab1.addKeyEvent(KeyEvent.VK_1);
    addALista("ir al tab 1", teclasIrAlTab1, lista);

    // Ir al tab 2
    CombTeclas teclasIrAlTab2 = new CombTeclas();
    teclasIrAlTab2.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasIrAlTab2.addKeyEvent(KeyEvent.VK_2);
    addALista("ir al tab 2", teclasIrAlTab2, lista);

    // Ir al tab 3
    CombTeclas teclasIrAlTab3 = new CombTeclas();
    teclasIrAlTab3.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasIrAlTab3.addKeyEvent(KeyEvent.VK_3);
    addALista("ir al tab 3", teclasIrAlTab3, lista);

    // Ir al tab 4
    CombTeclas teclasIrAlTab4 = new CombTeclas();
    teclasIrAlTab4.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasIrAlTab4.addKeyEvent(KeyEvent.VK_4);
    addALista("ir al tab 4", teclasIrAlTab4, lista);

    // Ir al tab 5
    CombTeclas teclasIrAlTab5 = new CombTeclas();
    teclasIrAlTab5.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasIrAlTab5.addKeyEvent(KeyEvent.VK_5);
    addALista("ir al tab 5", teclasIrAlTab5, lista);

    // Ir al tab 6
    CombTeclas teclasIrAlTab6 = new CombTeclas();
    teclasIrAlTab6.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasIrAlTab6.addKeyEvent(KeyEvent.VK_6);
    addALista("ir al tab 6", teclasIrAlTab6, lista);

    // Ir al tab 7
    CombTeclas teclasIrAlTab7 = new CombTeclas();
    teclasIrAlTab7.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasIrAlTab7.addKeyEvent(KeyEvent.VK_7);
    addALista("ir al tab 7", teclasIrAlTab7, lista);

    // Ir al tab 8
    CombTeclas teclasIrAlTab8 = new CombTeclas();
    teclasIrAlTab8.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasIrAlTab8.addKeyEvent(KeyEvent.VK_8);
    addALista("ir al tab 8", teclasIrAlTab8, lista);
    
    // Ir al última tab
    CombTeclas teclasIrAlUltimoTab = new CombTeclas();
    teclasIrAlUltimoTab.addKeyEvent(KeyEvent.VK_CONTROL);
    teclasIrAlUltimoTab.addKeyEvent(KeyEvent.VK_9);
    addALista("ir al ultimo tab", teclasIrAlUltimoTab, lista);
    
    // Siguiente tab
    CombTeclas siguienteTab = new CombTeclas();
    siguienteTab.addKeyEvent(KeyEvent.VK_CONTROL);
    siguienteTab.addKeyEvent(KeyEvent.VK_TAB);
    addALista("siguiente tab", siguienteTab, lista);
    
    // tab siguiente
    addALista("tab siguiente", siguienteTab, lista);
    
    // Tab anterior
    CombTeclas anteriorTab = new CombTeclas();
    anteriorTab.addKeyEvent(KeyEvent.VK_CONTROL);
    anteriorTab.addKeyEvent(KeyEvent.VK_SHIFT);
    anteriorTab.addKeyEvent(KeyEvent.VK_TAB);
    addALista("tab anterior", anteriorTab, lista);
    
    // Anterior tab
    addALista("anterior tab", anteriorTab, lista);
    
    // Cerrar ventana
    CombTeclas cerrarVentana = new CombTeclas();
    cerrarVentana.addKeyEvent(KeyEvent.VK_CONTROL);
    cerrarVentana.addKeyEvent(KeyEvent.VK_SHIFT);
    cerrarVentana.addKeyEvent(KeyEvent.VK_W);
    addALista("cerrar ventana", cerrarVentana, lista);
    
    // Cerrar tab
    CombTeclas cerrarTab = new CombTeclas();
    cerrarTab.addKeyEvent(KeyEvent.VK_CONTROL);
    cerrarTab.addKeyEvent(KeyEvent.VK_W);
    addALista("cerrar tab", cerrarTab, lista);
    
    // Retroceder
    CombTeclas paginaAnterior = new CombTeclas();
    paginaAnterior.addKeyEvent(KeyEvent.VK_ALT);
    paginaAnterior.addKeyEvent(KeyEvent.VK_LEFT);
    addALista("retroceder", paginaAnterior, lista);
    
    // Pagina siguiente
    CombTeclas paginaSiguiente = new CombTeclas();
    paginaSiguiente.addKeyEvent(KeyEvent.VK_ALT);
    paginaSiguiente.addKeyEvent(KeyEvent.VK_RIGHT);
    addALista("pagina siguiente", paginaSiguiente, lista);
    
    // Pagina de inicio (16)
    /*CombTeclas paginaInicio = new CombTeclas();
    paginaInicio.addKeyEvent(KeyEvent.VK_ALT);
    paginaInicio.addKeyEvent(0x24);
    addALista("pagina de inicio", paginaInicio, lista);*/
    
    // Configuración
    CombTeclas configuracion = new CombTeclas();
    configuracion.addKeyEvent(KeyEvent.VK_ALT);
    configuracion.addKeyEvent(KeyEvent.VK_E);
    addALista("configuracion", configuracion, lista);
    
    // Ocultar/mostrar marcadores
    CombTeclas mostrarMarcadores = new CombTeclas();
    mostrarMarcadores.addKeyEvent(KeyEvent.VK_CONTROL);
    mostrarMarcadores.addKeyEvent(KeyEvent.VK_SHIFT);
    mostrarMarcadores.addKeyEvent(KeyEvent.VK_B);
    addALista("mostrar marcadores", mostrarMarcadores, lista);
    addALista("ocultar marcadores", mostrarMarcadores, lista);
    
    // Mostrar historial // TODO no funciona bien
    CombTeclas historial = new CombTeclas();
    historial.addKeyEvent(KeyEvent.VK_CONTROL);
    historial.addKeyEvent(KeyEvent.VK_H);
    addALista("mostrar historial", historial, lista);
    
    // Mostrar descargas
    CombTeclas descargas = new CombTeclas();
    descargas.addKeyEvent(KeyEvent.VK_CONTROL);
    descargas.addKeyEvent(KeyEvent.VK_J);
    addALista("mostrar descargas", descargas, lista);
    
    // Recargar
    CombTeclas recargar = new CombTeclas();
    recargar.addKeyEvent(KeyEvent.VK_F5);
    addALista("recargar", recargar, lista);
    
    // Escape (permite salir de algún diálogo)
    /*CombTeclas escape = new CombTeclas();
    escape.addKeyEvent(KeyEvent.VK_ESCAPE);
    addALista("escape", escape, lista);*/
    
    // Terminar programa
    lista.addEntrada("terminar programa", new AccionTerminarPrograma());
    
    // Herramientas para desarrolladores
    CombTeclas herramientasDesarrolladores = new CombTeclas();
    herramientasDesarrolladores.addKeyEvent(KeyEvent.VK_CONTROL);
    herramientasDesarrolladores.addKeyEvent(KeyEvent.VK_SHIFT);
    herramientasDesarrolladores.addKeyEvent(KeyEvent.VK_J);
    addALista("herramientas para desarrolladores", herramientasDesarrolladores, lista);
    
    // Ayuda de Chrome // TODO No funciona
    /*CombTeclas ayudaChrome = new CombTeclas();
    ayudaChrome.addKeyEvent(KeyEvent.VK_F1);
    addALista("ayuda", ayudaChrome, lista);*/
    
    // Guardar como marcador
    CombTeclas guardarMarcador = new CombTeclas();
    guardarMarcador.addKeyEvent(KeyEvent.VK_CONTROL);
    guardarMarcador.addKeyEvent(KeyEvent.VK_D);
    addALista("guardar como marcador", guardarMarcador, lista);
    
    // Pantalla completa
    /*CombTeclas pantallaCompleta = new CombTeclas();
    pantallaCompleta.addKeyEvent(KeyEvent.VK_F11);
    addALista("pantalla completa", pantallaCompleta, lista);*/
    
    // Aumentar
    /*CombTeclas aumentar = new CombTeclas();
    aumentar.addKeyEvent(KeyEvent.VK_CONTROL);
    aumentar.addKeyEvent(KeyEvent.VK_PLUS);
    addALista("aumentar", aumentar, lista);*/
    
    // Reducir
    /*CombTeclas reducir = new CombTeclas();
    reducir.addKeyEvent(KeyEvent.VK_CONTROL);
    reducir.addKeyEvent(KeyEvent.VK_MINUS);
    addALista("reducir", reducir, lista);*/
    
    // Buscar
    CombTeclas buscar = new CombTeclas();
    buscar.addKeyEvent(KeyEvent.VK_CONTROL);
    buscar.addKeyEvent(KeyEvent.VK_L);
    addALista("entrar a", buscar, lista);
    
    // Subir
    CombTeclas subir = new CombTeclas();
    subir.addKeyEvent(KeyEvent.VK_PAGE_UP);
    addALista("subir", subir, lista);
    
    // Bajar
    CombTeclas bajar = new CombTeclas();
    bajar.addKeyEvent(KeyEvent.VK_PAGE_DOWN);
    addALista("bajar", bajar, lista);
    
    // Ir al marcador
    CombTeclas irMarcador = new CombTeclas();
    irMarcador.addKeyEvent(KeyEvent.VK_F6);
    addALista("marcador", irMarcador, lista);
    
    // Youtube
    lista.addEntrada("youtube", new AccionEscribir("youtube"));
    
    // Amazon
    lista.addEntrada("amazon", new AccionEscribir("amazon"));
    
    // Marca
    lista.addEntrada("marca", new AccionEscribir("marca"));
    
    return lista;
    // TODO
    // TODO Hacer un comando buscar "x" y hacer una nueva gramática que
    // reconozca "x"
  }
  
  private static void addALista(String comando, CombTeclas combTeclas,
      ListaComandos lista) {
    lista.addEntrada(comando, new AccionTeclado(combTeclas));
  }
  
  

}
