import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream; 

class JavaLearn {
    public static void main(String[] args) {
        String color = " red ";
        // String blank check
        System.out.println(color.isBlank());
        // String repeat
        System.out.println(color.repeat(4));
        // String trim blank space front and rear
        System.out.println(color.strip());
        // String trim blank space front
        System.out.println(color.stripLeading());
        // String trim blank space rear
        System.out.println(color.stripTrailing());

        try {
            Path filePath = Paths.get("D:/krishna/workspace/java/mydoc.txt");
            String docContent = Files.readString(filePath);
            System.out.println("------start----------\n"+docContent+"\n------end--------");
        } catch (Exception e) {
            System.out.println(e);
        }

        // String of things to list of things
        String colors = "red\ngreen\norange";
        System.out.println(colors.lines().collect(Collectors.toList()));

        //Check String has value or not
        Optional missile = Optional.of("brahmos");
        System.out.println(missile.isEmpty());

        //local variable
        IntStream.of(9,8,7)
        .filter((var num) -> num % 2 == 0)
        .forEach(System.out::println);

    }
}