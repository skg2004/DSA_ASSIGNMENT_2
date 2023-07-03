class Point{
    Point(){
    }
    int x ,y;
    Point(int  x, int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println("x coordinate: "+x);
        System.out.println("y coordinate: "+y);
    }
}
class Circle extends Point{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    void calculate(){
        double area = 3.14*radius*radius;
        double circumference = 2*3.14*radius;
        System.out.println("Area of the circle is "+area);
        System.out.println("circumference is "+circumference);
    }
}
public class HA_Q4 {
    public static void main(String[] args) {
        new Point(3,5);
       Circle obj1 = new Circle(2.5);
       obj1.calculate();
        obj1.display();
    }
}
