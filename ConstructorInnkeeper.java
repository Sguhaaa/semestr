

public class ConstructorInnkeeper {

    private static int HP = 3;
    private String name;
    private static String achievement;


    public ConstructorInnkeeper(String name, int HP, String achievement) {
        this.name = name;
        this.HP = HP;
        this.achievement = achievement;
    }

    public void newInnkeeper(){
        ConstructorInnkeeper innkeeper_1 = new ConstructorInnkeeper("Трактирщик", 3, "");
    }

    public static void changeHP() throws InterruptedException {
            HP -=1;
        Thread.sleep(3000);
            System.out.println("\n*Остаток вашего здоровья: " +  HP + "*");


        if (HP == 0){
            System.out.println("*Нам жаль сообщать, но вы умерли.*");
            System.out.println("\n*На данном этапе вы могли получить следующие достижения:*");
            changeAchievement();

            System.exit(0);
        }

    }

    private static void changeAchievement() throws InterruptedException {
        String listAchievement[] = new String[3];

        listAchievement[0] = "Открыватель порталов";
        listAchievement[1] = "Смэрть";
        listAchievement[2] = "Пиво";

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            System.out.println("\n"+listAchievement[i]);
        }

    }

}
