import java.io.IOException;
import java.util.Scanner;

public class Portal {

    public static int achievement_portal;
    public Portal(){}
    public Portal(int achievement_portal){ // конструктор
        this.achievement_portal=achievement_portal;
    }

    public static void generation_portal() throws InterruptedException, IOException, EnterSelectionExceptions {

        Thread.sleep(3000);
        System.out.println("\n*РАЗДАЛСЯ ГРОМ*");
        Thread.sleep(1000);
        System.out.println("*ВСПЫШКА СВЕТА*");
        Thread.sleep(1000);
        System.out.println("*СТЕНЫ ТАВЕРНЫ ДРОЖАТ*");
        Thread.sleep(2000);

        Scanner in_portal = new Scanner(System.in);
        System.out.println("*НОВЫЙ ПОСЕТИТЕЛЬ ПРОСИТ ОТКРЫТЬ ПОРТАЛ*\n"
                +"\n1. Хочу открыть портал"
                +"\n2. Не хочу открыть портал");

        int num = in_portal.nextInt();


        if (num == 1) {
            achievement_portal = 1;
            Achievement.go_achievement();
        }
        else if (num == 2) {
            Lore.conclusion_lore();}
        else {throw new EnterSelectionExceptions();}

    }
}
