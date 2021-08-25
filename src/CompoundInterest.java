import java.util.*;
public class CompoundInterest {
    public static void calculateAmount( double p,double r,int n,int t)
    {
        double amount=p*Math.pow(1+(r/n),(n*t))-p;
        System.out.println("compound interest is="+String.format("%.2f",amount));
    }
    public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   double rate,principal;
   int number_of_times,time_duration;
        System.out.println("Enter principal amount");
        principal=in.nextDouble();
        System.out.println("Enter annual rate");
        rate=in.nextDouble();
        double rateInDecimal=rate/100;
        System.out.println("Enter number of times interest applied per time period");
        number_of_times=in.nextInt();
        System.out.println("Enter number of time periods elapsed");
        time_duration=in.nextInt();
        calculateAmount(principal,rateInDecimal,number_of_times,time_duration);
    }
}
