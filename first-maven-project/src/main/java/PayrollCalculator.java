import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is ur name");
        String name = input.nextLine();
        System.out.println("How many hours do u worked");
        double hours = input.nextDouble();
        System.out.println("What is ur pay rate");
        double payRate = input.nextDouble();
        double gross = 0;
        if (hours > 40) {
            gross = hours * (payRate * 1.5);
        } else {
            gross = hours * payRate;
        }
        System.out.println("ur name is " + name + " and " + "ur gross pay " + gross);


    }
}
