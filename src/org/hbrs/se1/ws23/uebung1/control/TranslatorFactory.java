package org.hbrs.se1.ws23.uebung1.control;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws23.uebung1.control.Translator;
import org.hbrs.se1.ws23.uebung1.control.TranslatorFactory;
/*
Problem: Inkonsistente Objekt_Erzeugung und -Parametrisierung
Lösung: Service-Klasse für die zentrale und konsistente Erzeugung
 */
public class TranslatorFactory {

    public static Translator createGermanTranslator()  {
        return new GermanTranslator();
    }

}
