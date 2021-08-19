import java.util.Scanner;

public class GravityCalculator {
    public static void main(String[] args) {
        String textVar="";
        Scanner in =new Scanner(System.in);
        double gravity=-9.81;
        double initialVelocity=0.0;
        double fallingTime=10.0;
        double initialPosition=0.0;
        double finalPosition=0.0;

        do {
            System.out.println("Earth's gravity=-9.81");
            System.out.println("initial position of object="+initialPosition+"(input\"pos\" to change it)");
            System.out.println("initial velocity of object="+initialVelocity+"(input\"vel\" to change it)");
            System.out.println("falling time of object="+fallingTime+"(input\"time\" to change it)");
            finalPosition=0.5*gravity*fallingTime*fallingTime + initialVelocity*fallingTime + initialPosition;
            System.out.println("The object's position after" +fallingTime+"seconds is"+finalPosition+"m.");
            System.out.println("input\"quit\"to exit the application");
            textVar=in.nextLine();

            if("pos".equals(textVar))
            {
                System.out.println("Enter new initial position of the object");
                while (!in.hasNextDouble())
                    in.next();
                initialPosition= in.nextDouble();
            } else if ("vel".equals(textVar)) {
                System.out.println("Enter new initial velocity of the object");
                while (!in.hasNextDouble())
                    in.next();
                initialVelocity=in.nextDouble();
            }
            else if ("time".equals(textVar)) {
                System.out.println("Enter new falling time of the object");
                while (!in.hasNextDouble())
                    in.next();
                fallingTime=in.nextDouble();
            } else if (!"quit".equals(textVar)) {
                System.out.println("\b");
            }
        }while (!"quit".equals(textVar));
    }
}
