import java.util.Scanner;

public class fridayMiniExercise {
    public static void main(String[] args) {
        Scanner friday = new Scanner(System.in);
        //2
        System.out.println("what is ur age?");
        int age = friday.nextInt();
        int dogYears = age * 7;
        System.out.println("ur dog years: " + dogYears);

        //3
        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.println("u rolled a: " + diceRoll);

        //4
        System.out.println("What is ur name");
        String name = friday.nextLine();
        System.out.println("ur name:" + name);
        System.out.println("ur agility");
        int agility = friday.nextInt();
        System.out.println("ur agility:" + agility);
        friday.nextLine();
        System.out.println("ur strength: ");
        int strength = friday.nextInt();
        System.out.println("ur strength: " + strength);

        //5
        System.out.println("what is ur level");
        int level = friday.nextInt();
        System.out.println("You leveled up! You are now level " + level);
        //6
        System.out.println("How many gold coins did u find?");
        int gold2 = friday.nextInt();
        System.out.println("How many silver coins did u find?");
        int silver = friday.nextInt();
        int goldPoints = gold2 + 10;
        int silverPoints = silver + 1;
        int total = goldPoints + silverPoints;
        System.out.println("the point you got because of the gold u found is " + gold2);
        System.out.println("the point you got because of the silver u found is " + silver);
        System.out.println("ur total point are " + total);
        //7
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println(dice);
        if (dice % 2 == 0) {
            System.out.println("Surprise! its even");
        } else {
            System.out.println("Its odd");
        }

        //8
        System.out.println("What is luck stat ( 0-100 )");
        int luck = friday.nextInt();
        if (luck > 50) {
            System.out.println("Critical hit");
        } else {
            System.out.println("Normal hit");
        }

        //9
        System.out.print("Choose your class (warrior or mage): ");
        String choose = friday.nextLine(); //

        if (choose.equals("warrior")) {
            System.out.println("You chose Warrior! Your starting weapon is a Sword.");
        } else if (choose.equals("mage")) {
            System.out.println("You chose Mage! Your starting weapon is a Magic Sword.");
        } else {
            System.out.println("Invalid class. Please choose either 'warrior' or 'mage'.");
        }

         //11
       System.out.println("What is ur speed?");
        double speed = friday.nextInt();
        if(speed >100){
        System.out.println("Too fast! Slow down.");}
        else

    {
        System.out.println("Safe speed.");
    }

    //13
        System.out.println("How much gold do you have?");
    int gold = friday.nextInt();

      System.out.println("How many potions do you want?");
    int desireValue = friday.nextInt();
    // 1 potion = 15 gold, 2 potion = 30 gold, 3 potion = 45 gold
    int cost = desireValue * 15;

       if(gold >=cost)

    {
        System.out.println("Total cost: " + cost);
    } else

    {
        System.out.println("Not enough gold.");
    }
    //14
       System.out.println("What is ur attack power?");
    int attack = friday.nextInt();
       System.out.println("What is ur enemy defense ?");
    int defense = friday.nextInt();
    int damage = attack - defense;
       if(damage >=0)

    {
        System.out.println("damage dealt");
    }else

    {
        System.out.println(damage);
    }

    //15
       System.out.println("What is ur current xp?");
    int xp = friday.nextInt();
       System.out.println("How many xp needed to level up?");
    int xp2 = friday.nextInt();
    int xpNeeded = xp2 - xp;
       System.out.println("u need "+xpNeeded +" xp to level up!");

    //16

    int generate = (int) (Math.random() * 100) + 1;
        System.out.println("pick ur number:");
    int num = friday.nextInt();
        if((Math.abs(generate -num) < 6)) {
            System.out.println("'Door Opens!'");}
        else {
        System.out.println("Try again");}

    //17
        System.out.println("What is my HP");
    int hp = friday.nextInt();
        System.out.println("What is my monster HP");
    int monsterHp = friday.nextInt();
        System.out.println("What is my attack power");
    int attack2 = friday.nextInt();
    int hp2 = monsterHp - attack2;
        System.out.println(hp);
        System.out.println(hp2);

    //18
        System.out.println("open chest ( yes/no )");
        String chest = friday.nextLine();

        if(chest.equals("yes")) {
        double guess = Math.random();
        if (guess < 0.5) {
            System.out.println("u found gold!");
        } else {
            System.out.println("u found hp");
        }
    }else

    {
        System.out.println("try again");
    }


     //19
        System.out.println("What is ur score?");
        double score = friday.nextDouble();
        System.out.println("What is ur high score?");
        double highScore = friday.nextDouble();
        if(score >highScore){
        System.out.println("New record!!");}
        else{System.out.println("Try again");
       }
        //20
        System.out.println("What is ur name?");

        String name2 = friday.nextLine();
        System.out.println("What is ur age?");

        int age2 = friday.nextInt();
        friday.nextLine();
        System.out.println("What is ur class?");

        String john = friday.nextLine();
        System.out.println("What is ur strength?");

        int strength2 = friday.nextInt();
        friday.nextLine();
        System.out.println("What is ur agility?");

        int agility2 = friday.nextInt();
        friday.nextLine();
        int powerScore = (strength2 * 2) + agility2 + (age2 / 2);
        System.out.println("Welcome, " + name2 + " the " + john + "!\nYour Power Score is: " + powerScore);


        int magic = (int) (Math.random() * 100) + 1;
        System.out.println("Lets see if u catch me!");
        double guess3 = friday.nextInt();
        if (guess3 == magic) {System.out.println("Ohhh! u got me here");
        } else {
            System.out.println("keep trying!");
        }



        }
}
