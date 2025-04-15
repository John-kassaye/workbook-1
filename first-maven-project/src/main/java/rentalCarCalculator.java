import java.util.Scanner;

public class rentalCarCalculator {
    static Scanner rent = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("your final rental cost is: $%.2f\nHave a nice day!",display(date(),day(),age(),electriconic(),gps(),assistance()));

    }
    public static String date(){
        System.out.println("Enter pick up date");
        return rent.nextLine();
    }
    public static int age(){
        System.out.println("Enter your age");
        return rent.nextInt();
    }
    public static double day(){
        System.out.println("how many days");
        return rent.nextInt();
    }
    public static int electriconic(){
        System.out.println("do you want electronic toy\n1: yes\n2: no");
        return rent.nextInt();
    }
    public static int gps(){
        System.out.println("do you want gps \n1: yes\n2: no");
        return rent.nextInt();
    }
    public static int assistance(){
        System.out.println("do you need assistance \n1: yes\n2: no");
        return rent.nextInt();
    }

    public static double display(String date,double day, int age, int elect, int gps, int assist){
        double price = 29.99 * day;
        if (elect == 1){
            price += 3.95 * day;
        }if (gps == 1){
            price += 2.95 * day;
        }if (assist == 1){
            price += 3.95 * day;
        }if (age < 25){
            price *= 0.7;
        }
        return price;
    }




}