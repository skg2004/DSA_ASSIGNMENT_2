package Question_10;

import java.util.Scanner;
import Question_10_1.Alpha;
import Question_10_1.Sports;

public class Student extends Test implements Sports {

    String name;
    int roll;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name= sc.nextLine();
        System.out.println("Enter roll: ");
        this.roll=sc.nextInt();
        super.input();
    }
    public void output(){
        System.out.println("name is: "+name);
        System.out.println("roll is: "+roll);
       super.output();
        System.out.println("Total score is: "+score1+score2);
    }
}
