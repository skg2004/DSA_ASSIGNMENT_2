import java.util.Scanner;

class PointType{
    double x,y;
    PointType(double x ,double y){
        this.x=x;
        this.y=y;
    }
}
class circleType extends PointType{
    double p,q;
    circleType(double x ,double y ,double p , double q){
        super(x,y);
        this.p=p;
        this.q=q;
    }
    double Calc_radius(){
        double radius=Math.sqrt(Math.pow(p-x,2)+Math.pow(q-y,2));
        return radius;
    }
    double area(){
        double area =3.14*Calc_radius()*Calc_radius();
        return area;
    }
    double circumference(){
        double circumference = 2*3.14*Calc_radius();
        return circumference;
    }
}
public class HA_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a point x,y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Enter center of the circle p,q: ");
        double p =sc.nextDouble();
        double q = sc.nextDouble();
        circleType obj = new circleType(x,y,p,q);
        double ans = obj.area();
        System.out.println("Area of the circle is: "+ans);
        System.out.println("Circumference of the circle is: "+obj.circumference());
    }
}
