import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Key in your name");
        Scanner name=new Scanner(System.in);
        System.out.println("Your name is "+ ""+ name.nextLine());
    }
}
