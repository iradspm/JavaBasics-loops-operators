import java.util.Scanner;

public class TenaryOperators {
    public static void main(String[] args) {
        int num1,num2,result;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num 1");
        num1=scanner.nextInt();
        System.out.println("Enter num 2");
        num2=scanner.nextInt();
        result=(num1>num2)?(num1+num2):(num1-num2);
        System.out.println("Result is="+result);
    }
}
