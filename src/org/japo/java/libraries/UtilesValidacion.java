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
package org.japo.java.libraries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author Israel Fernández Chiva - israel.1daw@gmail.com
 */
public class UtilesValidacion {

    public static final boolean validarDato(String dato, String er) {
        boolean testOK = false;
        try {
            Pattern patron = Pattern.compile(er);
            Matcher detector = patron.matcher(dato);
            testOK = detector.matches();
        } catch (PatternSyntaxException e) {
            System.out.println(e);
        }
        return testOK;
    }
}
