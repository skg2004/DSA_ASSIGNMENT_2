import java.util.Scanner;

class person{
    String name;int age;
    person( String name,int age){
        this.name=name;
        this.age=age;
    }
}
class employee extends person{
    int e_id;
    double salary;
    employee(String name,int age,int e_id,double salary){
        super(name,age);
        this.e_id=e_id;
        this.salary=salary;
    }

    void display(){
        System.out.println("person name is: "+name);
        System.out.println("person age is: "+age);
        System.out.println("Employee id is: "+e_id);
        System.out.println("Employee salary is "+salary);
    }
}
public class Prog_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    employee[] emp = new employee[3];
    for (int i =0;i<emp.length;i++){
        System.out.println("Enter information about "+" employee no "+(i+1));
        System.out.println("Enter employee age");
        int ag = sc.nextInt();
        String nm ;
        nm=sc.nextLine();
        System.out.println("Enter employee name");
        nm=sc.nextLine();
        System.out.println("Enter employee id");
        int ide = sc.nextInt();
        System.out.println("Enter employee salary ");
        double sal = sc.nextDouble();
        emp[i]= new employee(nm,ag,ide,sal);
    }
    for (int i =0;i<emp.length;i++){
        emp[i].display();
        System.out.println();
    }

    }
}
