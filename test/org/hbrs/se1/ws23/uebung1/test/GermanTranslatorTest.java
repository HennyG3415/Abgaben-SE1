package org.hbrs.se1.ws23.uebung1.test;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws23.uebung1.control.TranslatorFactory;
import org.junit.jupiter.api.Test;
import org.hbrs.se1.ws23.uebung1.control.Translator;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {
    Translator translator = TranslatorFactory.createGermanTranslator();

    @Test
    void aPositiveTest() {
        String v1 = translator.translateNumber(1);
        String v2 = translator.translateNumber(5);
        String v3 = translator.translateNumber(10);
        assertEquals(v1, "eins");
        assertEquals(v2, "fünf");
        assertEquals(v3, "zehn");
    }

    @Test
    void aNegativeTest() {

        // Äquivalenzklasse x < 0
        assertThrows(IndexOutOfBoundsException.class, () -> {
            translator.translateNumber(0);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            translator.translateNumber(-1);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            translator.translateNumber(-300);
        });

        // Äquivalenzklasse x > 10
        assertThrows(IndexOutOfBoundsException.class, () -> {
            translator.translateNumber(11);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            translator.translateNumber(270);
        });
    }

}