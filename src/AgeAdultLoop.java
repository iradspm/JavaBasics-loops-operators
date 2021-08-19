import java.util.Scanner;

public class AgeAdultLoop {
    public static void main(String[] args) {
        /*
        * if-statement condition
        * */
        int age,age1,num;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age");
        age=in.nextInt();
        System.out.println("if condition");
        if(age<18)
        {
            System.out.println("Not an adult");
        }
        System.out.println();
        /*
         * if-else statement condition
         * */
        age1=in.nextInt();
        System.out.println("if else condition");
        System.out.println("Enter your age again");
       if(age1<18)
       {
           System.out.println("under 18");
       }else
       {
           System.out.println("Adult");
       }
       /*
       * testing odd or even using conditions (modulus)
       * */
        System.out.println();
        System.out.println("Key in a number");
        num=in.nextInt();
        if(num%2==0)
        {
            System.out.println("the number entered is odd");
        }
        else if(!(num%2 == 0))
        {
            System.out.println("number entered is even");
        }
        else
        {
            System.out.println("Invalid number input");
        }
    }
}
