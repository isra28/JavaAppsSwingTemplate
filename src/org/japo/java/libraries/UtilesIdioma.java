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

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class UtilesIdioma {

    //Codigos Idioma
    public static final int CODIGO_ESP = 34;
    public static final int CODIGO_ING = 44;
    public static final int CODIGO_ALE = 49;

    //Nombres Idioma
    public static final String NOMBRE_ESP = "Español";
    public static final String NOMBRE_ING = "Ingles";
    public static final String NOMBRE_ALE = "Aleman";

    //Dias de la semana
    public static final int LUNES = 1;
    public static final int MARTES = 2;
    public static final int MIERCOLES = 3;
    public static final int JUEVES = 4;
    public static final int VIERNES = 5;
    public static final int SABADO = 6;
    public static final int DOMINGO = 7;

    //Dias Español
    public static final String[] DIAS_ESP = {
        "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
    };

    //Dias Ingles
    public static final String[] DIAS_ING = {
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    //Dias Aleman
    public static final String[] DIAS_ALE = {
        "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"
    };

    //Generar el nombre del dia
    public static String generarNombreDia(int dia, int idioma) {
        String nombre;

        switch (idioma) {
            case CODIGO_ESP:
                nombre = String.format("%s - (%s)", DIAS_ESP[dia - 1], NOMBRE_ESP);
                break;
            case CODIGO_ING:
                nombre = String.format("%s - (%s)", DIAS_ING[dia - 1], NOMBRE_ING);
                break;
            case CODIGO_ALE:
                nombre = String.format("%s - (%s)", DIAS_ALE[dia - 1], NOMBRE_ALE);
                break;
            default:
                nombre = "Desconocido";
        }
        return nombre;
    }
}
