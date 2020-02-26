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
public class Fase2 implements Estado {

    @Override
    public void transformar(JLabel lbl, Personaje personaje) {
        int energia = personaje.getEnergia();
        if (energia > 70) {
            personaje.setEnergia(energia - 30);
            ImageIcon img = new ImageIcon(getClass().getResource("/img/201w.gif"));
            Image imgEscalada = img.getImage().getScaledInstance(lbl.getWidth(),
                    lbl.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon iconoEscalado = new ImageIcon(imgEscalada);
            lbl.setIcon(iconoEscalado);
        }

    }
}
