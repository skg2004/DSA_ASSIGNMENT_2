import java.util.Scanner;

interface DetailInfo{
void dispaly();
void count();
}
class Person1 implements DetailInfo{
    static int maxcount;
    String name;
    Person1(String name)  {
        this.name=name;
    }
    @Override
    public void dispaly() {
        System.out.println("Person name is: "+name);
    }
    @Override
    public void count() {
        for (int i =0;i<name.length();i++){
            if (name.charAt(i)!= ' '){
                maxcount++;
            }
        }
        System.out.println("No of characters in the String is "+maxcount);
    }
}
public class Prog_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person'name ");
        String nm = sc.nextLine();
        DetailInfo obj;
        obj = new Person1(nm);
        obj.dispaly();
        obj.count();
    }
}