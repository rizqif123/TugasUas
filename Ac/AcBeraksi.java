/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ac;

/**
 *
 * @author USER
 */
public class AcBeraksi {
     public static void main(String[] args) {
        Ac ac = new Ac();
        System.out.println("\nstatus Ac saat ini: Mati");
        ac.hidupkan();
        ac.matikan();
        ac.matikan();
        ac.hidupkan();
        ac.hidupkan();
        
        System.out.println("\nstatus suhu Ac saat ini: Panas");
        ac.dinginkan();
        ac.panaskan();
        ac.panaskan();
        ac.dinginkan();
        ac.dinginkan();
        
    }
    
}
