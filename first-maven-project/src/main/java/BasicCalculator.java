import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first num");
        double num = input.nextDouble();
        System.out.print("Enter the second num\n");
        double num2 = input.nextDouble();
        input.nextLine();
        System.out.println("possible calculations\nadd\nsubtract\nmultiply\ndivide");
        String option = input.nextLine();
        double result=0;
        if(option.equals("add")){
             result= num + num2;
        }else if(option.equals("subtract")){
             result= num - num2;
        }else if(option.equals("divide")){
            result= num / num2;
        }else if(option.equals("multiply")){
            result= num * num2;}

            System.out.println("here is ur result: " + result);
        }
}
