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
public class Contexto {
    private Estado estado;
    
    public Contexto(JLabel lbl,Personaje personaje, JButton btn,JLabel lbl2){
        estado = new FaseUno();
        estado.transformar(lbl, personaje,btn,lbl2);
    }
    
    public void SSJ2(JLabel lbl,Personaje personaje, JButton btn,JLabel lbl2){
        estado = new FaseDos();
        estado.transformar(lbl, personaje,btn,lbl2);
    }
    
    public void SSJ3(JLabel lbl,Personaje personaje, JButton btn,JLabel lbl2){
        estado = new FaseTres();
        estado.transformar(lbl, personaje,btn,lbl2);
    }
}
