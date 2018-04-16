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

import java.util.Random;

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class UtilesArrays {

    public static final Random RND = new Random();

    public static final double[] generarArrayDouble(int numPos, double numMin, double numMax) {

        double[] listaDatos = new double[numPos];
        for (int i = 0; i < numPos; i++) {
            listaDatos[i] = RND.nextDouble() * (numMax - numMin) + numMin;
        }
        return listaDatos;
    }

    public static final double acumularArrayDouble(double[] listaDatos) {
        double total = 0;
        for (double dato : listaDatos) {
            total += dato;
        }
        return total;
    }

    public static final double mediaArrayDouble(double[] listaDatos) {
        double total = 0;
        for (double dato : listaDatos) {
            total += dato;
        }
        double media = total / listaDatos.length;
        return media;
    }

    public static final int[] generarArrayEntero(int numPos, int numMin, int numMax) {

        int[] listaDatos = new int[numPos];
        for (int i = 0; i < numPos; i++) {
            listaDatos[i] = RND.nextInt() * (numMax - numMin + 1) + numMin;
        }
        return listaDatos;
    }

    public static final double acumularArrayEntero(int[] listaDatos) {
        int total = 0;
        for (int dato : listaDatos) {
            total += dato;
        }
        return total;
    }

    public static final double mediaArrayEntero(int[] listaDatos) {
        int total = 0;
        for (int dato : listaDatos) {
            total += dato;
        }
        int media = total / listaDatos.length;
        return media;
    }

    public static final int buscar(int[] listaDatos, int clave){
        int posicion = 0;
        boolean finBusquedaOK = false;
        do{
            if(posicion >= listaDatos.length){
                posicion = -1;
                finBusquedaOK = true;
            }else if(listaDatos[posicion] == clave){
                finBusquedaOK = true;
            }else{
                posicion++;
            }
        }while(!finBusquedaOK);
        return posicion;
    }
    
    public static final int obtenerMaximoArrayEntero(int[] lista) {
        //Primero es maximo
        int posMax = 0;
            
            //Recorrer a partir del segundo
            for (int posAct = 1; posAct < lista.length; posAct++) {
            posMax = lista[posAct] > lista[posMax] ? posAct : posMax;
        }

        //Devolver posicion
        return posMax;
    }
    
    public static final int obtenerOcurrenciaArrayEntero(int[] lista, int clave){
        //Contador ocurrencia
        int contador = 0;
        
        //Recorrer
        for (int item : lista) {
            contador = item == clave ? contador + 1 : contador;            
        }
        
        //Devolver contador
        return contador;
    }
    
}
