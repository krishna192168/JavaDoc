import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors; 

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
            System.out.println("doc=>"+docContent);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

        // String of things to list of things
        String colors = "red\ngreen\norange";
        System.out.println(colors.lines().collect(Collectors.toList()));
    }
}