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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;

import javax.speech.Central;
import javax.speech.EngineModeDesc;
import javax.speech.recognition.Recognizer;
import javax.speech.recognition.Result;
import javax.speech.recognition.ResultAdapter;
import javax.speech.recognition.ResultEvent;
import javax.speech.recognition.ResultToken;
import javax.speech.recognition.RuleGrammar;

public class Escucha extends ResultAdapter {
  
  public static final String GRAMATICA = "gramaticas/gramatica.txt";
  
  private Recognizer recognizer;
  private Control refControl;
  
  public Escucha(Control refControl) {
    super();
    setRefControl(refControl);
    // main del ejemplo de JSapi
    try {
      setRecognizer(Central.createRecognizer(new EngineModeDesc(Locale.ROOT)));
      getRecognizer().allocate();
      FileReader grammar1 = new FileReader(GRAMATICA);
      RuleGrammar rg = getRecognizer().loadJSGF(grammar1);
      rg.setEnabled(true);
      getRecognizer().addResultListener(this);
    } catch (FileNotFoundException e) {
      System.err.println("No se ha encontrado " + GRAMATICA + " en Escucha");
    } catch (Exception e) {
      System.err.println("Ha ocurrido un error en el constructor de Escucha");
      e.printStackTrace();
      System.exit(0);
    }
  }

  public void iniciar() {
    try {
      System.out.println("Empieze Dictado");
      getRecognizer().commitChanges();

      getRecognizer().requestFocus();
      getRecognizer().resume();
    } catch (Exception e) {
      System.err.println("Ha ocurrido un error en iniciar() de Escucha");
      e.printStackTrace();
      System.exit(0);
    }
  }
  
  public void parar() {
    getRecognizer().pause();
  }
  
  @Override
  public void resultAccepted(ResultEvent re) {
    try {
      Result res = (Result) (re.getSource());
      ResultToken tokens[] = res.getBestTokens();
      String comando = "";
      for (int i = 0; i < tokens.length; i++) {
        if(i > 0)
          comando += " ";
        comando += tokens[i].getSpokenText();
      }
      getRefControl().ejecutarComando(comando);
      //TODO
      parar();
    } catch (Exception ex) {
      System.out
          .println("Ha ocurrido algo inesperado en resultAccepted() de Escucha "
              + ex);
    }
  }

  private Recognizer getRecognizer() {
    return recognizer;
  }

  private void setRecognizer(Recognizer recognizer) {
    this.recognizer = recognizer;
  }
  
  private Control getRefControl() {
    return refControl;
  }


  private void setRefControl(Control refControl) {
    this.refControl = refControl;
  }

}
