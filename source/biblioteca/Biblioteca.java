/*
 * Copyright 2014 Denison.
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
package biblioteca;

import biblioteca.gui.JFramePrincipal;
import biblioteca.gui.SplashWindow;
import java.awt.Toolkit;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;

/**
 * Classe que inicia a aplicação
 * @author Denison
 */
public class Biblioteca {

    public static ResourceBundle WORDS;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(
                Toolkit.getDefaultToolkit().getImage(Biblioteca.class.getResource("gui/imagens/livro.png"))
        );
        SplashWindow sw = new SplashWindow(icon);
        sw.setVisible(true);
        sw.setText("Copyright (c) 2012 Denison");
        try {
            Locale locale = Locale.getDefault();
            WORDS = ResourceBundle.getBundle("biblioteca.idioma.Idioma", locale);
            JFramePrincipal jj = new JFramePrincipal();
            jj.setLocationRelativeTo(null);
            sw.setVisible(false);
            jj.setVisible(true);
        } catch (Exception e) {
            sw.setVisible(false);
        }
    }
}
