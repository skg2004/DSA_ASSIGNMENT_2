import java.util.Scanner;
class Commission{
    double sales;
    Commission(double sales){
        this.sales=sales;
    }
    double getCommission(){
        double commission =0;
        if (sales<100){
            commission=((sales*2)/100);
        }
       else if (sales>= 500 || sales<= 5000){
            commission=((sales*5)/100);
        }
        else if (sales>=5000){
            commission=((sales*8)/100);
        }
        return commission;
    }
}
public class HA_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales amount: ");
        double n = sc.nextDouble();
        if (n>0){
            Commission obj = new Commission(n);
            double ans=obj.getCommission();
            System.out.println("Commission amount is: "+ans);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
