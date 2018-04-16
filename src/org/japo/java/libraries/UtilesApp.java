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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class UtilesApp {
    
    public static final String DEF_FICHERO_PRP = "app.properties";
    public static final String DEF_FICHERO_XML = "app.xml";
    
    public static final boolean exportarPropiedades(Properties prp) {
        return exportarPropiedades (prp, DEF_FICHERO_PRP);
    }
    
    public static final boolean exportarPropiedades(Properties prp, String fichero) {
        boolean procesoOk;
        try (FileWriter fw = new FileWriter (fichero)) {
            prp.store (fw, null);
            procesoOk = true;
        } catch (IOException e) {
            System.out.println("ERROR: No ha sido posible crear fichero");
            procesoOk = false;
        }
        return procesoOk;
    }
    
     public static final boolean exportarPropiedadesXML(Properties prp) {
        return exportarPropiedadesXML(prp, DEF_FICHERO_XML);
    }
     
     public static final boolean exportarPropiedadesXML(Properties prp, String fichero) {
        boolean procesoOk = false;
        try (FileOutputStream fosXml = new FileOutputStream (fichero)) {
            prp.storeToXML(fosXml, null);
            procesoOk = true;
        } catch (Exception e) {
            System.out.println("ERROR: No ha sido posible crear fichero");
        }
        return procesoOk;
    }
    
    public static final Properties importarPropiedades() {
        return importarPropiedades (DEF_FICHERO_PRP);
    }
    
    public static final Properties importarPropiedades (String fichero) {
        Properties prp = new Properties();
        try (FileReader fr = new FileReader(fichero) ){
            prp.load(fr);
        } catch (Exception e) {
            System.out.println("ERROR: Acceso fichero" + fichero);
        }
        return prp;
    }
    
      public static final Properties importarPropiedadesXML() {
        return importarPropiedadesXML (DEF_FICHERO_XML);
    }
    
    public static final Properties importarPropiedadesXML (String fichero) {
        Properties prp = new Properties();
        try (FileInputStream fisXml = new FileInputStream(fichero)) {
            prp.loadFromXML (fisXml);
        } catch (Exception e) {
            System.out.println("ERROR" + fichero);
        }
        return prp;
    }
    
    
}
