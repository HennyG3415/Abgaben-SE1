package org.hbrs.se1.ws23.uebung1.view;
import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws23.uebung1.control.Translator;
import org.hbrs.se1.ws23.uebung1.control.TranslatorFactory;

public class Client {

		/*
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
		 void display( int aNumber ){
			// In dieser Methode soll die Methode translateNumber
			// mit dem übergegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung gegen das Interface Translator gewuenscht!

			// Zahl wird ausgeschrieben ausgegeben bsp 2 wird zu zwei
			 // aus dislay klasse methode translate von germantranslator aufrufen, ohne dass man in der methode new verwendet

			/* GermanTranslator translator = new GermanTranslator();
			 String result = translator.translateNumber(2);


			 */
			 //Factory Method Pattern

			 Translator translator = TranslatorFactory.createGermanTranslator();
			 String result = translator.translateNumber(aNumber);
			 System.out.println("Das Ergebnis der Berechnung: " + result + "[das Ergebnis an dieser Stelle]"  );

		 }
}





