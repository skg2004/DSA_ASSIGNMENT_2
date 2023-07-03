import java.util.Scanner;
class product{
    int p_id; double p_price; static double tot_price;
    product(int p_id , double p_price){
        this.p_id=p_id;
        this.p_price=p_price;
        tot_price+=p_price;
    }
    void display() {
        System.out.println("p_id is "+p_id+" p_price "+p_price);
    }
}
public class Prog_4 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of  the array ");
        int n = sc.nextInt();
        product []p = new product[n];
        for (int i=0;i<p.length;i++) {
            System.out.println("Enter product id");
            int p1_id = sc.nextInt();
            System.out.println("Enter product price");
            double price1 = sc.nextDouble();
            p[i]=new product(p1_id, price1);
        }
        for(int i =0;i<n;i++){
            p[i].display();
            if(i==(p.length-1)) {
                System.out.println("Total price of all the product is "+p[i].tot_price);
            }
        }
    }

}
