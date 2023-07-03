import java.util.Scanner;
class Distance{
    Scanner sc = new Scanner(System.in);
    int feet;
    int inch;
    void getdata() {
        System.out.print("Enter feet:");
        feet = sc.nextInt();
        System.out.print("\nEnter inch:");
        inch = sc.nextInt();
    }
    void showdata() {
        System.out.println("The distance is "+feet+"feet"+inch+"inch");
    }
    void addDistance(Distance D1 , Distance D2) {
        inch = D1.inch+D2.inch;
        feet = D1.feet+D2.feet+(inch/12);
        inch= inch%12;
        System.out.println("The distance is "+feet+"feet"+inch+"inch");
    }
}

public class HA_Q3  {

    public static void main(String[] args) {
        Distance D1 = new Distance();
        Distance D2 = new Distance();
        Distance D3 = new Distance();

        System.out.println("Enter first Distance ");
        D1.getdata();
        System.out.println("Enter Second Distance");
        D2.getdata();
        D3.addDistance(D1, D2);
    }

}
