/* 
 * Copyright 2018 Israel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class UtilesDNI {
    public static final String LETRA = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static final int obtenerDNI(String msgUsr, String msgErr) {
        SCN.useLocale(Locale.ENGLISH);
        int numero = 0;
        boolean testOk = true;
        do {
            try {
                System.out.print("Introduce tu DNI sin letra: ");
                numero = SCN.nextInt();
                testOk = false;
            } catch (Exception e) {
                System.out.println("Error de Entrada");
            } finally {
                SCN.nextLine();
            }

        } while (testOk);
        return numero;
    }
    
    public static final char letraDNI(int dni) {
        char letra = LETRA.charAt(dni % 23);
        return letra;
    }
}
