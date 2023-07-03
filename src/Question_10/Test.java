package Question_10;

import java.util.Scanner;

public class Test {
    double mark1,mark2;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark1: ");
        this.mark1=sc.nextDouble();
        System.out.println("Enter mark2: ");
        this.mark2=sc.nextDouble();
    }
    void output(){
        System.out.println("Mark1: "+mark1);
        System.out.println("Mark2: "+mark2);
        System.out.println("Grand total mark is: "+mark1+mark2);
    }
}
