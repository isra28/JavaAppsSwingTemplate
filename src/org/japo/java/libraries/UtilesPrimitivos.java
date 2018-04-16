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
public class UtilesPrimitivos {
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static final int obtenerEntero(String msgUsr, String msgErr) {
        int dato = 0;
        boolean entradaOk = true;
        do {
            try {
                System.out.print(msgUsr);
                dato = SCN.nextInt();
                entradaOk = false;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (entradaOk);
        return dato;
    }

    public static final int validarPar(String msgUsr, String msgErr) {
        int dato;
        boolean parOk;
        do {
            dato = obtenerEntero(msgUsr, msgErr);
            parOk = dato % 2 == 0;
            if (!parOk) {
                System.out.println("Error: Número Impar");
            }
        } while (!parOk);
        return dato;
    }

    public static final int validarImpar(String msgUsr, String msgErr) {
        int dato;
        boolean parOk;
        do {
            dato = obtenerEntero(msgUsr, msgErr);
            parOk = dato % 2 != 0;
            if (!parOk) {
                System.out.println("Error: Número Par");
            }
        } while (!parOk);
        return dato;
    }

    public static boolean validarParidad(double num) {
        return num % 2 == 0;
    }

    public static boolean validarSigno(double num) {
        return num > 0;
    }

    public static double obtenerMayor(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }
    
    public static double obtenerMenor (double n1, double n2) {
        return n1 < n2 ? n1 : n2;
    }
    
    public static int obtenerRelacion (double n1, double n2) {
        int relacion = 0;
        if (n1 > n2){
            relacion = 1;
        } else if ( n1 == n2) {
            relacion = 0;
        } else if (n1 < n2) {
            relacion = -1;
        }
        return relacion;
    } 
}
