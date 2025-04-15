public class method_Exercise1 {
    public static void main(String[] args) {
        john();
        displayName("john");
       showLevel(34);
        showLevel(67);
        attack("jonathan","johnny");
        attack("britney","messi");
        foundItem("mane","pizza");
        foundItem("leo","shield");
        foundItem("yordanos","sword");
        castSpell("fireball","healing", 12);
        gameOver("dave");
        displayInventory("babatunde",12);
        enterDungeon("john","The Dark Tunnel");
        enterDungeon("alex","The Quiet Cave");
        victoryDance("garcia");


    }
    //1

    public static void john(){
        System.out.println("Welcome to code Quest!");
    }

    //2
    public static void displayName(String playerName){
     System.out.println("player joined: " + playerName );
 }
 //3
    public static void showLevel(int level){
      System.out.println("level:" + level);
    }

    //4
    public static void attack(String attacker, String target){
       System.out.println(attacker + " attacks " +target);
    }

    //5
    public static void foundItem(String player, String item){
     System.out.println( player + " found a: " + item + "!");
 }

 //6
    public static void castSpell(String wizard, String spellName, int manaCost){
        System.out.println(wizard + "casts" + spellName + " costing " + manaCost + "mana!");
    }

//7
    public static void gameOver(String player){
        System.out.println("GAME OVER for " + player + "!");
    }
//8
     public static void displayInventory(String player, int itemCount){
         System.out.println(player + " has " + itemCount + " items in inventory.");
     }

  //9
   public static void enterDungeon(String player, String dungeonName){
       System.out.println(player + " bravely enters the " + dungeonName);
   }

   //10
    public static void victoryDance(String player){
        System.out.println( player + " does a little victory dance!");
    }

    //11





}
