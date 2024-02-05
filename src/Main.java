import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(new File("hz.txt"));
            int i = 1;
            while (scanner.hasNextLine()) {
                System.out.print(i + ": ");
                System.out.println(scanner.nextLine());
                i++;
                scanner.close();
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл не найден!");
        } catch (Exception e) {
            throw new Exception("Что - то пошло не так");
        }
    }
}
