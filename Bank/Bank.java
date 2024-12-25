/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author USER
 */
public class Bank {
    int saldo;
    public Bank(int saldo){
        this.saldo = saldo;
      
    }
    public int getSaldo(){
        System.out.println("Selamat datang di Bank sat");
        System.out.println("saldo saat ini = " + saldo);
        return saldo;
    }
    
    void simpanUang(int jumlah){
        saldo = saldo + jumlah;
        System.out.println("simpan uang    = " + jumlah);
        System.out.println("saldo saat ini = " + saldo);
    }
    void ambilUang(int jumlah){
        saldo = saldo - jumlah;
        System.out.println("ambil uang     = " + jumlah);
        System.out.println("saldo saat ini = " + saldo);
    }
   
    
}
