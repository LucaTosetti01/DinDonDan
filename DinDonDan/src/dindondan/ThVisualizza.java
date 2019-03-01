/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 *
 * @author tosetti_luca
 */
public class ThVisualizza extends Thread{
    
    DatiCondivisi ptrdati;
    
    public ThVisualizza() {
        
    }
    
    public ThVisualizza(DatiCondivisi dati) {
        ptrdati=dati;
    }
    
    public void run() {
        while(true) {
            System.out.println();
        }
    }
}
