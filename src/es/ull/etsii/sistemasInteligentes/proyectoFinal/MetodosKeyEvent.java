package es.ull.etsii.sistemasInteligentes.proyectoFinal;

import java.awt.event.KeyEvent;
import java.util.Vector;

public class MetodosKeyEvent {
  
  public static Vector<Integer> stringToVectorKeyEvent(String palabra) {
    int numCaract = palabra.length();
    Vector<Integer> vectorKeyEvent = new Vector<Integer>();
    for (int i = 0; i < numCaract; i++) {
      switch (palabra.charAt(i)) {
      case '.':
        vectorKeyEvent.add(KeyEvent.VK_STOP);
        break;
      case 'a':
        vectorKeyEvent.add(KeyEvent.VK_A);
        break;
      case 'b':
        vectorKeyEvent.add(KeyEvent.VK_B);
        break;
      case 'c':
        vectorKeyEvent.add(KeyEvent.VK_C);
        break;
      case 'd':
        vectorKeyEvent.add(KeyEvent.VK_D);
        break;
      case 'e':
        vectorKeyEvent.add(KeyEvent.VK_E);
        break;
      case 'f':
        vectorKeyEvent.add(KeyEvent.VK_F);
        break;
      case 'g':
        vectorKeyEvent.add(KeyEvent.VK_G);
        break;
      case 'h':
        vectorKeyEvent.add(KeyEvent.VK_H);
        break;
      case 'i':
        vectorKeyEvent.add(KeyEvent.VK_I);
        break;
      case 'j':
        vectorKeyEvent.add(KeyEvent.VK_J);
        break;
      case 'k':
        vectorKeyEvent.add(KeyEvent.VK_K);
        break;
      case 'l':
        vectorKeyEvent.add(KeyEvent.VK_L);
        break;
      case 'm':
        vectorKeyEvent.add(KeyEvent.VK_M);
        break;
      case 'n':
        vectorKeyEvent.add(KeyEvent.VK_N);
        break;
      case 'ñ':
        vectorKeyEvent.add(KeyEvent.VK_N);
        break;
      case 'o':
        vectorKeyEvent.add(KeyEvent.VK_O);
        break;
      case 'p':
        vectorKeyEvent.add(KeyEvent.VK_P);
        break;
      case 'q':
        vectorKeyEvent.add(KeyEvent.VK_Q);
        break;
      case 'r':
        vectorKeyEvent.add(KeyEvent.VK_R);
        break;
      case 's':
        vectorKeyEvent.add(KeyEvent.VK_S);
        break;
      case 't':
        vectorKeyEvent.add(KeyEvent.VK_T);
        break;
      case 'u':
        vectorKeyEvent.add(KeyEvent.VK_U);
        break;
      case 'v':
        vectorKeyEvent.add(KeyEvent.VK_V);
        break;
      case 'w':
        vectorKeyEvent.add(KeyEvent.VK_W);
        break;
      case 'x':
        vectorKeyEvent.add(KeyEvent.VK_X);
        break;
      case 'y':
        vectorKeyEvent.add(KeyEvent.VK_Y);
        break;
      case 'z':
        vectorKeyEvent.add(KeyEvent.VK_Z);
        break;
      }
    }
    return vectorKeyEvent;
  }

}
