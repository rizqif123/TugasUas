/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

/**
 *
 * @author USER
 */
public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hpku = new Handphone();
        hpku.hidupkan();
        hpku.kirimSms();
        hpku.lakukanPanggilan();
        hpku.matikan();
    }
    
}
