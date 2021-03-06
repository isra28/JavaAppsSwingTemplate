/* 
 * Copyright 2018 Israel Fernández Chiva - israel.1daw@gmail.com.
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
package org.japo.java.main;

import java.util.Properties;
import javax.swing.SwingUtilities;
import org.japo.java.forms.GUI;
import org.japo.java.libraries.UtilesApp;

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class Main {
    
    public static final String FICHERO_PROPIEDADES = "app.properties";
    
    public static void main(String[] args) {
        
        Runnable r = () -> {
            Properties prp = UtilesApp.importarPropiedades(FICHERO_PROPIEDADES);
            GUI gui= new GUI(prp);
            gui.setVisible(true);
        };
        
        SwingUtilities.invokeLater(r);
    }
    
}
