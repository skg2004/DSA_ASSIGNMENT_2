import java.util.Scanner;
class Student{
    private int roll;
    private String name;
    private double DSA_mark;
    Student(int roll,String name,double DSA_mark){
        this.roll=roll;
        this.name=name;
        this.DSA_mark=DSA_mark;
    }
    void showdata() {
        System.out.println("Student name is "+name+" roll  is "+roll+" DSA_mark is "+DSA_mark);
    }
    int posn =0;
    void compute(Student []s) {
        double max = s[0].DSA_mark;
        for (int i =1;i<s.length;i++) {
            if(s[i].DSA_mark>max) {
                max=s[i].DSA_mark;
                posn =i;
            }
        }
        System.out.println("highest markholder name is "+s[posn].name);
        System.out.println("highest markholder roll is "+s[posn].roll);
    }
}
public class Prog_3 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of  the array ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for(int i =0;i<s.length;i++) {
            System.out.println("Enter roll");
            int rl = sc.nextInt();
            System.out.println("Enter name");
            sc.nextLine();
            String nm = sc.nextLine();
            System.out.println("Enter dasmark");
            double mark = sc.nextDouble();
            s[i]= new Student(rl,nm,mark);
        }
        for(int i =0;i<s.length;i++) {
            s[i].showdata();
        }
        s[n-1].compute(s);
    }

}
