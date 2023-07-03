import java.util.Scanner;
class Deposit{
    long principle; double interst,total_amount;int time;
    Deposit(){

    }
    Deposit (long principle , int time,double interst){
        this.principle=principle;
        this.interst=interst;
        this.time=time;
    }
    Deposit (long principle, int time){
        this.principle=principle;
        this.time=time;
        this.interst=7.5;
    }
    Deposit (long principle, double interst){
        this.principle=principle;
        this.interst=interst;
        this.time=7;
    }
    void display(){
        System.out.println("Principle amout is "+principle+"\ninterest is "+interst+"\ntime_period is "+time);

    }
    void cal_amt(){
        total_amount=principle+(principle*time*interst)/100;
        System.out.println("Total amount with interest is "+total_amount);
        System.out.println();
    }
}
public class Prog_5 {
    public static void main(String[] args) {
        Deposit obj =new Deposit(40000,6,5.4);
        Deposit obj1 =new Deposit(80000,2,8.6);
        Deposit obj2 =new Deposit(60000,2);
        Deposit obj3 =new Deposit(50000,6.5);
        Deposit []ar =  {obj,obj1,obj2,obj3};
        for (int i =0;i<ar.length;i++){
            ar[i].display();
            ar[i].cal_amt();
        }
    }
}