import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Hier mag je je code schrijven voor de hoofd-opdracht

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"één", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator translator = new Translator(alphabetic, numeric);

        boolean play = true;
        String ongeldig = "ongeldige invoer";
        Scanner scanner = new Scanner(System.in);


        int number;

        System.out.println("Type 'x' om te stoppen \n Type 'v' om te vertalen");

        while (play) {
        String input = scanner.nextLine();

            if (Objects.equals(input, "x")) {
                play = false;
            } else if (Objects.equals(input, "v")) {
                System.out.println("Type een cijfer van 0 t/m 9");
                number = scanner.nextInt();
                scanner.nextLine();
                if (number < 10) {
                    String result = translator.Translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                } else {
                    System.out.println(ongeldig);
                }
            } else {
                System.out.println(ongeldig);
            }

        }





    }
}
