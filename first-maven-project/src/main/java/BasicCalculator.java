import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first num");
        double num = input.nextDouble();
        System.out.print("Enter the second num\n");
        double num2 = input.nextDouble();
        System.out.println("possible calculations\nadd\nsubtract\nmultiply\ndivide");
        String option = input.nextLine();
        System.out.println("please select an option: multiply");

        int result= (int) (num * num2);
        System.out.println("here is ur result: " + result);


    }
}
