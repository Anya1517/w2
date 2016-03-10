import java.util.Scanner;

/**
 * Created by kml_c_16 on 3/10/2016.
 */
public class RunScanner {
    public static void main(String[] args)
    {

        System.out.println("Введите ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.next();
        System.out.println("Имя" + name);
    }
}
