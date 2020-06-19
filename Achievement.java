public class Achievement{

    public static boolean achievement_1 = false; //открыть портал

    public static void go_achievement() throws InterruptedException {

        Portal f = new Portal();

        Thread.sleep(1000);
        if (f.achievement_portal==1 && achievement_1==false){
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Вы получили достижение: открыватель порталов");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            achievement_1 = true;
        };
    }



}


