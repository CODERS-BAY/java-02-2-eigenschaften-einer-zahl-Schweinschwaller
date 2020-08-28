import java.util.Scanner;

public class AssignmentLogicalOperators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input;
        int lucky = 607;
        System.out.println("The luckynumber is: " + lucky + "\n\n");

        System.out.print("Number: ");
        input = s.nextInt();

        if (input % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is round");
        }
        if (lucky == input) {
            System.out.println("The number is equal to the lucky number!");
        } else {
            System.out.println("The number is not equal to the lucky number!");
        }
        if ((input < 100 && input > 9) || (input < -9 && input > -100)) {
            System.out.println("The number does have two digits");
        } else {
            System.out.println("The number does not have two digits");
        }
    }
}