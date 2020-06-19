import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class LoreCharacter {

    private static СonstructorCharacter c;
    private static int lineNumber;
    private static int doc_character = (int) (Math.random() * ((1 - 1) + 1) + 1);
    public static String lore_сharacter;

    public static void new_lore_tavern() throws IOException, InterruptedException, EnterSelectionExceptions {

        ready_lore_character();
        lore_dialoge_character ();

    }

    private static void ready_lore_character () throws IOException {

        //лор таверны с персонажем прописанный
        File myFile =
                new File("C:\\Users\\kater\\IdeaProjects\\Tavern_simulator\\resources\\scripts\\" + c.character + "-" + doc_character + ".txt");
        FileReader fileReader = new FileReader(myFile);
        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

        lineNumber = 0;

        while (lineNumberReader.readLine() != null) {
            random_lore_character ();
        }

    }

    private static void random_lore_character (){

        //лор таверны с персонажем случайный

        try (Stream<String> lines =
                     Files.lines(Paths.get(
                             "C:\\Users\\kater\\IdeaProjects\\Tavern_simulator\\resources\\scripts\\" + c.character + "-" + doc_character + ".txt"))) {
            String lore_сharacter = lines.skip(lineNumber).findFirst().get();
            Thread.sleep(3000);
            System.out.println(">> " + lore_сharacter);
            lineNumber++;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }

    private static void lore_dialoge_character() throws IOException, InterruptedException, EnterSelectionExceptions {

        Scanner in_dialog = new Scanner(System.in);
        Thread.sleep(3000);
        System.out.println("\n*" + c.character + " хочет заговорить с вами*\n"
                + "\n1. Завести разговор"
                + "\n2. Игнорировать");

        int num2 = in_dialog.nextInt();

        if (num2 == 1) {
            System.out.println(">> диалоджи");
            //conversation_character();
        } else {
            File ignoreCharacterFile = new File("C:\\Users\\kater\\IdeaProjects\\Tavern_simulator\\resources\\scripts\\" + c.character + "-1-renouncement.txt");
            FileReader ignoreCharacterFileReader = new FileReader(ignoreCharacterFile);
            LineNumberReader lineNumberReader2 = new LineNumberReader(ignoreCharacterFileReader);

            int lineNumber2 = 0;

            while (lineNumberReader2.readLine() != null) {

                try (Stream<String> lines =
                             Files.lines(Paths.get("C:\\Users\\kater\\IdeaProjects\\Tavern_simulator\\resources\\scripts\\" + c.character + "-1-renouncement.txt"))) {
                    lore_сharacter = lines.skip(lineNumber2).findFirst().get();
                    Thread.sleep(3000);
                    System.out.println(">> " + lore_сharacter);
                    lineNumber2++;
                }

                if (lore_сharacter.contains("Вы потеряли часть здоровья.")){
                    ConstructorInnkeeper.changeHP();
                }
                if (lore_сharacter.contains("Ваше здоровье пополнилось")){
                    ConstructorInnkeeper.changeHP();
                }
            }

            Lore.conclusion_lore();
        }

    }

}
