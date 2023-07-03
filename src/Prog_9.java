import java.util.Scanner;
class student11{
    private int roll_number; private String name,course;
    student11(int roll_number,String name,String course){
        this.roll_number=roll_number;
        this.name=name;
        this.course=course;
    }
    void display_student(){
        System.out.println("Student roll_no is: "+roll_number);
        System.out.println("Student name is: "+name);
        System.out.println("Student course is: "+course);
    }
}
class Exam extends student11{
    private double mark11,mark2,mark3;
    Exam(int roll_number, String name, String course, double mark11, double mark2, double mark3){
        super(roll_number,name,course);
        this.mark11=mark11;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    void display_Results(){
        System.out.println("Result is "+(mark11+mark2+mark3));
    }
}
public class Prog_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students: ");
        int n = sc.nextInt();
        Exam[]exm = new Exam[n];
        for (int i =0;i<exm.length;i++){
            System.out.println("Enter info about student "+(i+1));
            System.out.println("Enter roll_number: ");
            int rl = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name ");
            String nm = sc.nextLine();
            System.out.println("Enter course: ");
            String crs=sc.nextLine();
            System.out.println("Enter mark1: ");
            double mrk1 = sc.nextDouble();
            System.out.println("Enter mark2: ");
            double mrk2 = sc.nextDouble();
            System.out.println("Enter mark3: ");
            double mrk3 = sc.nextDouble();
            exm[i]=new Exam(rl,nm,crs,mrk1,mrk2,mrk3);
        }
        for (int i =0;i<exm.length;i++){
            exm[i].display_student();
            exm[i].display_Results();
            System.out.println();
        }
    }
}