import java.util.Scanner;
class Book{
    String B_name;int B_edition;double B_price;
    Book(){

    }
    Book(String B_name,int B_edition,double B_price){
        this.B_name=B_name;
        this.B_edition=B_edition;
        this.B_price=B_price;
    }
    void display(){
        System.out.println("Book name: "+B_name);
        System.out.println("Book edition: "+B_edition);
        System.out.println("Book price : "+B_price);
    }
    void compute(Book[]list){
        double maxprice =list[0].B_price;
        int posn =0;
        for (int i =0;i<list.length;i++){
            if (list[i].B_price>maxprice){
                maxprice=list[i].B_price;
                posn=i;
            }
        }
        System.out.println("The name of the book which has maximum price is "+list[posn].B_name);
        System.out.println("The edition of the book which has maximum price is "+list[posn].B_edition);
        System.out.println("The price of the book which has maximum price is "+list[posn].B_price);
    }
}
public class HA_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book obj = new Book();
        System.out.println("Enter no of book's to be purchased: ");
        int n = sc.nextInt();
        Book [] list = new Book[n];
        for (int i =0;i<list.length;i++){
            System.out.println("Enter book name: ");
            String nm = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter book edition: ");
            int edition = sc.nextInt();
            System.out.println("Enter book price: ");
            double price = sc.nextDouble();
            list[i]=new Book(nm,edition,price);
        }
        for (int i =0;i<list.length;i++){
            list[i].display();
        }
        obj.compute(list);
    }
}
