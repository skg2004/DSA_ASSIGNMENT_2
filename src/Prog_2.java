import java.util.Scanner;

class Complex{
    Scanner sc = new Scanner(System.in);
    int real,imaginary;
    void getdata(){
        System.out.println("Enter real number");
        real= sc.nextInt();
        System.out.println("Enter imaginary number");
        imaginary = sc.nextInt();
        System.out.println("Number is "+real+"+i"+imaginary);
    }
    Complex sum(Complex d1 ,Complex d2){
        Complex temp = new Complex();
        temp.real= d1.real+d2.real;
        temp.imaginary=d1.imaginary+d2.imaginary;
        return temp;
    }
    void display(){
        System.out.println("Sum of numbers is "+real+"+i"+imaginary);
    }
}
public class Prog_2 {

    public static void main(String[] args) {
        Complex d1 = new Complex();
        System.out.println("Enter first number: ");
        d1.getdata();
        Complex d2 = new Complex();
        System.out.println("Enter second number: ");
        d2.getdata();
        Complex d3;
        d3=d1.sum(d1,d2);
        d3.display();
    }
}