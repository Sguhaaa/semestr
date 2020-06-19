import java.io.IOException;

public class Tavern_game {

    public static boolean DwarvesLoveBeer = true;

    public static void main(String[] args) throws IOException, InterruptedException, EnterSelectionExceptions {

        beginning(); //шапка игры

        while (DwarvesLoveBeer){
            Lore.conclusion_lore(); //лор таверны без персонажа
            СonstructorCharacter.new_сharacter(); //генерим персонажа из дока
            LoreCharacter.new_lore_tavern(); //генерим лор таверны с этим персонажем
        }


    }

    public static void beginning() throws InterruptedException, IOException {
        System.out.println("Привет, трактирщик.");
        Thread.sleep(2000);
        System.out.println("Просто наблюдай за жизнью своей таверны...");
        Thread.sleep(2000);
        System.out.println("И постарайся не умереть.");
    }


}
