import java.util.Scanner;

public class sandwichShop {
   static  Scanner sandwich = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(calculate(size(),age()));
    }


    public static int size (){
        System.out.println("What size sandwich do you want today\n1:- Regular: base price $5.45\n2:- Large: base price $8.95");
        return sandwich.nextInt();
    }
    public static int age(){
        System.out.println("What is ur age:");
        return sandwich.nextInt();
    }
    public static double calculate(int sandwich , int age){
        double price = 0;
        if (sandwich == 1){
            price = 5.45;
        }else if (sandwich == 2){
            price = 8.95;
        }

        if (age<17){
            price *= 0.9;
        } else if(age >= 65){
            price *= 0.8;
        }
        return price;
    }
//        System.out.println("What size sandwich do you want today\n1:- Regular: base price $5.45\n2:- Large: base price $8.95");
//        int sandwich2 = sandwich.nextInt();
//        System.out.println("What is ur age:");
//        int age = sandwich.nextInt();
//        double discount=0;
//        double newPrice = 0;
//        double price1 = 5.45;
//        double price2 = 8.95;
//        if (age <= 17 && sandwich2 == 1) {
//             discount = price1  * 0.1;
//             newPrice = price1 * discount;
//        } else if (age <= 17 && sandwich2 == 2) {
//             discount =  price1 * 0.1;
//            newPrice = price1 * discount;
//        } else if (age >= 65 && sandwich2 == 1) {
//             discount =  price2 * 0.2;
//            newPrice = price2 * discount;
//        } else if (age >= 65 && sandwich2 == 2) {
//             discount =  price2 * 0.2;
//            newPrice = price2 * discount;
//        } else if (sandwich2 == 1){
//            newPrice = price1;
//        } else if (sandwich2 == 2){
//            newPrice = price2;
//        }
//
//        System.out.println(newPrice);

}