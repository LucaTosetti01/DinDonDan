/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tosetti_luca
 */
public class ThVisualizza extends Thread {

    DatiCondivisi ptrdati;

    public ThVisualizza() {

    }

    public ThVisualizza(DatiCondivisi dati) {
        ptrdati = dati;
    }

    public void run() {
        try {
            while (true) {

                ptrdati.semVisualizza1Wait();
                
                System.out.println(ptrdati.getCampana());
                
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
                
                ptrdati.semVisualizza2Signal();
                
            }
        } catch (InterruptedException ex) {
            
        }
    }
}
