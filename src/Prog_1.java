import java.util.Scanner;
class Phone_number{
    Scanner sc = new Scanner(System.in);
    int area_code, exchanging_number,my_number;
    void input(){
        System.out.println("Enter area code:");
         area_code = sc.nextInt();
        System.out.println("Enter exchanging");
         exchanging_number = sc.nextInt();
        System.out.println("Enter your number");
         my_number = sc.nextInt();
    }
    void display(){
        System.out.println("("+area_code+") "+exchanging_number+"-"+my_number);
    }
}
public class Prog_1 {
    public static void main(String[] args) {
    Phone_number obj = new Phone_number();
    Phone_number obj1 = new Phone_number();
    obj.input();
    System.out.print("My number  is");
    obj.display();
    obj1.area_code=415;
    obj1.exchanging_number=555;
    obj1.my_number=1212;
    System.out.print("Your number is");
    obj1.display();
    }
}
