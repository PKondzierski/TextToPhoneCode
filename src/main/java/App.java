import java.util.Map;

public class App {
    public static void main(String[] args) {

        Alphabet alphabet = new EnglishAlphabet();
        OldFashionKeyboard keyboard = new OldFashionKeyboard(alphabet);
        System.out.println(keyboard.getCodedText("Przemyslaw"));

/*
        for (Map.Entry<String, String> entry : keyboard.configuration.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            System.out.println(key + " : " +value);
        }*/
    }
}
