/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author estudiantes
 */
public interface Estado {
    public void transformar(JLabel lbl, Personaje personaje, JButton btn, JLabel lbl2);
}
