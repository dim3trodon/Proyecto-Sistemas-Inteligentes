package es.ull.etsii.sistemasInteligentes.proyectoFinal;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz extends JFrame {

  JLabel texto;
  JButton play;
  boolean iniciado = false;
  
  public static final int ANCHO = 300;
  public static final int ALTO = 65;
  public static final int TAMAÑO_TEXTO = 80;

  private static final long serialVersionUID = 5441369443454813377L;

  public Interfaz() {
    play = new JButton("  Empezar  ");
    play.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        actualizarTexto("Aquí aparecerá el comando");
        iniciarControl();
        play.setEnabled(false);
        play.setText("Escuchando");
      }
    });
    texto = new JLabel();
    actualizarTexto("Pulse empezar");
    setLayout(new FlowLayout());
    add(play);
    add(texto);
  }

  public void actualizarTexto(String texto) {
    this.texto.setText(texto);
  }

  public void iniciarControl() {
    Control control = new Control(this);
    control.iniciarEscucha();
  }

  public static void main(String[] args) {
    Interfaz frame = new Interfaz();
    int anchoPantalla = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    int altoPantalla = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    frame.setTitle("Chrome voz");
    // frame.setLocationRelativeTo(null); // Center the frame
    frame.setLocation(anchoPantalla - ANCHO, altoPantalla - ALTO);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(ANCHO, ALTO);
    frame.setVisible(true);
    frame.setAlwaysOnTop(true);
    frame.setResizable(false);
  }

}
