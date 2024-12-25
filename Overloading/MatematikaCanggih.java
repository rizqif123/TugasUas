
package Overloading;

public class MatematikaCanggih extends Matematika {
    
    void Modulus(double a,double b, double c){
        double hasil = a % b % c;
        System.out.println("hasil Modulus: " + hasil);   
    }
    
    void Modulus(int a,int b){
        int hasil = a % b;
        System.out.println("hasil Modulus: " + hasil);
    }
     
    void Modulus(double a,double b){
        double hasil = a % b;
        System.out.println("hasil Modulus: " + hasil);
    }
      
    void Modulus(int a,int b, int c){
        int hasil = a % b % c;
        System.out.println("hasil Modulus: " + hasil);
    }
    
    
}
