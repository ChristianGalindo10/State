/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author estudiantes
 */
public class FaseUno implements Estado {

    @Override
    public void transformar(JLabel lbl,Personaje personaje) {
        ImageIcon img = new ImageIcon(getClass().getResource("/img/200w.gif"));
        Image imgEscalada = img.getImage().getScaledInstance(lbl.getWidth(),
                lbl.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon iconoEscalado = new ImageIcon(imgEscalada);
        lbl.setIcon(iconoEscalado);
    }
    
}
