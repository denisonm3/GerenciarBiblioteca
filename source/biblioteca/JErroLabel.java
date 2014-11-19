/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Denison
 */
public class JErroLabel extends JLabel {

    private final String html1 = "<html><body style='width: ";
    private final String html2 = "pt'>";
    
    @Override
    public void setText(String text) {
        super.setText(html1+getWidth()+html2+text);
    }

    public void setErroText(String text) {
        setForeground(Color.RED);
        setText(text);
    }
    
}
