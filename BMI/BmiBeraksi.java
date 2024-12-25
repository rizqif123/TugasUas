package BMI;

public class BmiBeraksi {
    public static void main(String[] args) {
        
        Bmi myBmi = new Bmi();
        
        myBmi.setBmi(58,1.70);
        System.out.println("BMI saya = " + Math.round(myBmi.getBmi()));
    }
}
