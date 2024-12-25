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
public class BankBeraksi {
    public static void main(String[] args) {
        Bank bank = new Bank(100000);
        bank.getSaldo();
        bank.simpanUang(500000);
        bank.ambilUang(150000);
    }
    
}
