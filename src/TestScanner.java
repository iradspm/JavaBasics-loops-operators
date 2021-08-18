import java.util.Scanner;
public class TestScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scan.nextInt();
        scan.close();
        System.out.println("The number entered by the user is " + "" + num);
    }

}
