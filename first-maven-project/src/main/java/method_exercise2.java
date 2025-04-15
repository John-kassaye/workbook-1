import java.util.Scanner;

public class method_exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String josh = "yohannes";
        String name2 = getPlayerTitle(josh);
        System.out.println(getPlayerTitle("rock"));
        int xp = 25;
        int xp2 = doubleXP(xp);
        System.out.println(xp);
        System.out.println(xp2);
        int currentxp = 36;
        int threshold = 44;
        boolean right = hasLeveledUp(currentxp, threshold);
        if (right == true) {
            System.out.println("u leveled up");
        } else {
             System.out.println("keep grinding");
        }
        System.out.println(random());
        System.out.println(random());
        System.out.println(random());;

        System.out.println(calculateDamage(2, 23));
        System.out.println(canOpenChest(true,false));
        System.out.println(canOpenChest(true,true));
        System.out.println(canOpenChest(false,true));
        System.out.println(canOpenChest(false,false));

        System.out.println("Choose your class:\n1 → Warrior\n2 → Mage\n3 → Rogue\nEnter the number of your choice:");
        System.out.println("1 → Warrior");
        System.out.println("2 → Mage");
        System.out.println("3 → Rogue");
        System.out.print("Enter the number of your choice: ");

        int choice = input.nextInt();  // Get user input

        String playerClass = getPlayerClass(choice);  // Call method
        System.out.println("You have chosen: " + getPlayerClass(choice));

        int currentGold = 200;
        int deduct = 0;
        System.out.println("How many gold did u manage to find?");
        int goldFound = input.nextInt();
        System.out.println(addGold(goldFound, currentGold));

        System.out.println("How many tasks have you completed?");
        int tasksDone = input.nextInt();
        System.out.print("What is the total number of tasks? ");
        int totalTasks = input.nextInt();

        if (isQuestComplete(tasksDone, totalTasks)) {
            System.out.println(" Quest complete!");
        } else {
            System.out.println(" Keep going!");
        }
        System.out.println(isBossDefeated(23,44,false));

    }

    //1
    public static String getPlayerTitle(String josh) {
        return ("lord " + josh);
    }

    //2
    public static int doubleXP(int xp) {
        return (2 * xp);
    }

    //3
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        if (currentXP >= threshold) {
            return (true);
        } else {
            return (false);
        }
    }

    //4
    public static int random() {
        return (int) (Math.random() * 6) + 1;
    }

    //5
    public static int calculateDamage(int strength, int enemyDefense) {
        int johh = (strength * 2) - enemyDefense;
        if (johh < 0) {
            return 0;
        } else{
       return johh;
        } }
    //6
    public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken){
        if(hasKey==true || lockIsBroken==false){
            return true;
        }else{
            return false;
        }

    }
    //7
    public static String getPlayerClass(int choice) {
        if (choice == 1) {
            return "Warrior";
        } else if (choice == 2) {
            return "Mage";
        } else if (choice == 3) {
            return "Rogue";
        } else {
            return "Peasant";
        }
    }
    //8

    public static int addGold(int currentGold, int goldFound){
        int bonus = 0;
        if (goldFound > 100){
            bonus = (int) (goldFound * 0.10);
            goldFound+= bonus + currentGold;
            return goldFound;
        }else{
            return currentGold + goldFound;
        }
    }

    //9
     public static boolean isQuestComplete(int tasksDone, int totalTasks){
        if(tasksDone==totalTasks){
          return true;
      } else{
          return false;
      }

     }

//10
   public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion){
        if(bossHP <= 0){
            return true;
        }else if(playerHP <= 0 && usedPotion) {
            return false;
        }else if(usedPotion==true){
            playerHP+= 50;}
            return playerHP > bossHP;



       }
   }






