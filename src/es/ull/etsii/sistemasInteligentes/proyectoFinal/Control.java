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
  private ListaComandos listaComandos;
  private boolean chromeAbierto;
  private boolean busquedaActiva;
  private int numeroVentanasAbiertas;
  
  public Control() {
    // Se le pasa a Escucha la referencia a Control para que Escucha pueda
    // llamar a Control
    setEscucha(new Escucha(this));
    setListaComandos(ConstructorListaComandos.crearListaComandos());
    setNumeroVentanasAbiertas(0);
    setChromeAbierto(false);
    setBusquedaActiva(false);
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
    if(comando.matches("\\s*abrir\\s*chrome\\s*") && (!isChromeAbierto())) {
      setChromeAbierto(true);
      aumentarNumeroVentanasAbiertas();
      getListaComandos().buscar(comando).ejecutar();
    } else if(isChromeAbierto()) {
      if(comando.matches("\\s*nueva\\s*ventana\\s*")) {
        aumentarNumeroVentanasAbiertas();
      }
      else if(comando.matches("\\s*cerrar\\s*ventana\\s*")) {
        reducirNumeroVentanasAbiertas();
        if(getNumeroVentanasAbiertas() <= 0)
          setChromeAbierto(false);
      } else if(comando.matches("\\s*buscar\\s*")) {
        pararEscucha();
        // No se ha abierto una búsqueda
        if(!isBusquedaActiva()) {
          setEscucha(new Escucha(this, Escucha.GRAMATICA_BUSQUEDA));
          setBusquedaActiva(true);
        } else {
          setEscucha(new Escucha(this));
          setBusquedaActiva(false);
        }
        iniciarEscucha();
      } else {
        getListaComandos().buscar(comando).ejecutar();
      }
    } else {
      if(!comando.matches("\\s*terminar\\s*programa\\s*"))
        System.err.println("Chrome no está abierto");
      else {
        System.out.println("Adiós");
        getListaComandos().buscar(comando).ejecutar();
      }
    }
    iniciarEscucha();
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
  
  private boolean isBusquedaActiva() {
    return busquedaActiva;
  }

  private void setBusquedaActiva(boolean busquedaActiva) {
    this.busquedaActiva = busquedaActiva;
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

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Control control = new Control();
    control.iniciarEscucha();
  }

}
