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
package org.japo.java.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.japo.java.forms.GUI;

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class AEM implements ActionListener {
    
    private GUI gui;

    public AEM(GUI gui) {
        this.gui = gui;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
