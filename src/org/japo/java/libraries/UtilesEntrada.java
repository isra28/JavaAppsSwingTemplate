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

import java.util.Scanner;

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class UtilesEntrada {

    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static int leerEntero(String msgUsr, String msgErr) {
        int numero = 0;

        boolean testOK = true;
        do {
            try {
                System.out.printf("%s%n", msgUsr);
                numero = SCN.nextInt();
                testOK = false;
            } catch (Exception e) {
                System.out.printf("%s%n", msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (testOK);

        return numero;
    }
    
    public static int leerEnteroLista(String msgUsr, String msgErr, int[] lista){
        int dato;
        boolean datoOk;
        do{
            dato = UtilesEntrada.leerEntero(msgUsr, msgErr);
            datoOk = UtilesArrays.buscar(lista, dato) > -1;
            if (!datoOk) {
                System.out.println(msgErr);
            }
        } while (!datoOk);
        return dato;
    }

    public static int leerEnteroRango(String msgUsr, String msgErr, String msgErrRango, int lim_inf, int lim_sup) {
        int numero = 0;
        boolean entradaOK = true;
        do {
            numero = leerEntero(msgUsr, msgErr);
            if (numero >= lim_inf && numero <= lim_sup) {
                entradaOK = false;
            } else {
                System.out.printf("%s%n", msgErrRango);
            }
        } while (entradaOK);
        return numero;
    }

    public static int leerEnteroPar(String msgUsr, String msgErr, String msgErrParidad, int lim_inf, int lim_sup) {
        int numero = 0;
        boolean entradaOK = true;
        do {
            numero = leerEntero(msgUsr, msgErr);
            if (UtilesPrimitivos.validarParidad(numero)) {
                entradaOK = false;
            } else {
                System.out.printf("%s%n", msgErrParidad);
            }
        } while (entradaOK);
        return numero;
    }

    public static int leerEnteroImpar(String msgUsr, String msgErr, String msgErrParidad, int lim_inf, int lim_sup) {
        int numero = 0;
        boolean entradaOK = true;
        do {
            numero = leerEntero(msgUsr, msgErr);
            if (!(UtilesPrimitivos.validarParidad(numero))) {
                entradaOK = false;
            } else {
                System.out.printf("%s%n", msgErrParidad);
            }
        } while (entradaOK);
        return numero;
    }

    public static int leerEnteroRangoPar(String msgUsr, String msgErr, String msgErrRango, String msgErrParidad, int lim_inf, int lim_sup) {
        int numero = 0;
        boolean entradaOK = true;
        do {
            numero = leerEnteroRango(msgUsr, msgErr, msgErrRango, lim_inf, lim_sup);
            if (UtilesPrimitivos.validarParidad(numero)) {
                entradaOK = false;
            } else {
                System.out.printf("%s%n", msgErrParidad);
            }
        } while (entradaOK);
        return numero;
    }

    public static int leerEnteroRangoImpar(String msgUsr, String msgErr, String msgErrRango, String msgErrParidad, int lim_inf, int lim_sup) {
        int numero = 0;
        boolean entradaOK = true;
        do {
            numero = leerEnteroRango(msgUsr, msgErr, msgErrRango, lim_inf, lim_sup);
            if (!(UtilesPrimitivos.validarParidad(numero))) {
                entradaOK = false;
            } else {
                System.out.printf("%s%n", msgErrParidad);
            }
        } while (entradaOK);
        return numero;
    }

    public static double leerDouble(String msgUsr, String msgErr) {
        double numero = 0;
        boolean testOK = true;
        do {
            try {
                System.out.printf("%s%n", msgUsr);
                numero = SCN.nextDouble();
                testOK = false;
            } catch (Exception e) {
                System.out.printf("%s%n", msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (testOK);

        return numero;
    }

    public static double leerDoubleRango(String msgUsr, String msgErr, String msgErrRango, double lim_inf, double lim_sup) {
        double numero = 0;
        boolean entradaOK = true;
        do {
            numero = leerDouble(msgUsr, msgErr);
            if (numero >= lim_inf && numero <= lim_sup) {
                entradaOK = false;
            } else {
                System.out.printf("%s%n", msgErrRango);
            }
        } while (entradaOK);
        return numero;
    }

    public static final char leerCaracter(String msgUsr, String msgErr) {
        char character = 'a';
        boolean testOK = true;
        do {
            try {
                System.out.printf("%s%n", msgUsr);
                character = SCN.next().charAt(0);
                testOK = false;
            } catch (Exception e) {
                System.out.printf("%s%n", msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (testOK);

        return character;
    }
    
    public static final char leerOpcion(String opciones, String msgUsr, String msgErr) {
        char dato = 0;
        boolean lecturaOK = false;
        do {
            try {
                System.out.print(msgUsr);
                dato = SCN.nextLine().charAt(0);
            if (opciones.contains(dato + "")) {
                lecturaOK = true;
            } else {
                System.out.println(msgErr);
            }    
            } catch (Exception e) {
                System.out.println(msgErr);
            }
            } while (!lecturaOK);
        return dato;
        }

    public static String leerString(String msgUsr, String msgErr) {
        String string = "";
        boolean testOK = true;
        do {
            try {
                System.out.printf("%s%n", msgUsr);
                string = SCN.nextLine();
                testOK = false;
            } catch (Exception e) {
                System.out.printf("%s%n", msgErr);
            }
        } while (testOK);

        return string;
    }

    public static final String leerTexto (String msgUsr) {
        System.out.print(msgUsr);
        return SCN.nextLine();
    }
}
