/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class Contador extends Thread {

    private Personaje personaje;
    
    public Contador(Personaje personaje) {
        this.personaje = personaje;
    }
    
    @Override
    public void run() {
        while (personaje.getEnergia()>0) {
            personaje.setEnergia(personaje.getEnergia()-1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(personaje.getEnergia());
        }
    }

}
