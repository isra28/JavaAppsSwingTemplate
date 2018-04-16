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
package org.japo.java.forms;

import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.japo.java.libraries.UtilesSwing;

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class GUI extends JFrame{
    
    //Propiedades
    public static final String PRP_LOOK_AND_FEEL = "look_and_feel";
    public static final String PRP_FAVICON = "favicon";
    
    public static final String DEF_LOOK_AND_FEEL = UtilesSwing.LNF_WINDOWS;
    public static final String DEF_FAVICON = "img/favicon.png";
    
    private Properties prp;

    public GUI(Properties prp) {
        initBefore(prp);
        initComponents();
        initAfter();
        
    }

    private void initComponents() {
        //Panel Principal
        JPanel pnlPpal = new JPanel();
        
        //Ventana Principal
        setContentPane(pnlPpal);
        setSize(600, 400);
        setTitle("Swing Manual #00");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initBefore(Properties prp) {
        this.prp = prp;
        
        UtilesSwing.establecerLnF(prp.getProperty(PRP_LOOK_AND_FEEL, DEF_LOOK_AND_FEEL));
    }

    private void initAfter() {
        
        UtilesSwing.establecerFavicon(this, prp.getProperty(PRP_FAVICON, DEF_FAVICON));
    }
    
    
}
