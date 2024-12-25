
package BMI;


public class Bmi {
    double bmi;
    
    void setBmi(double bb, double tb){
        bmi=bb/(tb*tb);
    }  
    double getBmi(){
        if (bmi < 18){
            System.out.println("Berat Kurang");
        }
        
        else if (bmi > 18 && bmi <=24){
            System.out.println("Ideal");
        }
        
        else if (bmi > 24 && bmi <=29){
            System.out.println("Berat Berlebih");
        }
        
        else if (bmi > 29){
            System.out.println("Obesitas");
        }
        return bmi;
    }
}
