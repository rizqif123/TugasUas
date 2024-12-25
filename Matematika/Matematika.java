/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematika;

/**
 *
 * @author USER
 */
public class Matematika {
     public void pertambahan(int a, int b) {
       
         int hasil = a + b;
        System.out.println("Pertambahan: " + a + " + " + b + " = " + hasil);
    }

    public void pengurangan(int a, int b) {
        
        int hasil = a - b;
        System.out.println("Pengurangan: " + a + " - " + b + " = " + hasil);
    }

    public void perkalian(int a, int b) {
       
        int hasil = a * b;
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasil);
    }
    
    public void pembagian(int a, int b){
        
        int hasil = a / b;
        System.out.println("Pembagian: " + a + " / " + b + " = " + hasil);
    }
}
