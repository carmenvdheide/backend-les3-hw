import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class Bonus {
//
    public static void main(String[] args) {

        HashSet<Integer> secretNumber = randomNumberGenerator();
        String stringNumber = setToStringConverter(secretNumber);
//        System.out.println(stringNumber);
        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");


//        programma gaat door tot de juiste combi is geraden
        while (!feedback(stringNumber).equals("gefeliciteerd je hebt het goed")) {
            System.out.println(feedback(stringNumber));
        }
    }

    private static String setToStringConverter(HashSet<Integer> secretNumber) {
        StringBuilder sb = new StringBuilder();

        for (Integer number : secretNumber) {
            sb.append(number);
        }

        return sb.toString();
    }

    private static HashSet<Integer> randomNumberGenerator() {
        Random random = new Random();
        HashSet<Integer> randomHashSet = new HashSet<>();

        while (randomHashSet.size() < 4) {
            randomHashSet.add(random.nextInt(10));
        }

        return randomHashSet;
    }

    public static String feedback(String stringNumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedbackString = new StringBuilder();

        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringNumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringNumber.substring(i, i + 1))) {
                    feedbackString.append("+");
                } else if (stringNumber.contains(guess.substring(i, i + 1))) {
                    feedbackString.append("0");
                } else {
                    feedbackString.append("X");
                }
            }
        }
        System.out.println(feedbackString.toString());
        return feedbackString.toString();

    }
}
