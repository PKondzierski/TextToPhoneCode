import java.lang.module.Configuration;
import java.util.HashMap;
import java.util.Objects;

public class OldFashionKeyboard implements Keyboard {

    public HashMap<String, String> configuration = new HashMap<>();

    public OldFashionKeyboard(Alphabet alphabet) {
        fillHashMap(alphabet);
    }

    @Override
    public String codeText(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            stringBuilder.append(configuration.get(String.valueOf(text.charAt(i))));
            stringBuilder.append(" ");
        }
        
        return stringBuilder.toString();
    }

    @Override
    public String getCodedText(String text) {
        if (Objects.nonNull(text) && text.length() != 0) {
            return codeText(text.toUpperCase());
        } else return "There is not text to code";
    }

    private void fillHashMap(Alphabet alphabet) {
        int i = 2;
        StringBuilder stringBuilder = new StringBuilder();

        for (int j = 0; j < alphabet.getAlphabet().size(); ) {

            if (i == 7 || i == 9) {
                for (int k = 0; k < 4; k++) {
                    stringBuilder.append(i);
                    configuration.put(alphabet.getAlphabet().get(j + k), stringBuilder.toString());
                }
                j += 4;
            } else {
                for (int k = 0; k < 3; k++) {
                    stringBuilder.append(i);
                    configuration.put(alphabet.getAlphabet().get(j + k), stringBuilder.toString());
                }
                j += 3;
            }
            i++;
            stringBuilder = new StringBuilder();
        }
    }
}

