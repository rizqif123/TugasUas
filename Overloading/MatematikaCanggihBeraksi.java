
package Overloading;

public class MatematikaCanggihBeraksi {
     public static void main(String[] args) {
        MatematikaCanggih Mat = new MatematikaCanggih();
        
        System.out.println("========= Pertambahan ========");
        Mat.pertambahan(12.5, 28.7, 14.2);
        Mat.pertambahan(12, 28, 14);
        Mat.pertambahan(23, 24);
        Mat.pertambahan(3.4, 4.9);
        
        System.out.println("\n======== Pengurangan ========");
        Mat.pengurangan(12.5, 28.7, 14.2);
        Mat.pengurangan(12, 28, 14);
        Mat.pengurangan(23, 24);
        Mat.pengurangan(3.4, 4.9);
        
        System.out.println("\n======== Perkalian ========");
        Mat.perkalian(12.5, 28.7, 14.2);
        Mat.perkalian(12, 28, 14);
        Mat.perkalian(23, 24);
        Mat.perkalian(3.4, 4.9);
        
        System.out.println("\n======== Pembagian ========");
        Mat.pembagian(12.5, 28.7, 14.2);
        Mat.pembagian(12, 28, 14);
        Mat.pembagian(23, 24);
        Mat.pembagian(3.4, 4.9);
        
        System.out.println("\n======== Modulus ========");
        Mat.Modulus(12.5, 28.7, 14.2);
        Mat.Modulus(12, 28, 14);
        Mat.Modulus(23, 24);
        Mat.Modulus(3.4, 4.9);
        
    }
    
}
