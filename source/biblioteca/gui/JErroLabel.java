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
package biblioteca.gui;

import java.awt.Color;
import javax.swing.JLabel;

/**
 * Apresenta mensagens para o usuário:
 * Erro: vermelho;
 * Advertência: Laranja;
 * Êxito: verde;
 * @author Denison
 */
public class JErroLabel extends JLabel {

    private final String html1 = "<html><body style='width: ";
    private final String html2 = "pt'>";
    
    @Override
    public void setText(String text) {
        super.setText(html1+getWidth()+html2+text);
    }

    public void setErrorText(String text) {
        setForeground(Color.RED);
        setText(text);
    }
    
    public void setSuccessText(String text) {
        setForeground(Color.GREEN);
        setText(text);
    }
    
    public void setWarningText(String text) {
        setForeground(Color.ORANGE);
        setText(text);
    }
}
