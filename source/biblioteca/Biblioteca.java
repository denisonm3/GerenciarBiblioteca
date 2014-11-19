/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author denison_usuario
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon(
                Toolkit.getDefaultToolkit().getImage(Biblioteca.class.getResource("imagens/livro.png"))
        );
        SplashWindow sw = new SplashWindow(icon);
        sw.setVisible(true);
        sw.setText("Copyright (c) 2012 Denison");
        try {
            JFramePrincipal jj = new JFramePrincipal();
            jj.setLocationRelativeTo(null);
            sw.setVisible(false);
            jj.setVisible(true);
        } catch (Exception e) {
            sw.setVisible(false);
        }
    }
}
