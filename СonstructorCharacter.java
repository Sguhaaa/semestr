import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class СonstructorCharacter {

    public static String character;
    public СonstructorCharacter(){}
    public СonstructorCharacter(int count){ // конструктор
        this.character=character;
    }

    public static void new_сharacter() throws IOException, InterruptedException {

        File characterFromFile =
                new File("C:\\Users\\kater\\IdeaProjects\\Tavern_simulator\\resources\\characters.txt");
        FileReader characterFileReader = new FileReader(characterFromFile);
        LineNumberReader lineNumberReader = new LineNumberReader(characterFileReader);

        int characterLineNumber = 0;
        while (lineNumberReader.readLine() != null){
            characterLineNumber++;
        }
        characterLineNumber-=1;
        //lineNumberReader.close();

        int character_string = (int) (Math.random() * ((characterLineNumber - 0) + 1) + 0);

        Thread.sleep(3000);

        try (Stream<String> lines =
                     Files.lines(Paths.get("C:\\Users\\kater\\IdeaProjects\\Tavern_simulator\\resources\\characters.txt"))) {
            character = lines.skip(character_string).findFirst().get();
            System.out.println("\n>> В таверну зашёл " + character);
        }
    }

}
