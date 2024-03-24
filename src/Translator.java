import java.util.HashMap;

public class Translator {
    private HashMap<Integer, String> translateNumbers = new HashMap<Integer, String>();

    public Translator(HashMap<Integer, String> translateNumbers) {
        this.translateNumbers = translateNumbers;
    }

    public Translator() {
    }

    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < numeric.length; i++) {
            translateNumbers.put(numeric[i], alphabetic[i]);
        }
    }
    public String Translate(Integer number) {
        return translateNumbers.get(number);
    }

    public HashMap<Integer, String> getTranslateNumbers() {
        return translateNumbers;
    }

    public void setTranslateNumbers(HashMap<Integer, String> translateNumbers) {
        this.translateNumbers = translateNumbers;
    }
}
