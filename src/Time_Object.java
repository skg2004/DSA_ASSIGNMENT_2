import java.util.Scanner;
class Time{
    Scanner sc = new Scanner(System.in);
    private int Hour, min,sec,extramin,extrasec;
    void getdata() {
        System.out.println("Enter hour");
        Hour= sc.nextInt();
        System.out.println("Enter min");
        min = sc.nextInt();
        System.out.println("Enter sec");
        sec= sc.nextInt();
    }
    void addData(Time d1,Time d2) {
        Hour = d1.Hour + d2.Hour;
        min = d1.min + d2.min;
        sec = d1.sec + d2.sec;
        if (min > 60 || sec > 60) {
            if (min > 60) {
                extramin = min % 60;
                min = min / 60;
                Hour = Hour + min;
            }
            if (true) {
                extrasec = sec % 60;
                sec = sec / 60;
                min = min + sec;
            }
            System.out.println("Time is " + Hour + " hour " + extramin + " min " + extrasec + " sec");
        }
        else {
            System.out.println("Time is " + Hour + " hour " + min + " min " + sec + " sec");
        }
    }
}
public class Time_Object {
    public static void main(String[]args) {
        Time d1 = new Time();
        Time d2 = new Time();
        Time d3 = new Time();
        System.out.println("Enter first time");
        d1.getdata();
        System.out.println("Enter Second time");
        d2.getdata();
        d3.addData(d1, d2);
    }
}
