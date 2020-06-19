import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Lore {

    public static void conclusion_lore () throws IOException, InterruptedException, EnterSelectionExceptions {

        Line.beautiful_line();
        System.out.println("Что происходит в твоей таверне сейчас:\n");

        //вытаскивать кол-во строк
        File loreFile =new File("C:\\Users\\kater\\IdeaProjects\\Tavern_simulator\\resources\\lore.txt");
        FileReader loreFileReader = new FileReader(loreFile);
        LineNumberReader lineNumberReader = new LineNumberReader(loreFileReader);

        int loreLineNumber = 0;
        while (lineNumberReader.readLine() != null){
            loreLineNumber++;
        }

        loreLineNumber-=1;
        lineNumberReader.close();

        for (int i = 0; i < 5; i++) {

            int lore_string = (int) (Math.random() * ((loreLineNumber - 0) + 1) + 0);

            Thread.sleep(3000);

            try (Stream<String> lines =
                         Files.lines(Paths.get("C:\\Users\\kater\\IdeaProjects\\Tavern_simulator\\resources\\lore.txt"))) {
                String lore = lines.skip(lore_string).findFirst().get();
                System.out.println(">> " + lore);
            }

        }

        Portal.generation_portal();

    }

}
