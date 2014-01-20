package es.ull.etsii.sistemasInteligentes.proyectoFinal.accion;

public class AccionTerminarPrograma implements Accion {
  
  public AccionTerminarPrograma() {}

  @Override
  public void ejecutar() {
    System.exit(0);
  }
  
  @Override
  public String toString() {
    return "AccionTerminarPrograma";
  }

}
