class Time1{
    int hour,min,sec,extramin,extrasec;
    Time1(int hour,int min,int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    Time1(){

    }
    Time1 adddata(Time1 d1,Time1 d2,Time1 res){
        res.hour=d1.hour+d2.hour;
        res.min=d1.min+d2.min;
        res.sec=d1.sec+d2.sec;

            if (res.min > 60) {
                extramin = res.min % 60;
                res.min = res.min / 60;
                res.hour = res.hour + res.min;
            }
            if (res.sec>60) {
                extrasec = res.sec % 60;
                res.sec = res.sec / 60;
                res.min = res.min + res.sec;
            }
       return res;
    }
    void display(){
        System.out.println("The summation of both the time object is "+hour+" hour "+min+" min "+sec+sec);
    }
}
public class Time_Object1 {
    public static void main(String[] args) {
        Time1 d1 = new Time1(2,11,37);
        Time1 d2 = new Time1(7,59,120);
        Time1 res = new Time1();
        res=d1.adddata(d1,d2,res);
        res.display();
    }
}