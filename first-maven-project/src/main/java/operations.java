public class operations {
    public static void main(String[] args) {

        // 4
        int ab = 10;
        double cd = 5.0;
        //System.out.println(ab/cd);

        // 5
        int age = 22;
        int result = age + 10;
        //System.out.println("in 10 years i will be " + result );

        // 6
        byte plural = 100;
        int sight = plural + 28;
        //System.out.println(sight);

        // 7
        double john = 5.7;
        int dd = (int)john;
        //System.out.println(dd + " and " + john);

        // 8
        int puf = 12;
        float fup = 3.4f;
        double thing = (double) puf*fup; //it worked without the second (double)
        //System.out.println(thing);

        //9
        char weird = 'A';
        //System.out.println(weird + 1); //66 happens

        //10
        int a =9;
        int b =2;
        //System.out.println(a/b + " and " + a%b);

        //11
        int weight= 60;
        double height= 1.7;
        double bmi = (double)(weight/Math.pow(height , 2));
        //System.out.println(bmi);

        //12
        double x=2.3;
        double y=4.5;
        double z=6.3;
        double xyz = (x+y+z)/3;
        //System.out.println(xyz);

        //13
        int p =130;
        //System.out.println(p-=10);
        //System.out.println(p*=6);
        //System.out.println(p/=10);
        //System.out.println(p+=34);

        //14
        short abebe= 30000;
        int kebede= abebe*2;
        //System.out.println(kebede);

        //15
        double price = 10.99;
        int quantity = 5;
        int total_cost = (int)(price * quantity);
        //System.out.println(total_cost);

        //16
        int number = 130;
        byte num = (byte)(number);
        //System.out.println(num);

        //17
        char achar = 'z';
        char newachar = (char)(achar - 2);
        //System.out.println(newachar);

        //18
        long billion= 2000000000L;
        long adding= billion + 100000000L;
        //System.out.println(adding);

        //19
        double radius = 4.5;
        double area = Math.PI* radius * radius;
        //System.out.println(area);

        //mini challenge

        int total_minutes= 350;
        int full_hours = total_minutes/60;
        int remaining_minutes = total_minutes % 60;
        //System.out.println("Total minutes: " + total_minutes);
        //System.out.println("That is " + full_hours + " hours" +  " and " + remaining_minutes + " minutes");
        //System.out.printf("%d hours %d minutes" , full_hours, remaining_minutes);
        //same down there %d %.2f
        // bonus

        double cost_per_hour = 2.75;
        int hours = 5;
        double cost_for_5_hour = cost_per_hour * hours;
        //System.out.println("cost for 5 hours " + "= " + cost_for_5_hour + " dollars");
        //System.out.printf("%d hours %.1f minutes" ,hours , cost_per_hour);

        //double value = 1234.567;
        //double wholeNumber = Math.round(value);
        double value = 1234.567;
        double wholeNumber = Math.floor(value*5/2);

        //System.out.println(wholeNumber);

       double lk = 3.794;
       double bt = (double) Math.round(lk * 10)/10;
       //System.out.println(bt);











    }
}
