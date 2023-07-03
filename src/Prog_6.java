abstract class shape{
    abstract void area();
}
class square extends shape{
    double side;
    square(double side){
        this.side=side;
    }
    @Override
     void area(){
        double ans= side*side;
        System.out.println("Area of the square is: "+ans);
    }
}
class circle extends shape{
    double radius;
    circle(double radius){
       this.radius=radius;
    }
    @Override
     void area(){
    double ans = 3.14*radius*radius;
        System.out.println("Area of the circle is: "+ans);
    }
}
class Triangle extends shape{
    double base,height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    void area() {
        double ans = 0.5*base*height;
        System.out.println("Arae of the square is: "+ans);
    }
}
public class Prog_6 {
    public static void main(String[] args) {
        shape c1;
        c1=new circle(5.6);
        c1.area();;
        c1=new Triangle(28.4,1.2);
        c1.area();
        c1=new square(5);
        c1.area();
    }
}
